#!/bin/bash

# ============================================================================
# HE IPv6 Tunnel 一键配置脚本 for systemd-networkd v2.0
# 使用 systemd service 创建隧道 + networkd 配置地址路由
# ============================================================================

# 颜色
RED='\033[0;31m'
GREEN='\033[0;32m'
YELLOW='\033[1;33m'
BLUE='\033[0;34m'
CYAN='\033[0;36m'
NC='\033[0m'

# 日志函数
log_info() { echo -e "${GREEN}[INFO]${NC} $1"; }
log_warn() { echo -e "${YELLOW}[WARN]${NC} $1"; }
log_error() { echo -e "${RED}[ERROR]${NC} $1"; }
log_step() { echo -e "${BLUE}[STEP]${NC} $1"; }

# 默认值
TUNNEL_NAME="he-ipv6"
TUNNEL_TTL=255
NATIVE_METRIC=100
HE_METRIC=1000
RT_TABLE_HE=100

# 全局变量
HE_ADDRESS=""
HE_NETMASK="64"
HE_ENDPOINT=""
HE_LOCAL=""
HE_GATEWAY=""
NATIVE_IPV6=""
NATIVE_IPV6_IFACE=""

# ============================================================================
# 基础检查函数
# ============================================================================

check_root() {
    if [[ $EUID -ne 0 ]]; then
        log_error "需要 root 权限运行"
        exit 1
    fi
    log_info "root 权限检查通过"
}

check_networkd() {
    if ! systemctl is-active --quiet systemd-networkd; then
        log_error "systemd-networkd 未运行，请先配置 systemd-networkd"
        exit 1
    fi
    log_info "systemd-networkd 运行中"
}

# ============================================================================
# 模块和配置文件准备
# ============================================================================

setup_sit_module() {
    log_step "配置 sit 内核模块..."
    
    # 创建目录
    mkdir -p /etc/modules-load.d
    
    # 开机自动加载
    echo "sit" > /etc/modules-load.d/sit.conf
    log_info "已配置开机自动加载 sit 模块"
    
    # 立即加载
    if ! lsmod | grep -q "^sit "; then
        modprobe sit || {
            log_error "无法加载 sit 模块"
            exit 1
        }
        log_info "已加载 sit 模块"
    else
        log_info "sit 模块已加载"
    fi
}

setup_rt_tables() {
    log_step "配置路由表..."
    
    mkdir -p /etc/iproute2
    
    # 创建 rt_tables 如果不存在
    if [[ ! -f /etc/iproute2/rt_tables ]]; then
        cat > /etc/iproute2/rt_tables << 'EOF'
255     local
254     main
253     default
0       unspec
EOF
        log_info "创建 /etc/iproute2/rt_tables"
    fi
    
    # 添加 he_tunnel 表
    if ! grep -q "^${RT_TABLE_HE}[[:space:]]" /etc/iproute2/rt_tables; then
        echo "${RT_TABLE_HE}    he_tunnel" >> /etc/iproute2/rt_tables
        log_info "添加路由表 ${RT_TABLE_HE} he_tunnel"
    fi
}

# ============================================================================
# 检测函数
# ============================================================================

detect_native_ipv6() {
    log_step "检测原生 IPv6..."
    
    NATIVE_IPV6=""
    NATIVE_IPV6_IFACE=""
    
    # 遍历网络接口
    local ifaces
    ifaces=$(ip -o link show | awk -F': ' '{print $2}' | cut -d'@' -f1)
    
    for iface in $ifaces; do
        # 跳过特殊接口
        case "$iface" in
            lo|he*|sit*|tun*|tap*|docker*|veth*|br-*|virbr*) continue ;;
        esac
        
        # 获取全局 IPv6 地址
        local addr
        addr=$(ip -6 addr show dev "$iface" scope global 2>/dev/null | grep -oP 'inet6 \K[^/]+' | grep -v "^fe80" | head -1)
        
        if [[ -n "$addr" ]]; then
            NATIVE_IPV6="$addr"
            NATIVE_IPV6_IFACE="$iface"
            log_info "检测到原生 IPv6: $NATIVE_IPV6 (接口: $NATIVE_IPV6_IFACE)"
            return 0
        fi
    done
    
    log_info "未检测到原生 IPv6"
    return 1
}

