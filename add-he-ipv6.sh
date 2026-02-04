#!/bin/bash

# ============================================================================
# HE IPv6 Tunnel 一键配置脚本 for systemd-networkd v2.1
# 使用 systemd service 创建隧道 + networkd 配置地址路由
# 修复：正确处理原生 IPv6 的 metric 配置
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
NATIVE_IPV6_GW=""

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
    
    mkdir -p /etc/modules-load.d
    echo "sit" > /etc/modules-load.d/sit.conf
    log_info "已配置开机自动加载 sit 模块"
    
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
    
    if [[ ! -f /etc/iproute2/rt_tables ]]; then
        cat > /etc/iproute2/rt_tables << 'EOF'
255     local
254     main
253     default
0       unspec
EOF
        log_info "创建 /etc/iproute2/rt_tables"
    fi
    
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
    NATIVE_IPV6_GW=""
    
    local ifaces
    ifaces=$(ip -o link show | awk -F': ' '{print $2}' | cut -d'@' -f1)
    
    for iface in $ifaces; do
        case "$iface" in
            lo|he*|sit*|tun*|tap*|docker*|veth*|br-*|virbr*) continue ;;
        esac
        
        local addr
        addr=$(ip -6 addr show dev "$iface" scope global 2>/dev/null | grep -oP 'inet6 \K[^/]+' | grep -v "^fe80" | head -1)
        
        if [[ -n "$addr" ]]; then
            NATIVE_IPV6="$addr"
            NATIVE_IPV6_IFACE="$iface"
            # 获取网关
            NATIVE_IPV6_GW=$(ip -6 route show default dev "$iface" 2>/dev/null | awk '/via/ {print $3}' | head -1)
            log_info "检测到原生 IPv6: $NATIVE_IPV6 (接口: $NATIVE_IPV6_IFACE)"
            [[ -n "$NATIVE_IPV6_GW" ]] && log_info "原生 IPv6 网关: $NATIVE_IPV6_GW"
            return 0
        fi
    done
    
    log_info "未检测到原生 IPv6"
    return 1
}

detect_local_ipv4() {
    LOCAL_IPV4=$(ip -4 route get 8.8.8.8 2>/dev/null | grep -oP 'src \K[0-9.]+' | head -1)
    [[ -z "$LOCAL_IPV4" ]] && LOCAL_IPV4=$(ip -4 addr show scope global 2>/dev/null | grep -oP 'inet \K[0-9.]+' | head -1)
}

# ============================================================================
# 配置输入
# ============================================================================

parse_ifupdown_config() {
    local config="$1"
    
    while IFS= read -r line; do
        line=$(echo "$line" | sed 's/^[[:space:]]*//;s/[[:space:]]*$//')
        [[ -z "$line" || "$line" == \#* ]] && continue
        
        case "$line" in
            iface\ *)      TUNNEL_NAME=$(echo "$line" | awk '{print $2}') ;;
            address\ *)    HE_ADDRESS=$(echo "$line" | awk '{print $2}') ;;
            netmask\ *)    HE_NETMASK=$(echo "$line" | awk '{print $2}') ;;
            endpoint\ *)   HE_ENDPOINT=$(echo "$line" | awk '{print $2}') ;;
            local\ *)      HE_LOCAL=$(echo "$line" | awk '{print $2}') ;;
            ttl\ *)        TUNNEL_TTL=$(echo "$line" | awk '{print $2}') ;;
            gateway\ *)    HE_GATEWAY=$(echo "$line" | awk '{print $2}') ;;
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
    
    [[ -z "$HE_LOCAL" ]] && { detect_local_ipv4; HE_LOCAL="$LOCAL_IPV4"; }
}

