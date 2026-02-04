#!/bin/bash

# ============================================================================
# ifupdown to systemd-networkd 一键迁移脚本 v2.2
# 适用于 Debian 13 系统
# 修复了 systemd-resolved 启动失败的问题
# ============================================================================

set -e

# 颜色定义
RED='\033[0;31m'
GREEN='\033[0;32m'
YELLOW='\033[1;33m'
BLUE='\033[0;34m'
NC='\033[0m'

# 日志函数
log_info() { echo -e "${GREEN}[INFO]${NC} $1"; }
log_warn() { echo -e "${YELLOW}[WARN]${NC} $1"; }
log_error() { echo -e "${RED}[ERROR]${NC} $1"; }
log_step() { echo -e "${BLUE}[STEP]${NC} $1"; }

# 全局变量
declare -gA IFACE_IPV4_ADDR
declare -gA IFACE_IPV4_GW
declare -gA IFACE_IPV6_ADDR
declare -gA IFACE_IPV6_GW
declare -gA IFACE_DNS4
declare -gA IFACE_DNS6
declare -gA IFACE_ACCEPT_RA
declare -gA IFACE_MTU
declare -gA IFACE_MAC
declare -ga IFACE_LIST=()

BACKUP_DIR=""
CURRENT_DNS=""
TIMEOUT_CMD=10

# 清理函数（脚本退出时执行）
cleanup() {
    # 确保删除任何临时 systemd override
    rm -rf /etc/systemd/system/systemd-resolved.service.d/temp-disable.conf 2>/dev/null
    rmdir /etc/systemd/system/systemd-resolved.service.d 2>/dev/null || true
    systemctl daemon-reload 2>/dev/null || true
}

# 设置退出时清理
trap cleanup EXIT

# 带超时的命令执行
run_with_timeout() {
    local timeout=$1
    shift
    timeout "$timeout" "$@" 2>/dev/null
    return $?
}

# 检查 root
check_root() {
    if [[ $EUID -ne 0 ]]; then
        log_error "此脚本必须以 root 用户运行"
        exit 1
    fi
}

# 保存当前 DNS
save_current_dns() {
    log_step "保存当前 DNS 配置..."
    
    if [[ -f /etc/resolv.conf ]]; then
        cp /etc/resolv.conf /tmp/resolv.conf.migration.bak 2>/dev/null || true
    fi
    
    CURRENT_DNS=$(grep -E '^nameserver' /etc/resolv.conf 2>/dev/null | awk '{print $2}' | head -3 | tr '\n' ' ')
    
    if [[ -z "$CURRENT_DNS" ]]; then
        CURRENT_DNS="1.1.1.1 8.8.8.8"
    fi
    
    log_info "当前 DNS: $CURRENT_DNS"
}

# 确保 DNS 可用
ensure_dns() {
    rm -f /etc/resolv.conf
    cat > /etc/resolv.conf << EOF
nameserver 1.1.1.1
nameserver 8.8.8.8
nameserver 2606:4700:4700::1111
EOF
}

# 安装依赖
install_dependencies() {
    log_step "检查并安装依赖..."
    
    local need_install=false
    
    if ! dpkg -l | grep -q "^ii.*systemd-resolved"; then
        need_install=true
    fi
    
    if [[ "$need_install" == "true" ]]; then
        log_info "需要安装 systemd-resolved"
        
        ensure_dns
        
        log_info "更新软件源..."
        apt-get update -qq || log_warn "apt-get update 失败，继续尝试安装..."
        
        log_info "安装 systemd-resolved..."
        DEBIAN_FRONTEND=noninteractive apt-get install -y -qq systemd-resolved || {
            log_error "安装 systemd-resolved 失败"
            exit 1
        }
        
        # 安装后立即停止服务，防止它接管 DNS
        systemctl stop systemd-resolved 2>/dev/null || true
        
        # 恢复 DNS
        ensure_dns
        
        log_info "依赖安装完成"
    else
        log_info "所有依赖已满足"
    fi
    
    # 确保没有残留的临时配置
    rm -rf /etc/systemd/system/systemd-resolved.service.d 2>/dev/null || true
    systemctl daemon-reload 2>/dev/null || true
}