detect_local_ipv4() {
    # 获取出口 IPv4
    LOCAL_IPV4=$(ip -4 route get 8.8.8.8 2>/dev/null | grep -oP 'src \K[0-9.]+' | head -1)
    
    if [[ -z "$LOCAL_IPV4" ]]; then
        LOCAL_IPV4=$(ip -4 addr show scope global 2>/dev/null | grep -oP 'inet \K[0-9.]+' | head -1)
    fi
}

# ============================================================================
# 配置输入
# ============================================================================

parse_ifupdown_config() {
    local config="$1"
    
    while IFS= read -r line; do
        # 去除空格
        line=$(echo "$line" | sed 's/^[[:space:]]*//;s/[[:space:]]*$//')
        
        # 跳过空行和注释
        [[ -z "$line" || "$line" == \#* ]] && continue
        
        # 解析
        case "$line" in
            iface\ *)
                TUNNEL_NAME=$(echo "$line" | awk '{print $2}')
                ;;
            address\ *)
                HE_ADDRESS=$(echo "$line" | awk '{print $2}')
                ;;
            netmask\ *)
                HE_NETMASK=$(echo "$line" | awk '{print $2}')
                ;;
            endpoint\ *)
                HE_ENDPOINT=$(echo "$line" | awk '{print $2}')
                ;;
            local\ *)
                HE_LOCAL=$(echo "$line" | awk '{print $2}')
                ;;
            ttl\ *)
                TUNNEL_TTL=$(echo "$line" | awk '{print $2}')
                ;;
            gateway\ *)
                HE_GATEWAY=$(echo "$line" | awk '{print $2}')
                ;;
        esac
    done <<< "$config"
}

input_config() {
    echo ""
    echo -e "${CYAN}=== HE IPv6 隧道配置 ===${NC}"
    echo ""
    echo "选择输入方式:"
    echo "  1) 粘贴 ifupdown 格式配置"
    echo "  2) 逐项手动输入"
    echo ""
    
    local choice
    read -rp "请选择 [1/2]: " choice
    
    case "$choice" in
        1)
            echo ""
            echo -e "${YELLOW}请粘贴配置（输入空行结束）:${NC}"
            local config=""
            local line
            while IFS= read -r line; do
                [[ -z "$line" ]] && break
                config+="$line"$'\n'
            done
            parse_ifupdown_config "$config"
            ;;
        2)
            echo ""
            read -rp "隧道名称 [$TUNNEL_NAME]: " input
            [[ -n "$input" ]] && TUNNEL_NAME="$input"
            
            read -rp "隧道 IPv6 地址: " HE_ADDRESS
            
            read -rp "前缀长度 [64]: " input
            [[ -n "$input" ]] && HE_NETMASK="$input"
            
            read -rp "HE 服务器端点 (IPv4): " HE_ENDPOINT
            
            detect_local_ipv4
            read -rp "本地 IPv4 [$LOCAL_IPV4]: " input
            [[ -n "$input" ]] && HE_LOCAL="$input" || HE_LOCAL="$LOCAL_IPV4"
            
            read -rp "TTL [$TUNNEL_TTL]: " input
            [[ -n "$input" ]] && TUNNEL_TTL="$input"
            
            read -rp "隧道网关: " HE_GATEWAY
            ;;
        *)
            log_error "无效选择"
            exit 1
            ;;
    esac
    
    # 如果没有设置本地 IP，自动检测
    if [[ -z "$HE_LOCAL" ]]; then
        detect_local_ipv4
        HE_LOCAL="$LOCAL_IPV4"
    fi
}