validate_config() {
    log_step "验证配置..."
    
    local valid=true
    
    [[ -z "$HE_ADDRESS" ]] && { log_error "缺少隧道 IPv6 地址"; valid=false; }
    [[ -z "$HE_ENDPOINT" ]] && { log_error "缺少 HE 服务器端点"; valid=false; }
    [[ -z "$HE_LOCAL" ]] && { log_error "缺少本地 IPv4 地址"; valid=false; }
    [[ -z "$HE_GATEWAY" ]] && { log_error "缺少隧道网关"; valid=false; }
    
    [[ "$valid" != "true" ]] && exit 1
    
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
        echo "  原生网关:     $NATIVE_IPV6_GW"
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
    
    if systemctl is-active --quiet "${TUNNEL_NAME}.service" 2>/dev/null; then
        systemctl stop "${TUNNEL_NAME}.service"
        log_info "已停止旧服务"
    fi
    
    if ip link show "$TUNNEL_NAME" &>/dev/null; then
        ip tunnel del "$TUNNEL_NAME" 2>/dev/null || true
        log_info "已删除旧隧道"
    fi
    
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
    log_step "生成 HE 隧道网络配置..."
    
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
    
    if [[ -n "$NATIVE_IPV6" ]]; then
        cat >> "$network_file" << EOF

# 策略路由：从 HE 地址发出的流量走 HE 隧道
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

# ============================================================================
# 更新原生 IPv6 配置（重点修复）
# ============================================================================

update_native_metric() {
    [[ -z "$NATIVE_IPV6_IFACE" ]] && return
    [[ -z "$NATIVE_IPV6_GW" ]] && {
        log_warn "无法获取原生 IPv6 网关，跳过 metric 配置"
        return
    }
    
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
    
    log_info "更新配置文件: $native_config"
    
    # 备份
    cp "$native_config" "${native_config}.bak.$(date +%Y%m%d-%H%M%S)"
    
    # 读取原配置
    local temp_file="/tmp/network_config_temp.$$"
    local in_ipv6_route=false
    local ipv6_route_updated=false
    local skip_next_route=false
    
    > "$temp_file"
    
    while IFS= read -r line || [[ -n "$line" ]]; do
        # 检查是否是 [Route] 段
        if [[ "$line" == "[Route]" ]]; then
            # 先看下一行是否是 IPv6 网关
            in_ipv6_route=false
            echo "$line" >> "$temp_file"
            continue
        fi
        
        # 检查是否是 IPv6 网关行
        if [[ "$line" =~ ^Gateway=.*:.* ]] || [[ "$line" == "Gateway=$NATIVE_IPV6_GW" ]]; then
            in_ipv6_route=true
        fi
        
        # 如果在 IPv6 路由段，检查并添加/更新 Metric
        if [[ "$in_ipv6_route" == "true" ]]; then
            # 跳过旧的 Metric 行
            if [[ "$line" =~ ^Metric= ]]; then
                continue
            fi
            
            # 在 GatewayOnLink 后面或路由段结束前添加 Metric
            if [[ "$line" =~ ^GatewayOnLink= ]]; then
                echo "$line" >> "$temp_file"
                echo "Metric=$NATIVE_METRIC" >> "$temp_file"
                ipv6_route_updated=true
                in_ipv6_route=false
                continue
            fi
            
            # 如果遇到新段落或空行，在之前插入 Metric
            if [[ "$line" =~ ^\[.*\]$ ]] || [[ -z "$line" ]]; then
                if [[ "$ipv6_route_updated" != "true" ]]; then
                    echo "Metric=$NATIVE_METRIC" >> "$temp_file"
                    ipv6_route_updated=true
                fi
                in_ipv6_route=false
            fi
        fi
        
        # 跳过脚本之前添加的重复路由段
        if [[ "$line" == "# Native IPv6 metric (by HE script)" ]]; then
            skip_next_route=true
            continue
        fi
        
        if [[ "$skip_next_route" == "true" ]]; then
            if [[ "$line" =~ ^\[.*\]$ ]] && [[ "$line" != "[Route]" ]]; then
                skip_next_route=false
            elif [[ "$line" == "[Route]" ]]; then
                # 跳过整个 Route 段
                continue
            elif [[ -z "$line" ]]; then
                skip_next_route=false
                continue
            else
                continue
            fi
        fi
        
        echo "$line" >> "$temp_file"
        
    done < "$native_config"
    
    # 替换原文件
    mv "$temp_file" "$native_config"
    
    log_info "已更新原生 IPv6 路由 metric: $NATIVE_METRIC"
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
    
    systemctl daemon-reload
    
    systemctl enable "${TUNNEL_NAME}.service"
    systemctl start "${TUNNEL_NAME}.service"
    
    sleep 2
    
    if ! ip link show "$TUNNEL_NAME" &>/dev/null; then
        log_error "隧道创建失败！"
        echo "查看日志: journalctl -u ${TUNNEL_NAME}.service"
        exit 1
    fi
    
    log_info "隧道已创建"
    
    systemctl restart systemd-networkd
    sleep 3
    
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
    echo "IPv6 默认路由:"
    echo "=========================================="
    ip -6 route show default
    
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
    
    echo -n "HE 出站 (源 $HE_ADDRESS): "
    if timeout 5 ping -6 -c 2 -I "$HE_ADDRESS" 2001:4860:4860::8888 &>/dev/null; then
        echo -e "${GREEN}成功 ✓${NC}"
    else
        echo -e "${YELLOW}失败${NC}"
    fi
    
    if [[ -n "$NATIVE_IPV6" ]]; then
        echo -n "原生出站 (源 $NATIVE_IPV6): "
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
        echo -e "${YELLOW}双栈模式说明:${NC}"
        echo "  - 原生 IPv6 优先 (metric $NATIVE_METRIC)"
        echo "  - HE 隧道备用 (metric $HE_METRIC)"
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
    echo "HE IPv6 Tunnel 配置脚本 v2.1"
    echo "=========================================="
    echo ""
    
    check_root
    check_networkd
    
    setup_sit_module
    setup_rt_tables
    
    detect_native_ipv6 || true
    
    input_config
    validate_config
    
    read -rp "是否继续配置? [y/N]: " confirm
    if [[ "$confirm" != "y" && "$confirm" != "Y" ]]; then
        log_info "已取消"
        exit 0
    fi
    
    cleanup_old
    generate_service
    generate_network
    update_native_metric
    generate_remove_script
    apply_config
    verify_tunnel
    show_result
}

main "$@"