# 备份配置
backup_config() {
    log_step "备份原有网络配置..."
    BACKUP_DIR="/root/network-backup-$(date +%Y%m%d-%H%M%S)"
    mkdir -p "$BACKUP_DIR"
    
    [[ -f /etc/network/interfaces ]] && cp /etc/network/interfaces "$BACKUP_DIR/"
    [[ -d /etc/network/interfaces.d ]] && cp -r /etc/network/interfaces.d "$BACKUP_DIR/" 2>/dev/null || true
    
    ip route show > "$BACKUP_DIR/routes-ipv4.txt" 2>/dev/null || true
    ip -6 route show > "$BACKUP_DIR/routes-ipv6.txt" 2>/dev/null || true
    ip addr show > "$BACKUP_DIR/ip-addr.txt" 2>/dev/null || true
    cat /etc/resolv.conf > "$BACKUP_DIR/resolv.conf" 2>/dev/null || true
    
    log_info "配置已备份到: $BACKUP_DIR"
}

# 检查 IPv6 网关是否在子网内
ipv6_in_subnet() {
    local addr="$1"
    local subnet="$2"
    
    if command -v python3 &>/dev/null; then
        python3 << PYEOF 2>/dev/null || echo "no"
import ipaddress
try:
    network = ipaddress.ip_network('$subnet', strict=False)
    address = ipaddress.ip_address('$addr')
    print("yes" if address in network else "no")
except:
    print("no")
PYEOF
        return
    fi
    echo "no"
}

# 检查 IPv4 网关是否在子网内
ipv4_in_subnet() {
    local gw="$1"
    local subnet="$2"
    
    if command -v python3 &>/dev/null; then
        python3 << PYEOF 2>/dev/null || echo "no"
import ipaddress
try:
    network = ipaddress.ip_network('$subnet', strict=False)
    address = ipaddress.ip_address('$gw')
    print("yes" if address in network else "no")
except:
    print("no")
PYEOF
        return
    fi
    
    # 简单备用检查
    local addr_part="${subnet%/*}"
    local prefix="${subnet#*/}"
    
    IFS='.' read -ra ADDR <<< "$addr_part"
    IFS='.' read -ra GW <<< "$gw"
    
    case "$prefix" in
        24|25|26|27|28|29|30|31)
            [[ "${ADDR[0]}.${ADDR[1]}.${ADDR[2]}" == "${GW[0]}.${GW[1]}.${GW[2]}" ]] && echo "yes" || echo "no" ;;
        16|17|18|19|20|21|22|23)
            [[ "${ADDR[0]}.${ADDR[1]}" == "${GW[0]}.${GW[1]}" ]] && echo "yes" || echo "no" ;;
        *)
            echo "no" ;;
    esac
}

# 解析 interfaces 文件
parse_interfaces() {
    log_step "解析当前网络配置..."
    
    rm -f /tmp/interfaces_combined.tmp
    process_interfaces_file "/etc/network/interfaces"
    
    if [[ ! -f /tmp/interfaces_combined.tmp ]]; then
        log_error "无法解析网络配置"
        exit 1
    fi
    
    parse_combined_config
}