validate_config() {
    log_step "验证配置..."
    
    local valid=true
    
    [[ -z "$HE_ADDRESS" ]] && { log_error "缺少隧道 IPv6 地址"; valid=false; }
    [[ -z "$HE_ENDPOINT" ]] && { log_error "缺少 HE 服务器端点"; valid=false; }
    [[ -z "$HE_LOCAL" ]] && { log_error "缺少本地 IPv4 地址"; valid=false; }
    [[ -z "$HE_GATEWAY" ]] && { log_error "缺少隧道网关"; valid=false; }
    
    [[ "$valid" != "true" ]] && exit 1
    
    # 显示配置
    echo ""
    echo "=========================================="
    echo -e "${BLUE}配置摘要${NC}"
    echo "=========================================="
    echo "隧道名称:    $TUNNEL_NAME"
    echo "IPv6 地址:   $HE_ADDRESS/$HE_NETMASK"
    echo "IPv6 网关:   $HE_GATEWAY"
    echo "HE 端点:     $HE_ENDPOINT"
    echo "本地 IPv4:   $HE_LOCAL"
    echo "TTL:         $TUNNEL_TTL"
    
    if [[ -n "$NATIVE_IPV6" ]]; then
        echo ""
        echo -e "${YELLOW}双栈模式配置:${NC}"
        echo "  原生 IPv6:    $NATIVE_IPV6 ($NATIVE_IPV6_IFACE)"
        echo "  原生 metric:  $NATIVE_METRIC"
        echo "  HE metric:    $HE_METRIC"
        echo "  策略路由:     启用"
    fi
    echo "=========================================="
    echo ""
}

# ============================================================================
# 清理旧配置
# ============================================================================

cleanup_old() {
    log_step "清理旧配置..."
    
    # 停止旧服务
    if systemctl is-active --quiet "${TUNNEL_NAME}.service" 2>/dev/null; then
        systemctl stop "${TUNNEL_NAME}.service"
        log_info "已停止旧服务"
    fi
    
    # 删除旧隧道
    if ip link show "$TUNNEL_NAME" &>/dev/null; then
        ip tunnel del "$TUNNEL_NAME" 2>/dev/null || true
        log_info "已删除旧隧道"
    fi
    
    # 备份旧文件
    local ts
    ts=$(date +%Y%m%d-%H%M%S)
    
    for f in /etc/systemd/system/${TUNNEL_NAME}.service \
             /etc/systemd/network/50-${TUNNEL_NAME}.netdev \
             /etc/systemd/network/50-${TUNNEL_NAME}.network; do
        [[ -f "$f" ]] && mv "$f" "${f}.bak.${ts}"
    done
}

# ============================================================================
# 生成配置文件
# ============================================================================

generate_service() {
    log_step "生成隧道服务..."
    
    cat > "/etc/systemd/system/${TUNNEL_NAME}.service" << EOF
[Unit]
Description=HE IPv6 Tunnel - $TUNNEL_NAME
After=network-online.target systemd-networkd.service
Wants=network-online.target

[Service]
Type=oneshot
RemainAfterExit=yes

ExecStart=/sbin/modprobe sit
ExecStart=/sbin/ip tunnel add $TUNNEL_NAME mode sit remote $HE_ENDPOINT local $HE_LOCAL ttl $TUNNEL_TTL
ExecStart=/sbin/ip link set $TUNNEL_NAME mtu 1480
ExecStart=/sbin/ip link set $TUNNEL_NAME up

ExecStop=/sbin/ip tunnel del $TUNNEL_NAME

[Install]
WantedBy=multi-user.target
EOF
    
    log_info "生成: /etc/systemd/system/${TUNNEL_NAME}.service"
}

