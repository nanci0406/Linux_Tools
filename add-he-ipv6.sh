#!/bin/bash

# ============================================================================
# HE IPv6 Tunnel 一键配置脚本 for systemd-networkd
# 支持与原生 IPv6 共存，自动配置 metric 和源地址策略路由
# ============================================================================

set -e

# 颜色定义
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

# 检查 root
check_root() {
    if [[ $EUID -ne 0 ]]; then
        log_error "此脚本必须以 root 用户运行"
        exit 1
    fi
}

# 检查 systemd-networkd
check_networkd() {
    if ! systemctl is-active --quiet systemd-networkd; then
        log_error "systemd-networkd 未运行，请先迁移到 systemd-networkd"
        exit 1
    fi
}

# 检测原生 IPv6
detect_native_ipv6() {
    log_step "检测原生 IPv6..."
    
    NATIVE_IPV6=""
    NATIVE_IPV6_IFACE=""
    
    # 查找非隧道接口上的全局 IPv6 地址
    while read -r line; do
        local iface=$(echo "$line" | awk '{print $NF}')
        local addr=$(echo "$line" | awk '{print $2}' | cut -d'/' -f1)
        
        # 跳过隧道接口和本地链路地址
        if [[ "$iface" == "lo" ]] || [[ "$iface" =~ ^he ]] || [[ "$iface" =~ ^sit ]] || [[ "$iface" =~ ^tun ]]; then
            continue
        fi
        if [[ "$addr" =~ ^fe80 ]] || [[ "$addr" =~ ^::1$ ]]; then
            continue
        fi
        
        NATIVE_IPV6="$addr"
        NATIVE_IPV6_IFACE="$iface"
        break
    done < <(ip -6 addr show scope global 2>/dev/null | grep inet6)
    
    if [[ -n "$NATIVE_IPV6" ]]; then
        log_info "检测到原生 IPv6: $NATIVE_IPV6 (接口: $NATIVE_IPV6_IFACE)"
        return 0
    else
        log_info "未检测到原生 IPv6"
        return 1
    fi
}

# 检测本地 IPv4 地址
detect_local_ipv4() {
    log_step "检测本地 IPv4 地址..."
    
    # 获取默认路由的出口 IP
    LOCAL_IPV4=$(ip -4 route get 8.8.8.8 2>/dev/null | grep -oP 'src \K[0-9.]+' | head -1)
    
    if [[ -z "$LOCAL_IPV4" ]]; then
        # 备用方法
        LOCAL_IPV4=$(ip -4 addr show scope global | grep inet | head -1 | awk '{print $2}' | cut -d'/' -f1)
    fi
    
    if [[ -n "$LOCAL_IPV4" ]]; then
        log_info "检测到本地 IPv4: $LOCAL_IPV4"
    else
        log_warn "无法自动检测本地 IPv4，需要手动输入"
    fi
}