process_interfaces_file() {
    local file="$1"
    [[ ! -f "$file" ]] && return
    
    while IFS= read -r line || [[ -n "$line" ]]; do
        if [[ "$line" =~ ^[[:space:]]*source[[:space:]]+(.*) ]]; then
            for sf in ${BASH_REMATCH[1]}; do
                [[ -f "$sf" ]] && process_interfaces_file "$sf"
            done
            continue
        fi
        
        if [[ "$line" =~ ^[[:space:]]*source-directory[[:space:]]+(.*) ]]; then
            local sd="${BASH_REMATCH[1]}"
            if [[ -d "$sd" ]]; then
                for sf in "$sd"/*; do
                    [[ -f "$sf" ]] && process_interfaces_file "$sf"
                done
            fi
            continue
        fi
        
        echo "$line" >> /tmp/interfaces_combined.tmp
    done < "$file"
}

parse_combined_config() {
    local current_iface=""
    local current_family=""
    
    while IFS= read -r line || [[ -n "$line" ]]; do
        [[ "$line" =~ ^[[:space:]]*# ]] && continue
        [[ -z "${line// }" ]] && continue
        
        line=$(echo "$line" | sed 's/^[[:space:]]*//;s/[[:space:]]*$//')
        
        # auto / allow-hotplug
        if [[ "$line" =~ ^(auto|allow-hotplug)[[:space:]]+(.+) ]]; then
            for iface in ${BASH_REMATCH[2]}; do
                if [[ "$iface" != "lo" ]] && [[ ! " ${IFACE_LIST[*]} " =~ " ${iface} " ]]; then
                    IFACE_LIST+=("$iface")
                fi
            done
            continue
        fi
        
        # iface
        if [[ "$line" =~ ^iface[[:space:]]+([^[:space:]]+)[[:space:]]+(inet6?)[[:space:]]+(.+) ]]; then
            current_iface="${BASH_REMATCH[1]}"
            current_family="${BASH_REMATCH[2]}"
            [[ "$current_iface" == "lo" ]] && continue
            [[ ! " ${IFACE_LIST[*]} " =~ " ${current_iface} " ]] && IFACE_LIST+=("$current_iface")
            continue
        fi
        
        [[ "$current_iface" == "lo" || -z "$current_iface" ]] && continue
        
        # address
        if [[ "$line" =~ ^address[[:space:]]+(.+) ]]; then
            if [[ "$current_family" == "inet" ]]; then
                IFACE_IPV4_ADDR[$current_iface]="${BASH_REMATCH[1]}"
            else
                IFACE_IPV6_ADDR[$current_iface]="${BASH_REMATCH[1]}"
            fi
            continue
        fi
        
        # netmask
        if [[ "$line" =~ ^netmask[[:space:]]+(.+) ]]; then
            if [[ "$current_family" == "inet" ]] && [[ -n "${IFACE_IPV4_ADDR[$current_iface]}" ]]; then
                if [[ ! "${IFACE_IPV4_ADDR[$current_iface]}" =~ / ]]; then
                    local cidr=$(netmask_to_cidr "${BASH_REMATCH[1]}")
                    IFACE_IPV4_ADDR[$current_iface]="${IFACE_IPV4_ADDR[$current_iface]}/$cidr"
                fi
            fi
            continue
        fi
        
        # gateway
        if [[ "$line" =~ ^gateway[[:space:]]+(.+) ]]; then
            if [[ "$current_family" == "inet" ]]; then
                IFACE_IPV4_GW[$current_iface]="${BASH_REMATCH[1]}"
            else
                IFACE_IPV6_GW[$current_iface]="${BASH_REMATCH[1]}"
            fi
            continue
        fi
        
        # dns-nameservers
        if [[ "$line" =~ ^dns-nameservers[[:space:]]+(.+) ]]; then
            for dns in ${BASH_REMATCH[1]}; do
                if [[ "$dns" =~ : ]]; then
                    IFACE_DNS6[$current_iface]="${IFACE_DNS6[$current_iface]} $dns"
                else
                    IFACE_DNS4[$current_iface]="${IFACE_DNS4[$current_iface]} $dns"
                fi
            done
            continue
        fi
        
        # dns-nameserver (单个)
        if [[ "$line" =~ ^dns-nameserver[[:space:]]+(.+) ]]; then
            local dns="${BASH_REMATCH[1]}"
            if [[ "$dns" =~ : ]]; then
                IFACE_DNS6[$current_iface]="${IFACE_DNS6[$current_iface]} $dns"
            else
                IFACE_DNS4[$current_iface]="${IFACE_DNS4[$current_iface]} $dns"
            fi
            continue
        fi
        
        # accept_ra
        if [[ "$line" =~ ^accept_ra[[:space:]]+(.+) ]]; then
            IFACE_ACCEPT_RA[$current_iface]="${BASH_REMATCH[1]}"
            continue
        fi
        
        # mtu
        if [[ "$line" =~ ^mtu[[:space:]]+(.+) ]]; then
            IFACE_MTU[$current_iface]="${BASH_REMATCH[1]}"
            continue
        fi
        
        # hwaddress
        if [[ "$line" =~ ^hwaddress[[:space:]]+(ether[[:space:]]+)?(.+) ]]; then
            IFACE_MAC[$current_iface]="${BASH_REMATCH[2]}"
            continue
        fi
        
    done < /tmp/interfaces_combined.tmp
    
    rm -f /tmp/interfaces_combined.tmp
}

netmask_to_cidr() {
    local netmask="$1"
    local cidr=0
    IFS='.' read -ra OCTETS <<< "$netmask"
    for octet in "${OCTETS[@]}"; do
        case "$octet" in
            255) ((cidr+=8)) ;; 254) ((cidr+=7)) ;; 252) ((cidr+=6)) ;;
            248) ((cidr+=5)) ;; 240) ((cidr+=4)) ;; 224) ((cidr+=3)) ;;
            192) ((cidr+=2)) ;; 128) ((cidr+=1)) ;; 0) ;;
        esac
    done
    echo "$cidr"
}