generate_network() {
    log_step "生成网络配置..."
    
    local network_file="/etc/systemd/network/50-${TUNNEL_NAME}.network"
    
    cat > "$network_file" << EOF
# HE IPv6 Tunnel Network Config
# Generated: $(date)

[Match]
Name=$TUNNEL_NAME

[Network]
Address=${HE_ADDRESS}/${HE_NETMASK}
IPv6Forwarding=yes

[Route]
Gateway=$HE_GATEWAY
Metric=$HE_METRIC
EOF
    
    # 如果有原生 IPv6，添加策略路由
    if [[ -n "$NATIVE_IPV6" ]]; then
        cat >> "$network_file" << EOF

# 策略路由：从 HE 地址出去的流量走 HE 隧道
[RoutingPolicyRule]
From=${HE_ADDRESS}
Table=$RT_TABLE_HE
Priority=100

[Route]
Gateway=$HE_GATEWAY
Table=$RT_TABLE_HE
EOF
    fi
    
    log_info "生成: $network_file"
}

update_native_metric() {
    [[ -z "$NATIVE_IPV6_IFACE" ]] && return
    
    log_step "更新原生 IPv6 metric..."
    
    # 查找配置文件
    local native_config=""
    for f in /etc/systemd/network/*.network; do
        [[ ! -f "$f" ]] && continue
        if grep -q "Name=${NATIVE_IPV6_IFACE}$" "$f" 2>/dev/null; then
            native_config="$f"
            break
        fi
    done
    
    if [[ -z "$native_config" ]]; then
        log_warn "未找到 $NATIVE_IPV6_IFACE 的配置文件，跳过"
        return
    fi
    
    # 获取原生网关
    local native_gw
    native_gw=$(ip -6 route show default dev "$NATIVE_IPV6_IFACE" 2>/dev/null | awk '{print $3}' | head -1)
    
    if [[ -n "$native_gw" ]] && ! grep -q "^Metric=${NATIVE_METRIC}$" "$native_config"; then
        # 备份
        cp "$native_config" "${native_config}.bak"
        
        # 添加 metric
        cat >> "$native_config" << EOF

# Native IPv6 metric (by HE script)
[Route]
Gateway=$native_gw
Metric=$NATIVE_METRIC
EOF
        log_info "已设置原生 IPv6 metric: $NATIVE_METRIC"
    fi
}

generate_remove_script() {
    log_step "生成删除脚本..."
    
    cat > "/root/remove-${TUNNEL_NAME}.sh" << EOF
#!/bin/bash
echo "删除 HE IPv6 隧道: $TUNNEL_NAME"

systemctl stop ${TUNNEL_NAME}.service 2>/dev/null
systemctl disable ${TUNNEL_NAME}.service 2>/dev/null

rm -f /etc/systemd/system/${TUNNEL_NAME}.service
rm -f /etc/systemd/network/50-${TUNNEL_NAME}.netdev
rm -f /etc/systemd/network/50-${TUNNEL_NAME}.network

ip tunnel del $TUNNEL_NAME 2>/dev/null

systemctl daemon-reload
systemctl restart systemd-networkd

echo "删除完成！"
EOF
    
    chmod +x "/root/remove-${TUNNEL_NAME}.sh"
    log_info "生成: /root/remove-${TUNNEL_NAME}.sh"
}

# ============================================================================
# 应用和验证
# ============================================================================

apply_config() {
    log_step "应用配置..."
    
    # 重载 systemd
    systemctl daemon-reload
    
    # 启用并启动隧道服务
    systemctl enable "${TUNNEL_NAME}.service"
    systemctl start "${TUNNEL_NAME}.service"
    
    # 等待隧道创建
    sleep 2
    
    if ! ip link show "$TUNNEL_NAME" &>/dev/null; then
        log_error "隧道创建失败！"
        echo "查看日志: journalctl -u ${TUNNEL_NAME}.service"
        exit 1
    fi
    
    log_info "隧道已创建"
    
    # 重启 networkd 应用地址和路由
    systemctl restart systemd-networkd
    sleep 2
    
    log_info "配置已应用"
}

verify_tunnel() {
    log_step "验证隧道..."
    
    echo ""
    echo "=========================================="
    echo "隧道接口:"
    echo "=========================================="
    ip link show "$TUNNEL_NAME"
    
    echo ""
    echo "=========================================="
    echo "IPv6 地址:"
    echo "=========================================="
    ip -6 addr show dev "$TUNNEL_NAME"
    
    echo ""
    echo "=========================================="
    echo "IPv6 路由:"
    echo "=========================================="
    ip -6 route show | grep -E "(default|${TUNNEL_NAME})" | head -5
    
    if [[ -n "$NATIVE_IPV6" ]]; then
        echo ""
        echo "=========================================="
        echo "策略路由规则:"
        echo "=========================================="
        ip -6 rule show | head -5
    fi
    
    echo ""
    echo "=========================================="
    echo "连通性测试:"
    echo "=========================================="
    
    echo -n "Ping HE 网关: "
    if timeout 5 ping -6 -c 2 "$HE_GATEWAY" &>/dev/null; then
        echo -e "${GREEN}成功 ✓${NC}"
    else
        echo -e "${RED}失败 ✗${NC}"
    fi
    
    echo -n "Ping 外网 (源 $HE_ADDRESS): "
    if timeout 5 ping -6 -c 2 -I "$HE_ADDRESS" 2001:4860:4860::8888 &>/dev/null; then
        echo -e "${GREEN}成功 ✓${NC}"
    else
        echo -e "${YELLOW}失败${NC}"
    fi
    
    if [[ -n "$NATIVE_IPV6" ]]; then
        echo -n "Ping 外网 (源 $NATIVE_IPV6): "
        if timeout 5 ping -6 -c 2 -I "$NATIVE_IPV6" 2001:4860:4860::8888 &>/dev/null; then
            echo -e "${GREEN}成功 ✓${NC}"
        else
            echo -e "${YELLOW}失败${NC}"
        fi
    fi
    
    echo ""
}

show_result() {
    echo ""
    echo "=========================================="
    echo -e "${GREEN}HE IPv6 隧道配置完成！${NC}"
    echo "=========================================="
    echo ""
    echo "配置文件:"
    echo "  /etc/systemd/system/${TUNNEL_NAME}.service"
    echo "  /etc/systemd/network/50-${TUNNEL_NAME}.network"
    echo "  /etc/modules-load.d/sit.conf"
    echo ""
    echo "管理命令:"
    echo "  查看状态: systemctl status ${TUNNEL_NAME}"
    echo "  重启隧道: systemctl restart ${TUNNEL_NAME}"
    echo "  删除隧道: /root/remove-${TUNNEL_NAME}.sh"
    echo ""
    
    if [[ -n "$NATIVE_IPV6" ]]; then
        echo -e "${YELLOW}注意: 双栈模式已配置${NC}"
        echo "  - 默认出站使用原生 IPv6 (metric $NATIVE_METRIC)"
        echo "  - HE 隧道作为备用 (metric $HE_METRIC)"
        echo "  - 从 HE 地址发起的连接会正确回包"
        echo ""
    fi
}

# ============================================================================
# 主函数
# ============================================================================

main() {
    echo ""
    echo "=========================================="
    echo "HE IPv6 Tunnel 配置脚本 v2.0"
    echo "=========================================="
    echo ""
    
    # 基础检查
    check_root
    check_networkd
    
    # 准备工作
    setup_sit_module
    setup_rt_tables
    
    # 检测原生 IPv6
    detect_native_ipv6 || true
    
    # 输入配置
    input_config
    
    # 验证配置
    validate_config
    
    # 确认
    read -rp "是否继续配置? [y/N]: " confirm
    if [[ "$confirm" != "y" && "$confirm" != "Y" ]]; then
        log_info "已取消"
        exit 0
    fi
    
    # 执行配置
    cleanup_old
    generate_service
    generate_network
    update_native_metric
    generate_remove_script
    apply_config
    verify_tunnel
    show_result
}

# 运行
main "$@"