# 解析 ifupdown 格式的配置
parse_ifupdown_config() {
    local config="$1"
    
    # 重置变量
    HE_ADDRESS=""
    HE_NETMASK=""
    HE_ENDPOINT=""
    HE_LOCAL=""
    HE_TTL="$TUNNEL_TTL"
    HE_GATEWAY=""
    
    while IFS= read -r line; do
        # 去除前后空格
        line=$(echo "$line" | sed 's/^[[:space:]]*//;s/[[:space:]]*$//')
        
        # 跳过空行和注释
        [[ -z "$line" ]] && continue
        [[ "$line" =~ ^# ]] && continue
        
        # 解析 iface 行获取隧道名
        if [[ "$line" =~ ^iface[[:space:]]+([^[:space:]]+)[[:space:]] ]]; then
            TUNNEL_NAME="${BASH_REMATCH[1]}"
            continue
        fi
        
        # 解析各项配置
        if [[ "$line" =~ ^address[[:space:]]+(.+) ]]; then
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

# 交互式输入配置
interactive_input() {
    echo ""
    echo -e "${CYAN}请输入 HE IPv6 隧道配置${NC}"
    echo -e "${CYAN}可以直接粘贴 ifupdown 格式的配置，然后输入空行结束${NC}"
    echo -e "${CYAN}或者逐项输入配置${NC}"
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
        
        # 隧道名称
        echo -n "隧道名称 [$TUNNEL_NAME]: "
        read -r input
        [[ -n "$input" ]] && TUNNEL_NAME="$input"
        
        # 隧道 IPv6 地址
        echo -n "隧道 IPv6 地址 (如 2001:470:c:125e::2): "
        read -r HE_ADDRESS
        
        # 前缀长度
        echo -n "前缀长度/Netmask [64]: "
        read -r HE_NETMASK
        [[ -z "$HE_NETMASK" ]] && HE_NETMASK="64"
        
        # HE 服务器端点
        echo -n "HE 服务器端点 (如 66.220.18.42): "
        read -r HE_ENDPOINT
        
        # 本地 IPv4
        detect_local_ipv4
        echo -n "本地 IPv4 地址 [$LOCAL_IPV4]: "
        read -r input
        [[ -n "$input" ]] && HE_LOCAL="$input" || HE_LOCAL="$LOCAL_IPV4"
        
        # TTL
        echo -n "TTL [$TUNNEL_TTL]: "
        read -r input
        [[ -n "$input" ]] && HE_TTL="$input" || HE_TTL="$TUNNEL_TTL"
        
        # 网关
        echo -n "隧道网关 (如 2001:470:c:125e::1): "
        read -r HE_GATEWAY
    fi
    
    # 如果没有设置 local，尝试自动检测
    if [[ -z "$HE_LOCAL" ]]; then
        detect_local_ipv4
        HE_LOCAL="$LOCAL_IPV4"
    fi
}

# 验证配置
validate_config() {
    log_step "验证配置..."
    
    local errors=0
    
    if [[ -z "$HE_ADDRESS" ]]; then
        log_error "缺少隧道 IPv6 地址"
        ((errors++))
    fi
    
    if [[ -z "$HE_ENDPOINT" ]]; then
        log_error "缺少 HE 服务器端点"
        ((errors++))
    fi
    
    if [[ -z "$HE_LOCAL" ]]; then
        log_error "缺少本地 IPv4 地址"
        ((errors++))
    fi
    
    if [[ -z "$HE_GATEWAY" ]]; then
        log_error "缺少隧道网关"
        ((errors++))
    fi
    
    if [[ $errors -gt 0 ]]; then
        exit 1
    fi
    
    # 显示配置摘要
    echo ""
    echo "=========================================="
    echo -e "${BLUE}配置摘要${NC}"
    echo "=========================================="
    echo "隧道名称:     $TUNNEL_NAME"
    echo "IPv6 地址:    $HE_ADDRESS/$HE_NETMASK"
    echo "IPv6 网关:    $HE_GATEWAY"
    echo "HE 端点:      $HE_ENDPOINT"
    echo "本地 IPv4:    $HE_LOCAL"
    echo "TTL:          $HE_TTL"
    echo ""
    
    if [[ -n "$NATIVE_IPV6" ]]; then
        echo -e "${YELLOW}检测到原生 IPv6，将配置:${NC}"
        echo "  原生 IPv6 metric: $NATIVE_METRIC"
        echo "  HE 隧道 metric:   $HE_METRIC"
        echo "  源地址策略路由:   是"
    fi
    echo "=========================================="
    echo ""
}

# 生成 netdev 文件（隧道设备）
generate_netdev() {
    log_step "生成隧道设备配置..."
    
    local netdev_file="/etc/systemd/network/50-${TUNNEL_NAME}.netdev"
    
    cat > "$netdev_file" << EOF
# HE IPv6 Tunnel - netdev
# Generated: $(date)

[NetDev]
Name=$TUNNEL_NAME
Kind=sit
MTUBytes=1480

[Tunnel]
Local=$HE_LOCAL
Remote=$HE_ENDPOINT
TTL=$HE_TTL
EOF
    
    chmod 644 "$netdev_file"
    log_info "生成: $netdev_file"
}

# 生成 network 文件（隧道网络配置）
generate_network() {
    log_step "生成隧道网络配置..."
    
    local network_file="/etc/systemd/network/50-${TUNNEL_NAME}.network"
    
    cat > "$network_file" << EOF
# HE IPv6 Tunnel - network
# Generated: $(date)

[Match]
Name=$TUNNEL_NAME

[Network]
Address=${HE_ADDRESS}/${HE_NETMASK}
IPForward=ipv6

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
    
    chmod 644 "$network_file"
    log_info "生成: $network_file"
}

# 更新原生 IPv6 接口的 metric
update_native_metric() {
    if [[ -z "$NATIVE_IPV6_IFACE" ]]; then
        return
    fi
    
    log_step "更新原生 IPv6 接口 metric..."
    
    # 查找原生接口的配置文件
    local native_config=""
    for f in /etc/systemd/network/*.network; do
        if grep -q "Name=$NATIVE_IPV6_IFACE" "$f" 2>/dev/null; then
            native_config="$f"
            break
        fi
    done
    
    if [[ -z "$native_config" ]]; then
        log_warn "未找到接口 $NATIVE_IPV6_IFACE 的配置文件"
        return
    fi
    
    log_info "更新配置文件: $native_config"
    
    # 备份
    cp "$native_config" "${native_config}.bak.$(date +%Y%m%d-%H%M%S)"
    
    # 检查是否已有 IPv6 路由配置
    if grep -q "^\[Route\]" "$native_config" && grep -A5 "^\[Route\]" "$native_config" | grep -q "Gateway=.*:"; then
        # 已有 IPv6 路由，检查是否有 metric
        if ! grep -A10 "^\[Route\]" "$native_config" | grep -q "^Metric="; then
            # 添加 metric 到现有的 IPv6 路由段
            # 这比较复杂，我们采用追加新路由段的方式
            :
        fi
    fi
    
    # 获取原生 IPv6 网关
    local native_gw=$(ip -6 route show default dev "$NATIVE_IPV6_IFACE" 2>/dev/null | grep -oP 'via \K[^ ]+' | head -1)
    
    if [[ -n "$native_gw" ]]; then
        # 检查是否已经配置过
        if grep -q "Metric=$NATIVE_METRIC" "$native_config" 2>/dev/null; then
            log_info "原生 IPv6 metric 已配置"
            return
        fi
        
        # 追加路由配置
        cat >> "$native_config" << EOF

# Native IPv6 route with metric (added by HE tunnel script)
[Route]
Gateway=$native_gw
Metric=$NATIVE_METRIC
EOF
        log_info "已添加原生 IPv6 路由 metric: $NATIVE_METRIC"
    else
        log_warn "无法获取原生 IPv6 网关，跳过 metric 配置"
    fi
}

# 配置路由表
setup_rt_table() {
    if [[ -z "$NATIVE_IPV6" ]]; then
        return
    fi
    
    log_step "配置路由表..."
    
    # 添加路由表到 rt_tables
    if ! grep -q "^$RT_TABLE_HE[[:space:]]" /etc/iproute2/rt_tables 2>/dev/null; then
        echo "$RT_TABLE_HE    he_tunnel" >> /etc/iproute2/rt_tables
        log_info "添加路由表: $RT_TABLE_HE he_tunnel"
    else
        log_info "路由表已存在"
    fi
}

# 删除旧的隧道配置
remove_old_config() {
    log_step "检查旧配置..."
    
    local old_netdev="/etc/systemd/network/50-${TUNNEL_NAME}.netdev"
    local old_network="/etc/systemd/network/50-${TUNNEL_NAME}.network"
    
    if [[ -f "$old_netdev" ]] || [[ -f "$old_network" ]]; then
        log_warn "发现已存在的 $TUNNEL_NAME 配置"
        echo -n "是否覆盖? [y/N]: "
        read -r confirm
        
        if [[ "$confirm" != "y" && "$confirm" != "Y" ]]; then
            log_info "已取消"
            exit 0
        fi
        
        # 备份旧配置
        [[ -f "$old_netdev" ]] && mv "$old_netdev" "${old_netdev}.bak.$(date +%Y%m%d-%H%M%S)"
        [[ -f "$old_network" ]] && mv "$old_network" "${old_network}.bak.$(date +%Y%m%d-%H%M%S)"
    fi
}

# 应用配置
apply_config() {
    log_step "应用配置..."
    
    # 重新加载 networkd
    networkctl reload 2>/dev/null || systemctl restart systemd-networkd
    
    # 等待隧道建立
    log_info "等待隧道建立..."
    sleep 3
    
    # 检查隧道状态
    local max_wait=10
    local waited=0
    while [[ $waited -lt $max_wait ]]; do
        if ip link show "$TUNNEL_NAME" &>/dev/null; then
            break
        fi
        sleep 1
        ((waited++))
    done
    
    if ! ip link show "$TUNNEL_NAME" &>/dev/null; then
        log_error "隧道创建失败"
        return 1
    fi
    
    log_info "配置已应用"
}

# 验证隧道
verify_tunnel() {
    log_step "验证隧道..."
    
    echo ""
    echo "=========================================="
    echo "隧道状态:"
    echo "=========================================="
    ip link show "$TUNNEL_NAME" 2>/dev/null || echo "隧道未创建"
    
    echo ""
    echo "=========================================="
    echo "隧道 IPv6 地址:"
    echo "=========================================="
    ip -6 addr show dev "$TUNNEL_NAME" 2>/dev/null || echo "无"
    
    echo ""
    echo "=========================================="
    echo "IPv6 路由表:"
    echo "=========================================="
    ip -6 route show | head -20
    
    if [[ -n "$NATIVE_IPV6" ]]; then
        echo ""
        echo "=========================================="
        echo "策略路由规则:"
        echo "=========================================="
        ip -6 rule show
        
        echo ""
        echo "=========================================="
        echo "HE 路由表 ($RT_TABLE_HE):"
        echo "=========================================="
        ip -6 route show table $RT_TABLE_HE 2>/dev/null || echo "空"
    fi
    
    echo ""
    echo "=========================================="
    echo "连通性测试:"
    echo "=========================================="
    
    # 测试 HE 隧道
    echo -n "测试 HE 隧道 (ping HE 网关): "
    if timeout 5 ping -6 -c 2 -I "$TUNNEL_NAME" "$HE_GATEWAY" &>/dev/null; then
        echo -e "${GREEN}成功 ✓${NC}"
    else
        echo -e "${RED}失败 ✗${NC}"
    fi
    
    # 测试从 HE 地址出去
    echo -n "测试 HE 出站 (源地址 $HE_ADDRESS): "
    if timeout 5 ping -6 -c 2 -I "$HE_ADDRESS" 2001:4860:4860::8888 &>/dev/null; then
        echo -e "${GREEN}成功 ✓${NC}"
    else
        echo -e "${YELLOW}可能失败（防火墙或路由问题）${NC}"
    fi
    
    # 如果有原生 IPv6，测试原生
    if [[ -n "$NATIVE_IPV6" ]]; then
        echo -n "测试原生 IPv6 (源地址 $NATIVE_IPV6): "
        if timeout 5 ping -6 -c 2 -I "$NATIVE_IPV6" 2001:4860:4860::8888 &>/dev/null; then
            echo -e "${GREEN}成功 ✓${NC}"
        else
            echo -e "${YELLOW}可能失败${NC}"
        fi
    fi
    
    echo ""
}

# 生成删除脚本
generate_remove_script() {
    log_step "生成删除脚本..."
    
    cat > /root/remove-he-ipv6.sh << 'REMOVE_EOF'
#!/bin/bash
# 删除 HE IPv6 隧道配置

TUNNEL_NAME="TUNNEL_NAME_PLACEHOLDER"

echo "删除 HE IPv6 隧道配置..."

# 删除配置文件
rm -f "/etc/systemd/network/50-${TUNNEL_NAME}.netdev"
rm -f "/etc/systemd/network/50-${TUNNEL_NAME}.network"

# 重新加载
networkctl reload 2>/dev/null || systemctl restart systemd-networkd

# 删除路由表条目（可选）
# sed -i '/he_tunnel/d' /etc/iproute2/rt_tables

echo "删除完成！"
REMOVE_EOF

    sed -i "s/TUNNEL_NAME_PLACEHOLDER/$TUNNEL_NAME/g" /root/remove-he-ipv6.sh
    chmod +x /root/remove-he-ipv6.sh
    
    log_info "删除脚本: /root/remove-he-ipv6.sh"
}

# 显示最终状态
show_final_status() {
    echo ""
    echo "=========================================="
    echo -e "${GREEN}HE IPv6 隧道配置完成！${NC}"
    echo "=========================================="
    echo ""
    echo "配置文件:"
    echo "  /etc/systemd/network/50-${TUNNEL_NAME}.netdev"
    echo "  /etc/systemd/network/50-${TUNNEL_NAME}.network"
    echo ""
    
    if [[ -n "$NATIVE_IPV6" ]]; then
        echo -e "${YELLOW}双栈配置说明:${NC}"
        echo "  - 原生 IPv6 优先级更高 (metric $NATIVE_METRIC)"
        echo "  - HE 隧道作为备用 (metric $HE_METRIC)"
        echo "  - 从 HE 地址发起的连接会正确使用 HE 隧道回包"
        echo ""
    fi
    
    echo "管理命令:"
    echo "  查看隧道状态: networkctl status $TUNNEL_NAME"
    echo "  重启隧道:     networkctl reconfigure $TUNNEL_NAME"
    echo "  删除隧道:     /root/remove-he-ipv6.sh"
    echo ""
}

# 主函数
main() {
    echo ""
    echo "=========================================="
    echo "HE IPv6 Tunnel 配置脚本 for systemd-networkd"
    echo "=========================================="
    echo ""
    
    check_root
    check_networkd
    
    # 检测原生 IPv6
    detect_native_ipv6 || true
    
    # 交互式输入
    interactive_input
    
    # 验证配置
    validate_config
    
    # 确认
    echo -n "是否继续配置? [y/N]: "
    read -r confirm
    [[ "$confirm" != "y" && "$confirm" != "Y" ]] && { log_info "已取消"; exit 0; }
    
    # 删除旧配置
    remove_old_config
    
    # 配置路由表
    setup_rt_table
    
    # 生成配置
    generate_netdev
    generate_network
    
    # 更新原生 IPv6 metric
    update_native_metric
    
    # 生成删除脚本
    generate_remove_script
    
    # 应用配置
    apply_config
    
    # 验证
    verify_tunnel
    
    # 显示状态
    show_final_status
}

main "$@"