# 显示解析结果
show_parsed_config() {
    log_step "检测到的网络配置:"
    echo "----------------------------------------"
    
    for iface in "${IFACE_LIST[@]}"; do
        echo -e "${BLUE}接口: $iface${NC}"
        [[ -n "${IFACE_IPV4_ADDR[$iface]}" ]] && echo "  IPv4 地址: ${IFACE_IPV4_ADDR[$iface]}"
        [[ -n "${IFACE_IPV4_GW[$iface]}" ]] && echo "  IPv4 网关: ${IFACE_IPV4_GW[$iface]}"
        [[ -n "${IFACE_IPV6_ADDR[$iface]}" ]] && echo "  IPv6 地址: ${IFACE_IPV6_ADDR[$iface]}"
        [[ -n "${IFACE_IPV6_GW[$iface]}" ]] && echo "  IPv6 网关: ${IFACE_IPV6_GW[$iface]}"
        [[ -n "${IFACE_DNS4[$iface]}" ]] && echo "  DNS (IPv4):${IFACE_DNS4[$iface]}"
        [[ -n "${IFACE_DNS6[$iface]}" ]] && echo "  DNS (IPv6):${IFACE_DNS6[$iface]}"
        [[ -n "${IFACE_MTU[$iface]}" ]] && echo "  MTU: ${IFACE_MTU[$iface]}"
        echo ""
    done
    echo "----------------------------------------"
}

# 生成 networkd 配置
generate_networkd_config() {
    log_step "生成 systemd-networkd 配置文件..."
    
    mkdir -p /etc/systemd/network
    local priority=10
    
    for iface in "${IFACE_LIST[@]}"; do
        local config_file="/etc/systemd/network/${priority}-${iface}.network"
        log_info "生成: $config_file"
        
        cat > "$config_file" << EOF
# Auto-generated by migration script
# Interface: $iface
# Generated: $(date)

[Match]
Name=$iface

[Network]
EOF
        
        # IPv4
        if [[ -n "${IFACE_IPV4_ADDR[$iface]}" ]]; then
            echo "Address=${IFACE_IPV4_ADDR[$iface]}" >> "$config_file"
            if [[ -n "${IFACE_IPV4_GW[$iface]}" ]]; then
                local in_subnet=$(ipv4_in_subnet "${IFACE_IPV4_GW[$iface]}" "${IFACE_IPV4_ADDR[$iface]}")
                [[ "$in_subnet" == "yes" ]] && echo "Gateway=${IFACE_IPV4_GW[$iface]}" >> "$config_file"
            fi
        fi
        
        # IPv6
        if [[ -n "${IFACE_IPV6_ADDR[$iface]}" ]]; then
            echo "Address=${IFACE_IPV6_ADDR[$iface]}" >> "$config_file"
            if [[ -n "${IFACE_IPV6_GW[$iface]}" ]]; then
                local in_subnet=$(ipv6_in_subnet "${IFACE_IPV6_GW[$iface]}" "${IFACE_IPV6_ADDR[$iface]}")
                [[ "$in_subnet" == "yes" ]] && echo "Gateway=${IFACE_IPV6_GW[$iface]}" >> "$config_file"
            fi
            echo "IPv6AcceptRA=no" >> "$config_file"
        fi
        
        # DNS
        local seen_dns=""
        for dns in ${IFACE_DNS4[$iface]} ${IFACE_DNS6[$iface]}; do
            if [[ -n "$dns" ]] && [[ ! " $seen_dns " =~ " $dns " ]]; then
                echo "DNS=$dns" >> "$config_file"
                seen_dns="$seen_dns $dns"
            fi
        done
        
        # IPv4 网关不在子网内
        if [[ -n "${IFACE_IPV4_GW[$iface]}" ]]; then
            local in_subnet=$(ipv4_in_subnet "${IFACE_IPV4_GW[$iface]}" "${IFACE_IPV4_ADDR[$iface]}")
            if [[ "$in_subnet" != "yes" ]]; then
                log_warn "IPv4 网关 ${IFACE_IPV4_GW[$iface]} 不在子网内，添加 GatewayOnLink"
                cat >> "$config_file" << EOF

[Route]
Gateway=${IFACE_IPV4_GW[$iface]}
GatewayOnLink=yes
EOF
            fi
        fi
        
        # IPv6 网关不在子网内
        if [[ -n "${IFACE_IPV6_GW[$iface]}" ]]; then
            local in_subnet=$(ipv6_in_subnet "${IFACE_IPV6_GW[$iface]}" "${IFACE_IPV6_ADDR[$iface]}")
            if [[ "$in_subnet" != "yes" ]]; then
                log_warn "IPv6 网关 ${IFACE_IPV6_GW[$iface]} 不在子网内，添加 GatewayOnLink"
                cat >> "$config_file" << EOF

[Route]
Gateway=${IFACE_IPV6_GW[$iface]}
GatewayOnLink=yes
EOF
            fi
        fi
        
        # Link
        cat >> "$config_file" << EOF

[Link]
RequiredForOnline=routable
EOF
        [[ -n "${IFACE_MTU[$iface]}" ]] && echo "MTUBytes=${IFACE_MTU[$iface]}" >> "$config_file"
        [[ -n "${IFACE_MAC[$iface]}" ]] && echo "MACAddress=${IFACE_MAC[$iface]}" >> "$config_file"
        
        chmod 644 "$config_file"
        ((priority+=10))
    done
    
    log_info "配置文件生成完成"
}

