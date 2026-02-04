#!/bin/bash

# ============================================================================
# HE IPv6 Tunnel 一键配置脚本 for systemd-networkd v1.3
# 使用 systemd service 创建隧道，解决 netdev 不工作的问题
# ============================================================================

set -e

RED='\033[0;31m'
GREEN='\033[0;32m'
YELLOW='\033[1;33m'
BLUE='\033[0;34m'
CYAN='\033[0;36m'
NC='\033[0m'

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

check_root() {
    [[ $EUID -ne 0 ]] && { log_error "需要 root 权限"; exit 1; }
}

check_networkd() {
    if ! systemctl is-active --quiet systemd-networkd; then
        log_error "systemd-networkd 未运行"
        exit 1
    fi
}

ensure_rt_tables() {
    if [[ ! -f /etc/iproute2/rt_tables ]]; then
        mkdir -p /etc/iproute2
        cat > /etc/iproute2/rt_tables << 'EOF'
255	local
254	main
253	default
0	unspec
EOF
    fi
}

ensure_sit_module() {
    if ! lsmod | grep -q "^sit"; then
        log_info "加载 sit 内核模块..."
        modprobe sit
        
        # 确保开机自动加载
        echo "sit" > /etc/modules-load.d/sit.conf
    fi
}

detect_native_ipv6() {
    log_step "检测原生 IPv6..."
    
    NATIVE_IPV6=""
    NATIVE_IPV6_IFACE=""
    
    for iface in $(ip -o link show | awk -F': ' '{print $2}' | cut -d'@' -f1); do
        [[ "$iface" == "lo" ]] && continue
        [[ "$iface" =~ ^he ]] && continue
        [[ "$iface" =~ ^sit ]] && continue
        [[ "$iface" =~ ^tun ]] && continue
        [[ "$iface" =~ ^docker ]] && continue
        [[ "$iface" =~ ^veth ]] && continue
        
        local addr=$(ip -6 addr show dev "$iface" scope global 2>/dev/null | grep -oP 'inet6 \K[^/]+' | head -1)
        
        if [[ -n "$addr" ]] && [[ ! "$addr" =~ ^fe80 ]]; then
            NATIVE_IPV6="$addr"
            NATIVE_IPV6_IFACE="$iface"
            break
        fi
    done
    
    if [[ -n "$NATIVE_IPV6" ]]; then
        log_info "检测到原生 IPv6: $NATIVE_IPV6 (接口: $NATIVE_IPV6_IFACE)"
        return 0
    else
        log_info "未检测到原生 IPv6"
        return 1
    fi
}

detect_local_ipv4() {
    LOCAL_IPV4=$(ip -4 route get 8.8.8.8 2>/dev/null | grep -oP 'src \K[0-9.]+' | head -1)
    [[ -z "$LOCAL_IPV4" ]] && LOCAL_IPV4=$(ip -4 addr show scope global | grep inet | head -1 | awk '{print $2}' | cut -d'/' -f1)
}

parse_ifupdown_config() {
    local config="$1"
    
    HE_ADDRESS=""
    HE_NETMASK="64"
    HE_ENDPOINT=""
    HE_LOCAL=""
    HE_TTL="$TUNNEL_TTL"
    HE_GATEWAY=""
    
    while IFS= read -r line; do
        line=$(echo "$line" | sed 's/^[[:space:]]*//;s/[[:space:]]*$//')
        [[ -z "$line" || "$line" =~ ^# ]] && continue
        
        if [[ "$line" =~ ^iface[[:space:]]+([^[:space:]]+) ]]; then
            TUNNEL_NAME="${BASH_REMATCH[1]}"
        elif [[ "$line" =~ ^address[[:space:]]+(.+) ]]; then
            HE_ADDRESS="${BASH_REMATCH[1]}"
        elif [[ "$line" =~ ^netmask[[:space:]]+(.+) ]]; then
            HE_NETMASK="${BASH_REMATCH[1]}"
        elif [[ "$line" =~ ^endpoint[[:space:]]+(.+) ]]; then
            HE_ENDPOINT="${BASH_REMATCH[1]}"
        elif [[ "$line" =~ ^local[[:space:]]+(.+) ]]; then
            HE_LOCAL="${BASH_REMATCH[1]}"
        elif [[ "$line" =~ ^ttl[[:space:]]+(.+) ]]; then
            HE_TTL="${BASH_REMATCH[1]}"
        elif [[ "$line" =~ ^gateway[[:space:]]+(.+) ]]; then
            HE_GATEWAY="${BASH_REMATCH[1]}"
        fi
    done <<< "$config"
}

interactive_input() {
    echo ""
    echo -e "${CYAN}请输入 HE IPv6 隧道配置${NC}"
    echo ""
    echo "选择输入方式:"
    echo "  1) 粘贴 ifupdown 格式配置"
    echo "  2) 逐项输入"
    echo ""
    echo -n "请选择 [1/2]: "
    read -r input_method
    
    if [[ "$input_method" == "1" ]]; then
        echo ""
        echo -e "${YELLOW}请粘贴配置（输入空行结束）:${NC}"
        local config=""
        while IFS= read -r line; do
            [[ -z "$line" ]] && break
            config+="$line"$'\n'
        done
        parse_ifupdown_config "$config"
    else
        echo ""
        echo -n "隧道名称 [$TUNNEL_NAME]: "
        read -r input; [[ -n "$input" ]] && TUNNEL_NAME="$input"
        
        echo -n "隧道 IPv6 地址: "
        read -r HE_ADDRESS
        
        echo -n "前缀长度 [64]: "
        read -r HE_NETMASK; [[ -z "$HE_NETMASK" ]] && HE_NETMASK="64"
        
        echo -n "HE 服务器端点: "
        read -r HE_ENDPOINT
        
        detect_local_ipv4
        echo -n "本地 IPv4 [$LOCAL_IPV4]: "
        read -r input; [[ -n "$input" ]] && HE_LOCAL="$input" || HE_LOCAL="$LOCAL_IPV4"
        
        echo -n "TTL [$TUNNEL_TTL]: "
        read -r input; [[ -n "$input" ]] && HE_TTL="$input" || HE_TTL="$TUNNEL_TTL"
        
        echo -n "隧道网关: "
        read -r HE_GATEWAY
    fi
    
    [[ -z "$HE_LOCAL" ]] && { detect_local_ipv4; HE_LOCAL="$LOCAL_IPV4"; }
}

validate_config() {
    log_step "验证配置..."
    
    local errors=0
    [[ -z "$HE_ADDRESS" ]] && { log_error "缺少 IPv6 地址"; ((errors++)); }
    [[ -z "$HE_ENDPOINT" ]] && { log_error "缺少 HE 端点"; ((errors++)); }
    [[ -z "$HE_LOCAL" ]] && { log_error "缺少本地 IPv4"; ((errors++)); }
    [[ -z "$HE_GATEWAY" ]] && { log_error "缺少网关"; ((errors++)); }
    [[ $errors -gt 0 ]] && exit 1
    
    echo ""
    echo "=========================================="
    echo -e "${BLUE}配置摘要${NC}"
    echo "=========================================="
    echo "隧道名称:   $TUNNEL_NAME"
    echo "IPv6 地址:  $HE_ADDRESS/$HE_NETMASK"
    echo "IPv6 网关:  $HE_GATEWAY"
    echo "HE 端点:    $HE_ENDPOINT"
    echo "本地 IPv4:  $HE_LOCAL"
    echo "TTL:        $HE_TTL"
    
    if [[ -n "$NATIVE_IPV6" ]]; then
        echo ""
        echo -e "${YELLOW}双栈模式:${NC}"
        echo "  原生 metric: $NATIVE_METRIC"
        echo "  HE metric:   $HE_METRIC"
        echo "  策略路由:    是"
    fi
    echo "=========================================="
    echo ""
}

# 生成 systemd service 来创建隧道
generate_tunnel_service() {
    log_step "生成隧道服务..."
    
    cat > /etc/systemd/system/${TUNNEL_NAME}.service << EOF
[Unit]
Description=HE IPv6 Tunnel ($TUNNEL_NAME)
After=network.target systemd-networkd.service
Wants=systemd-networkd.service

[Service]
Type=oneshot
RemainAfterExit=yes
ExecStart=/sbin/ip tunnel add $TUNNEL_NAME mode sit remote $HE_ENDPOINT local $HE_LOCAL ttl $HE_TTL
ExecStart=/sbin/ip link set $TUNNEL_NAME mtu 1480
ExecStart=/sbin/ip link set $TUNNEL_NAME up
ExecStop=/sbin/ip tunnel del $TUNNEL_NAME

[Install]
WantedBy=multi-user.target
EOF
    
    chmod 644 /etc/systemd/system/${TUNNEL_NAME}.service
    log_info "生成: /etc/systemd/system/${TUNNEL_NAME}.service"
}

# 生成 network 文件配置地址和路由
generate_network() {
    log_step "生成网络配置..."
    
    # 删除可能存在的 netdev 文件
    rm -f /etc/systemd/network/50-${TUNNEL_NAME}.netdev
    
    local network_file="/etc/systemd/network/50-${TUNNEL_NAME}.network"
    
    cat > "$network_file" << EOF
# HE IPv6 Tunnel - network config
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

# 策略路由：HE 地址的流量走 HE 隧道
[RoutingPolicyRule]
From=${HE_ADDRESS}
Table=$RT_TABLE_HE
Priority=100

[Route]
Gateway=$HE_GATEWAY
Table=$RT_TABLE_HE
EOF
    fi
    
    chmod 644 "$network_file"
    log_info "生成: $network_file"
}

setup_rt_table() {
    [[ -z "$NATIVE_IPV6" ]] && return
    
    log_step "配置路由表..."
    ensure_rt_tables
    
    if ! grep -q "^$RT_TABLE_HE[[:space:]]" /etc/iproute2/rt_tables; then
        echo "$RT_TABLE_HE    he_tunnel" >> /etc/iproute2/rt_tables
        log_info "添加路由表: $RT_TABLE_HE he_tunnel"
    fi
}

update_native_metric() {
    [[ -z "$NATIVE_IPV6_IFACE" ]] && return
    
    log_step "更新原生 IPv6 metric..."
    
    local native_config=""
    for f in /etc/systemd/network/*.network; do
        [[ ! -f "$f" ]] && continue
        if grep -q "Name=$NATIVE_IPV6_IFACE" "$f" 2>/dev/null; then
            native_config="$f"
            break
        fi
    done
    
    [[ -z "$native_config" ]] && { log_warn "未找到 $NATIVE_IPV6_IFACE 配置文件"; return; }
    
    local native_gw=$(ip -6 route show default dev "$NATIVE_IPV6_IFACE" 2>/dev/null | awk '/via/ {print $3}' | head -1)
    
    if [[ -n "$native_gw" ]] && ! grep -q "^Metric=$NATIVE_METRIC" "$native_config"; then
        cp "$native_config" "${native_config}.bak"
        cat >> "$native_config" << EOF

# Native IPv6 metric (added by HE script)
[Route]
Gateway=$native_gw
Metric=$NATIVE_METRIC
EOF
        log_info "已更新原生 IPv6 metric"
    fi
}

remove_old_config() {
    log_step "检查旧配置..."
    
    if systemctl is-active --quiet ${TUNNEL_NAME}.service 2>/dev/null; then
        log_warn "发现运行中的 $TUNNEL_NAME 服务"
        echo -n "是否停止并覆盖? [y/N]: "
        read -r confirm
        [[ "$confirm" != "y" && "$confirm" != "Y" ]] && exit 0
        
        systemctl stop ${TUNNEL_NAME}.service
        systemctl disable ${TUNNEL_NAME}.service 2>/dev/null || true
    fi
    
    # 删除可能存在的手动隧道
    ip tunnel del $TUNNEL_NAME 2>/dev/null || true
    
    # 备份旧文件
    [[ -f /etc/systemd/system/${TUNNEL_NAME}.service ]] && \
        mv /etc/systemd/system/${TUNNEL_NAME}.service /etc/systemd/system/${TUNNEL_NAME}.service.bak
    [[ -f /etc/systemd/network/50-${TUNNEL_NAME}.network ]] && \
        mv /etc/systemd/network/50-${TUNNEL_NAME}.network /etc/systemd/network/50-${TUNNEL_NAME}.network.bak
}

apply_config() {
    log_step "应用配置..."
    
    # 重新加载 systemd
    systemctl daemon-reload
    
    # 启动隧道服务
    systemctl enable ${TUNNEL_NAME}.service
    systemctl start ${TUNNEL_NAME}.service
    
    # 等待隧道创建
    sleep 2
    
    if ! ip link show "$TUNNEL_NAME" &>/dev/null; then
        log_error "隧道创建失败"
        journalctl -u ${TUNNEL_NAME}.service --no-pager | tail -10
        return 1
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
    echo "隧道状态:"
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
    ip -6 route show | grep -E "(default|$TUNNEL_NAME)" | head -5
    
    if [[ -n "$NATIVE_IPV6" ]]; then
        echo ""
        echo "=========================================="
        echo "策略路由:"
        echo "=========================================="
        ip -6 rule show | grep -E "(from $HE_ADDRESS|lookup)" | head -5
    fi
    
    echo ""
    echo "=========================================="
    echo "连通性测试:"
    echo "=========================================="
    
    echo -n "HE 网关: "
    if timeout 5 ping -6 -c 2 "$HE_GATEWAY" &>/dev/null; then
        echo -e "${GREEN}成功 ✓${NC}"
    else
        echo -e "${RED}失败 ✗${NC}"
    fi
    
    echo -n "HE 出站 (源 $HE_ADDRESS): "
    if timeout 5 ping -6 -c 2 -I "$HE_ADDRESS" 2001:4860:4860::8888 &>/dev/null; then
        echo -e "${GREEN}成功 ✓${NC}"
    else
        echo -e "${YELLOW}失败（检查 HE 隧道状态）${NC}"
    fi
    
    if [[ -n "$NATIVE_IPV6" ]]; then
        echo -n "原生 IPv6 (源 $NATIVE_IPV6): "
        if timeout 5 ping -6 -c 2 -I "$NATIVE_IPV6" 2001:4860:4860::8888 &>/dev/null; then
            echo -e "${GREEN}成功 ✓${NC}"
        else
            echo -e "${YELLOW}失败${NC}"
        fi
    fi
    echo ""
}

generate_remove_script() {
    log_step "生成删除脚本..."
    
    cat > /root/remove-${TUNNEL_NAME}.sh << EOF
#!/bin/bash
# 删除 HE IPv6 隧道

echo "停止并删除 $TUNNEL_NAME..."

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
    
    chmod +x /root/remove-${TUNNEL_NAME}.sh
    log_info "删除脚本: /root/remove-${TUNNEL_NAME}.sh"
}

show_final_status() {
    echo ""
    echo "=========================================="
    echo -e "${GREEN}HE IPv6 隧道配置完成！${NC}"
    echo "=========================================="
    echo ""
    echo "配置文件:"
    echo "  /etc/systemd/system/${TUNNEL_NAME}.service"
    echo "  /etc/systemd/network/50-${TUNNEL_NAME}.network"
    echo ""
    echo "管理命令:"
    echo "  状态: systemctl status ${TUNNEL_NAME}"
    echo "  重启: systemctl restart ${TUNNEL_NAME}"
    echo "  删除: /root/remove-${TUNNEL_NAME}.sh"
    echo ""
}

main() {
    echo ""
    echo "=========================================="
    echo "HE IPv6 Tunnel 配置脚本 v1.3"
    echo "=========================================="
    echo ""
    
    check_root
    check_networkd
    ensure_rt_tables
    ensure_sit_module
    
    detect_native_ipv6 || true
    interactive_input
    validate_config
    
    echo -n "是否继续? [y/N]: "
    read -r confirm
    [[ "$confirm" != "y" && "$confirm" != "Y" ]] && exit 0
    
    remove_old_config
    setup_rt_table
    generate_tunnel_service
    generate_network
    update_native_metric
    generate_remove_script
    apply_config
    verify_tunnel
    show_final_status
}

main "$@"