# 配置 systemd-resolved
configure_resolved() {
    log_step "配置 systemd-resolved..."
    
    # 收集 DNS
    local all_dns=""
    local seen=""
    for iface in "${IFACE_LIST[@]}"; do
        for dns in ${IFACE_DNS4[$iface]} ${IFACE_DNS6[$iface]}; do
            if [[ -n "$dns" ]] && [[ ! " $seen " =~ " $dns " ]]; then
                all_dns="$all_dns $dns"
                seen="$seen $dns"
            fi
        done
    done
    all_dns=$(echo "$all_dns" | sed 's/^ //')
    [[ -z "$all_dns" ]] && all_dns="1.1.1.1 8.8.8.8"
    
    # 直接写入主配置文件
    cat > /etc/systemd/resolved.conf << EOF
# Auto-generated by migration script
[Resolve]
DNS=$all_dns
FallbackDNS=1.1.1.1 8.8.8.8 2606:4700:4700::1111 2001:4860:4860::8888
DNSStubListener=yes
DNSSEC=no
EOF
    
    # 清理 .d 目录的配置
    rm -f /etc/systemd/resolved.conf.d/*.conf 2>/dev/null || true
    
    log_info "systemd-resolved 配置完成"
}

# 禁用 ifupdown
disable_ifupdown() {
    log_step "禁用 ifupdown..."
    
    if [[ -f /etc/network/interfaces ]]; then
        mv /etc/network/interfaces /etc/network/interfaces.bak.$(date +%Y%m%d-%H%M%S)
        cat > /etc/network/interfaces << EOF
# Migrated to systemd-networkd
auto lo
iface lo inet loopback
EOF
    fi
    
    systemctl stop networking 2>/dev/null || true
    systemctl disable networking 2>/dev/null || true
    
    log_info "ifupdown 已禁用"
}

# 启用 systemd-networkd 和 resolved
enable_services() {
    log_step "启用 systemd-networkd 和 systemd-resolved..."
    
    # 确保无残留配置
    rm -rf /etc/systemd/system/systemd-resolved.service.d 2>/dev/null || true
    systemctl daemon-reload
    
    # 启用服务
    systemctl enable systemd-networkd
    systemctl enable systemd-resolved
    
    # 先确保 DNS 可用
    ensure_dns
    
    # 启动 resolved
    systemctl restart systemd-resolved
    sleep 1
    
    # 检查 resolved 是否成功启动
    if ! systemctl is-active --quiet systemd-resolved; then
        log_error "systemd-resolved 启动失败"
        log_warn "尝试查看日志..."
        journalctl -u systemd-resolved --no-pager | tail -20
        
        log_warn "将使用传统 DNS 配置方式继续..."
        # 保持使用普通 resolv.conf
        return 1
    fi
    
    # resolved 启动成功，配置 resolv.conf 链接
    rm -f /etc/resolv.conf
    ln -sf /run/systemd/resolve/stub-resolv.conf /etc/resolv.conf
    
    log_info "服务已启用"
    return 0
}

# 应用配置
apply_config() {
    log_step "应用新网络配置..."
    
    systemctl restart systemd-networkd
    
    log_info "等待网络就绪..."
    local waited=0
    while [[ $waited -lt 15 ]]; do
        if ip route show default 2>/dev/null | grep -q "default"; then
            break
        fi
        sleep 1
        ((waited++))
    done
    
    sleep 2
    log_info "配置已应用"
}

# 验证配置
verify_config() {
    log_step "验证网络配置..."
    
    echo ""
    echo "=========================================="
    echo "网络状态:"
    echo "=========================================="
    networkctl status --no-pager 2>/dev/null || ip addr show
    
    echo ""
    echo "=========================================="
    echo "路由表:"
    echo "=========================================="
    echo "IPv4:"
    ip -4 route show
    echo ""
    echo "IPv6:"
    ip -6 route show 2>/dev/null || echo "无"
    
    echo ""
    echo "=========================================="
    echo "连通性测试:"
    echo "=========================================="
    
    if run_with_timeout 5 ping -4 -c 2 1.1.1.1 &>/dev/null; then
        log_info "IPv4: 正常 ✓"
    else
        log_warn "IPv4: 异常 ✗"
    fi
    
    if run_with_timeout 5 ping -6 -c 2 2606:4700:4700::1111 &>/dev/null; then
        log_info "IPv6: 正常 ✓"
    else
        log_warn "IPv6: 异常或不支持 ✗"
    fi
    
    if run_with_timeout 5 host google.com &>/dev/null || run_with_timeout 5 nslookup google.com &>/dev/null; then
        log_info "DNS: 正常 ✓"
    else
        log_warn "DNS: 异常 ✗"
    fi
    
    echo ""
}

# 生成回滚脚本
generate_rollback_script() {
    log_step "生成回滚脚本..."
    
    cat > /root/rollback-to-ifupdown.sh << ROLLBACK_EOF
#!/bin/bash
# 回滚脚本 - 备份目录: $BACKUP_DIR

set -e
echo "开始回滚..."

systemctl stop systemd-networkd 2>/dev/null || true
systemctl stop systemd-resolved 2>/dev/null || true
systemctl disable systemd-networkd 2>/dev/null || true
systemctl disable systemd-resolved 2>/dev/null || true

rm -f /etc/systemd/network/*.network
rm -rf /etc/systemd/system/systemd-resolved.service.d 2>/dev/null || true

rm -f /etc/resolv.conf
cat > /etc/resolv.conf << 'DNSEOF'
nameserver 1.1.1.1
nameserver 8.8.8.8
DNSEOF

if [[ -f "$BACKUP_DIR/interfaces" ]]; then
    cp "$BACKUP_DIR/interfaces" /etc/network/interfaces
fi

systemctl enable networking
systemctl restart networking

echo "回滚完成！"
ROLLBACK_EOF
    
    chmod +x /root/rollback-to-ifupdown.sh
    log_info "回滚脚本: /root/rollback-to-ifupdown.sh"
}

# 显示最终状态
show_final_status() {
    echo ""
    echo "=========================================="
    echo -e "${GREEN}迁移完成！${NC}"
    echo "=========================================="
    echo ""
    echo "配置文件:"
    ls -la /etc/systemd/network/*.network 2>/dev/null || echo "无"
    echo ""
    echo "服务状态:"
    echo "  systemd-networkd: $(systemctl is-active systemd-networkd)"
    echo "  systemd-resolved: $(systemctl is-active systemd-resolved)"
    echo ""
    echo -e "${YELLOW}如遇问题，运行: /root/rollback-to-ifupdown.sh${NC}"
    echo ""
}

# 主函数
main() {
    echo ""
    echo "=========================================="
    echo "ifupdown → systemd-networkd 迁移脚本 v2.2"
    echo "=========================================="
    echo ""
    
    check_root
    save_current_dns
    install_dependencies
    
    [[ ! -f /etc/network/interfaces ]] && { log_error "未找到 /etc/network/interfaces"; exit 1; }
    
    backup_config
    parse_interfaces
    
    [[ ${#IFACE_LIST[@]} -eq 0 ]] && { log_error "未检测到网络接口"; exit 1; }
    
    show_parsed_config
    
    echo -e "${YELLOW}即将迁移，可能短暂中断网络${NC}"
    echo -n "是否继续? [y/N]: "
    read -r confirm
    [[ "$confirm" != "y" && "$confirm" != "Y" ]] && { log_info "已取消"; exit 0; }
    
    generate_networkd_config
    configure_resolved
    generate_rollback_script
    disable_ifupdown
    enable_services
    apply_config
    verify_config
    show_final_status
}

main "$@"
