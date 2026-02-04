#!/bin/bash

# ============================================================================
# ifupdown to systemd-networkd 一键迁移脚本 v2.1
# 适用于 Debian 13 系统
# 自动识别网络接口和配置，自动完成迁移
# 自动处理网关不在子网内等特殊情况
# 自动安装依赖，防止断网
# ============================================================================

set -e

# 颜色定义
RED='\033[0;31m'
GREEN='\033[0;32m'
YELLOW='\033[1;33m'
BLUE='\033[0;34m'
NC='\033[0m' # No Color

# 日志函数
log_info() { echo -e "${GREEN}[INFO]${NC} $1"; }
log_warn() { echo -e "${YELLOW}[WARN]${NC} $1"; }
log_error() { echo -e "${RED}[ERROR]${NC} $1"; }
log_step() { echo -e "${BLUE}[STEP]${NC} $1"; }

# 全局关联数组
declare -gA IFACE_IPV4_ADDR
declare -gA IFACE_IPV4_GW
declare -gA IFACE_IPV6_ADDR
declare -gA IFACE_IPV6_GW
declare -gA IFACE_DNS4
declare -gA IFACE_DNS6
declare -gA IFACE_ACCEPT_RA
declare -gA IFACE_AUTOCONF
declare -gA IFACE_MTU
declare -gA IFACE_MAC
declare -ga IFACE_LIST=()

# 超时设置（秒）
TIMEOUT_PING=3
TIMEOUT_CMD=10

# 带超时的命令执行
run_with_timeout() {
    local timeout=$1
    shift
    timeout "$timeout" "$@" 2>/dev/null
    return $?
}

# 检查是否为root用户
check_root() {
    if [[ $EUID -ne 0 ]]; then
        log_error "此脚本必须以root用户运行"
        exit 1
    fi
}

# 保存当前 DNS 配置（防止安装软件包时断网）
save_current_dns() {
    log_step "保存当前 DNS 配置..."
    
    # 备份当前 resolv.conf
    if [[ -f /etc/resolv.conf ]] && [[ ! -L /etc/resolv.conf ]]; then
        cp /etc/resolv.conf /tmp/resolv.conf.migration.bak
    elif [[ -L /etc/resolv.conf ]]; then
        cat /etc/resolv.conf > /tmp/resolv.conf.migration.bak 2>/dev/null || true
    fi
    
    # 提取当前使用的 DNS
    CURRENT_DNS=$(grep -E '^nameserver' /etc/resolv.conf 2>/dev/null | awk '{print $2}' | head -3 | tr '\n' ' ')
    
    if [[ -z "$CURRENT_DNS" ]]; then
        CURRENT_DNS="1.1.1.1 8.8.8.8"
    fi
    
    log_info "当前 DNS: $CURRENT_DNS"
}

# 确保 DNS 可用（防止断网）
ensure_dns_available() {
    # 如果 resolv.conf 是空的或指向 127.0.0.53 但 resolved 未运行
    if ! run_with_timeout $TIMEOUT_PING ping -c 1 1.1.1.1 &>/dev/null; then
        log_warn "网络可能不通，尝试恢复 DNS..."
    fi
    
    # 检查当前 DNS 是否工作
    local dns_works=false
    if run_with_timeout $TIMEOUT_CMD host google.com &>/dev/null || \
       run_with_timeout $TIMEOUT_CMD nslookup google.com &>/dev/null || \
       run_with_timeout $TIMEOUT_CMD dig +short google.com &>/dev/null; then
        dns_works=true
    fi
    
    if [[ "$dns_works" == "false" ]]; then
        log_warn "DNS 解析失败，临时修复..."
        
        # 临时设置可用的 DNS
        if [[ -L /etc/resolv.conf ]]; then
            rm -f /etc/resolv.conf
        fi
        
        cat > /etc/resolv.conf << EOF
# Temporary DNS configuration for migration
nameserver 1.1.1.1
nameserver 8.8.8.8
nameserver 2606:4700:4700::1111
EOF
        log_info "已临时设置 DNS"
    fi
}

# 安装依赖包
install_dependencies() {
    log_step "检查并安装依赖..."
    
    local packages_to_install=""
    
    # 检查 systemd-resolved
    if ! dpkg -l | grep -q "^ii.*systemd-resolved"; then
        packages_to_install="$packages_to_install systemd-resolved"
    fi
    
    # 检查 dnsutils（用于 DNS 测试）
    if ! command -v host &>/dev/null && ! command -v nslookup &>/dev/null; then
        packages_to_install="$packages_to_install dnsutils"
    fi
    
    if [[ -n "$packages_to_install" ]]; then
        log_info "需要安装:$packages_to_install"
        
        # 确保 DNS 可用
        ensure_dns_available
        
        # 更新软件源（带超时）
        log_info "更新软件源..."
        if ! run_with_timeout 60 apt-get update -qq; then
            log_warn "apt-get update 超时或失败，尝试继续..."
        fi
        
        # 安装前先配置 resolved，防止安装后 DNS 断掉
        pre_configure_resolved
        
        # 安装软件包
        log_info "安装软件包..."
        
        # 设置非交互模式
        export DEBIAN_FRONTEND=noninteractive
        
        # 安装时阻止 systemd-resolved 立即接管 DNS
        if [[ "$packages_to_install" =~ "systemd-resolved" ]]; then
            # 创建临时 override 防止服务自动启动
            mkdir -p /etc/systemd/system/systemd-resolved.service.d
            cat > /etc/systemd/system/systemd-resolved.service.d/temp-disable.conf << EOF
[Service]
ExecStart=
ExecStart=/bin/true
EOF
            systemctl daemon-reload
        fi
        
        # 安装
        if ! run_with_timeout 120 apt-get install -y -qq $packages_to_install; then
            log_error "软件包安装失败"
            # 清理临时配置
            rm -f /etc/systemd/system/systemd-resolved.service.d/temp-disable.conf
            rmdir /etc/systemd/system/systemd-resolved.service.d 2>/dev/null || true
            systemctl daemon-reload
            exit 1
        fi
        
        # 移除临时 override
        rm -f /etc/systemd/system/systemd-resolved.service.d/temp-disable.conf
        rmdir /etc/systemd/system/systemd-resolved.service.d 2>/dev/null || true
        systemctl daemon-reload
        
        log_info "依赖安装完成"
    else
        log_info "所有依赖已满足"
    fi
}

# 预配置 systemd-resolved（在启动服务前）
pre_configure_resolved() {
    log_step "预配置 systemd-resolved..."
    
    mkdir -p /etc/systemd/resolved.conf.d
    
    # 使用当前已知的 DNS 或默认 DNS
    local dns_servers="1.1.1.1 8.8.8.8"
    
    if [[ -n "$CURRENT_DNS" ]]; then
        dns_servers="$CURRENT_DNS"
    fi
    
    cat > /etc/systemd/resolved.conf.d/00-migration-fallback.conf << EOF
# Fallback DNS configuration during migration
# This ensures DNS works even before full configuration
[Resolve]
DNS=$dns_servers
FallbackDNS=1.1.1.1 8.8.8.8 2606:4700:4700::1111 2001:4860:4860::8888
DNSStubListener=yes
DNSSEC=no
EOF
    
    chmod 644 /etc/systemd/resolved.conf.d/00-migration-fallback.conf
    log_info "systemd-resolved 预配置完成"
}

# 备份原配置
backup_config() {
    log_step "备份原有网络配置..."
    local backup_dir="/root/network-backup-$(date +%Y%m%d-%H%M%S)"
    mkdir -p "$backup_dir"
    
    if [[ -f /etc/network/interfaces ]]; then
        cp /etc/network/interfaces "$backup_dir/"
    fi
    
    if [[ -d /etc/network/interfaces.d ]]; then
        cp -r /etc/network/interfaces.d "$backup_dir/" 2>/dev/null || true
    fi
    
    # 备份当前路由表
    ip route show > "$backup_dir/routes-ipv4.txt" 2>/dev/null || true
    ip -6 route show > "$backup_dir/routes-ipv6.txt" 2>/dev/null || true
    
    # 备份当前 IP 配置
    ip addr show > "$backup_dir/ip-addr.txt" 2>/dev/null || true
    
    # 备份 resolv.conf
    if [[ -f /etc/resolv.conf ]]; then
        cat /etc/resolv.conf > "$backup_dir/resolv.conf" 2>/dev/null || true
    fi
    
    log_info "配置已备份到: $backup_dir"
    echo "$backup_dir"
}

# 检查 IPv6 地址是否在子网内
ipv6_in_subnet() {
    local addr="$1"
    local subnet="$2"
    
    if command -v python3 &>/dev/null; then
        python3 << PYEOF
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

# 检查 IPv4 地址是否在子网内
ipv4_in_subnet() {
    local gw="$1"
    local subnet="$2"
    
    if command -v python3 &>/dev/null; then
        python3 << PYEOF
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
    
    local addr_part="${subnet%/*}"
    local prefix="${subnet#*/}"
    
    IFS='.' read -ra ADDR <<< "$addr_part"
    IFS='.' read -ra GW <<< "$gw"
    
    case "$prefix" in
        24) [[ "${ADDR[0]}.${ADDR[1]}.${ADDR[2]}" == "${GW[0]}.${GW[1]}.${GW[2]}" ]] && echo "yes" || echo "no" ;;
        25) [[ "${ADDR[0]}.${ADDR[1]}.${ADDR[2]}" == "${GW[0]}.${GW[1]}.${GW[2]}" ]] && echo "yes" || echo "no" ;;
        16) [[ "${ADDR[0]}.${ADDR[1]}" == "${GW[0]}.${GW[1]}" ]] && echo "yes" || echo "no" ;;
        8)  [[ "${ADDR[0]}" == "${GW[0]}" ]] && echo "yes" || echo "no" ;;
        *)  echo "no" ;;
    esac
}

# 解析 /etc/network/interfaces 文件
parse_interfaces() {
    log_step "解析当前网络配置..."
    
    local interfaces_file="/etc/network/interfaces"
    
    rm -f /tmp/interfaces_combined.tmp
    
    process_interfaces_file "$interfaces_file"
    
    if [[ ! -f /tmp/interfaces_combined.tmp ]]; then
        log_error "无法解析网络配置"
        exit 1
    fi
    
    parse_combined_config
}

# 递归处理 interfaces 文件
process_interfaces_file() {
    local file="$1"
    
    [[ ! -f "$file" ]] && return
    
    while IFS= read -r line || [[ -n "$line" ]]; do
        if [[ "$line" =~ ^[[:space:]]*source[[:space:]]+(.*) ]]; then
            local source_pattern="${BASH_REMATCH[1]}"
            for source_file in $source_pattern; do
                if [[ -f "$source_file" ]]; then
                    process_interfaces_file "$source_file"
                fi
            done
            continue
        fi
        
        if [[ "$line" =~ ^[[:space:]]*source-directory[[:space:]]+(.*) ]]; then
            local source_dir="${BASH_REMATCH[1]}"
            if [[ -d "$source_dir" ]]; then
                for source_file in "$source_dir"/*; do
                    if [[ -f "$source_file" ]]; then
                        process_interfaces_file "$source_file"
                    fi
                done
            fi
            continue
        fi
        
        echo "$line" >> /tmp/interfaces_combined.tmp
        
    done < "$file"
}

# 解析合并后的配置
parse_combined_config() {
    local current_iface=""
    local current_family=""
    
    while IFS= read -r line || [[ -n "$line" ]]; do
        [[ "$line" =~ ^[[:space:]]*# ]] && continue
        [[ -z "${line// }" ]] && continue
        
        line=$(echo "$line" | sed 's/^[[:space:]]*//;s/[[:space:]]*$//')
        
        if [[ "$line" =~ ^auto[[:space:]]+(.+) ]]; then
            local ifaces="${BASH_REMATCH[1]}"
            for iface in $ifaces; do
                if [[ "$iface" != "lo" ]] && [[ ! " ${IFACE_LIST[*]} " =~ " ${iface} " ]]; then
                    IFACE_LIST+=("$iface")
                fi
            done
            continue
        fi
        
        if [[ "$line" =~ ^allow-hotplug[[:space:]]+(.+) ]]; then
            local ifaces="${BASH_REMATCH[1]}"
            for iface in $ifaces; do
                if [[ "$iface" != "lo" ]] && [[ ! " ${IFACE_LIST[*]} " =~ " ${iface} " ]]; then
                    IFACE_LIST+=("$iface")
                fi
            done
            continue
        fi
        
        if [[ "$line" =~ ^iface[[:space:]]+([^[:space:]]+)[[:space:]]+(inet6?)[[:space:]]+(.+) ]]; then
            current_iface="${BASH_REMATCH[1]}"
            current_family="${BASH_REMATCH[2]}"
            
            [[ "$current_iface" == "lo" ]] && continue
            
            if [[ ! " ${IFACE_LIST[*]} " =~ " ${current_iface} " ]]; then
                IFACE_LIST+=("$current_iface")
            fi
            continue
        fi
        
        [[ "$current_iface" == "lo" ]] && continue
        [[ -z "$current_iface" ]] && continue
        
        if [[ "$line" =~ ^address[[:space:]]+(.+) ]]; then
            local addr="${BASH_REMATCH[1]}"
            if [[ "$current_family" == "inet" ]]; then
                IFACE_IPV4_ADDR[$current_iface]="$addr"
            else
                IFACE_IPV6_ADDR[$current_iface]="$addr"
            fi
            continue
        fi
        
        if [[ "$line" =~ ^netmask[[:space:]]+(.+) ]]; then
            local netmask="${BASH_REMATCH[1]}"
            if [[ "$current_family" == "inet" ]] && [[ -n "${IFACE_IPV4_ADDR[$current_iface]}" ]]; then
                if [[ ! "${IFACE_IPV4_ADDR[$current_iface]}" =~ / ]]; then
                    local cidr=$(netmask_to_cidr "$netmask")
                    IFACE_IPV4_ADDR[$current_iface]="${IFACE_IPV4_ADDR[$current_iface]}/$cidr"
                fi
            fi
            continue
        fi
        
        if [[ "$line" =~ ^gateway[[:space:]]+(.+) ]]; then
            local gw="${BASH_REMATCH[1]}"
            if [[ "$current_family" == "inet" ]]; then
                IFACE_IPV4_GW[$current_iface]="$gw"
            else
                IFACE_IPV6_GW[$current_iface]="$gw"
            fi
            continue
        fi
        
        if [[ "$line" =~ ^dns-nameservers[[:space:]]+(.+) ]]; then
            local dns_list="${BASH_REMATCH[1]}"
            for dns in $dns_list; do
                if [[ "$dns" =~ : ]]; then
                    if [[ -n "${IFACE_DNS6[$current_iface]}" ]]; then
                        IFACE_DNS6[$current_iface]="${IFACE_DNS6[$current_iface]} $dns"
                    else
                        IFACE_DNS6[$current_iface]="$dns"
                    fi
                else
                    if [[ -n "${IFACE_DNS4[$current_iface]}" ]]; then
                        IFACE_DNS4[$current_iface]="${IFACE_DNS4[$current_iface]} $dns"
                    else
                        IFACE_DNS4[$current_iface]="$dns"
                    fi
                fi
            done
            continue
        fi
        
        if [[ "$line" =~ ^dns-nameserver[[:space:]]+(.+) ]]; then
            local dns="${BASH_REMATCH[1]}"
            if [[ "$dns" =~ : ]]; then
                if [[ -n "${IFACE_DNS6[$current_iface]}" ]]; then
                    IFACE_DNS6[$current_iface]="${IFACE_DNS6[$current_iface]} $dns"
                else
                    IFACE_DNS6[$current_iface]="$dns"
                fi
            else
                if [[ -n "${IFACE_DNS4[$current_iface]}" ]]; then
                    IFACE_DNS4[$current_iface]="${IFACE_DNS4[$current_iface]} $dns"
                else
                    IFACE_DNS4[$current_iface]="$dns"
                fi
            fi
            continue
        fi
        
        if [[ "$line" =~ ^accept_ra[[:space:]]+(.+) ]]; then
            IFACE_ACCEPT_RA[$current_iface]="${BASH_REMATCH[1]}"
            continue
        fi
        
        if [[ "$line" =~ ^autoconf[[:space:]]+(.+) ]]; then
            IFACE_AUTOCONF[$current_iface]="${BASH_REMATCH[1]}"
            continue
        fi
        
        if [[ "$line" =~ ^mtu[[:space:]]+(.+) ]]; then
            IFACE_MTU[$current_iface]="${BASH_REMATCH[1]}"
            continue
        fi
        
        if [[ "$line" =~ ^hwaddress[[:space:]]+(ether[[:space:]]+)?(.+) ]]; then
            IFACE_MAC[$current_iface]="${BASH_REMATCH[2]}"
            continue
        fi
        
    done < /tmp/interfaces_combined.tmp
    
    rm -f /tmp/interfaces_combined.tmp
}

# netmask 转 CIDR
netmask_to_cidr() {
    local netmask="$1"
    local cidr=0
    
    IFS='.' read -ra OCTETS <<< "$netmask"
    for octet in "${OCTETS[@]}"; do
        case "$octet" in
            255) ((cidr+=8)) ;;
            254) ((cidr+=7)) ;;
            252) ((cidr+=6)) ;;
            248) ((cidr+=5)) ;;
            240) ((cidr+=4)) ;;
            224) ((cidr+=3)) ;;
            192) ((cidr+=2)) ;;
            128) ((cidr+=1)) ;;
            0) ;;
        esac
    done
    
    echo "$cidr"
}

# 显示解析到的配置
show_parsed_config() {
    log_step "检测到的网络配置:"
    echo "----------------------------------------"
    
    for iface in "${IFACE_LIST[@]}"; do
        echo -e "${BLUE}接口: $iface${NC}"
        
        if [[ -n "${IFACE_IPV4_ADDR[$iface]}" ]]; then
            echo "  IPv4 地址: ${IFACE_IPV4_ADDR[$iface]}"
            echo "  IPv4 网关: ${IFACE_IPV4_GW[$iface]}"
        fi
        
        if [[ -n "${IFACE_IPV6_ADDR[$iface]}" ]]; then
            echo "  IPv6 地址: ${IFACE_IPV6_ADDR[$iface]}"
            echo "  IPv6 网关: ${IFACE_IPV6_GW[$iface]}"
        fi
        
        if [[ -n "${IFACE_DNS4[$iface]}" ]]; then
            echo "  DNS (IPv4): ${IFACE_DNS4[$iface]}"
        fi
        
        if [[ -n "${IFACE_DNS6[$iface]}" ]]; then
            echo "  DNS (IPv6): ${IFACE_DNS6[$iface]}"
        fi
        
        if [[ -n "${IFACE_MTU[$iface]}" ]]; then
            echo "  MTU: ${IFACE_MTU[$iface]}"
        fi
        
        if [[ -n "${IFACE_MAC[$iface]}" ]]; then
            echo "  MAC: ${IFACE_MAC[$iface]}"
        fi
        
        echo ""
    done
    echo "----------------------------------------"
}

# 生成 systemd-networkd 配置文件
generate_networkd_config() {
    log_step "生成 systemd-networkd 配置文件..."
    
    local networkd_dir="/etc/systemd/network"
    mkdir -p "$networkd_dir"
    
    local priority=10
    
    for iface in "${IFACE_LIST[@]}"; do
        local config_file="${networkd_dir}/${priority}-${iface}.network"
        
        log_info "生成配置文件: $config_file"
        
        cat > "$config_file" << EOF
# Auto-generated by migration script
# Original interface: $iface
# Generated at: $(date)

[Match]
Name=$iface

[Network]
EOF
        
        # IPv4 配置
        if [[ -n "${IFACE_IPV4_ADDR[$iface]}" ]]; then
            echo "Address=${IFACE_IPV4_ADDR[$iface]}" >> "$config_file"
            
            if [[ -n "${IFACE_IPV4_GW[$iface]}" ]]; then
                local ipv4_gw_onlink=$(ipv4_in_subnet "${IFACE_IPV4_GW[$iface]}" "${IFACE_IPV4_ADDR[$iface]}")
                if [[ "$ipv4_gw_onlink" == "yes" ]]; then
                    echo "Gateway=${IFACE_IPV4_GW[$iface]}" >> "$config_file"
                fi
            fi
        fi
        
        # IPv6 配置
        if [[ -n "${IFACE_IPV6_ADDR[$iface]}" ]]; then
            echo "Address=${IFACE_IPV6_ADDR[$iface]}" >> "$config_file"
            
            if [[ -n "${IFACE_IPV6_GW[$iface]}" ]]; then
                local ipv6_gw_onlink=$(ipv6_in_subnet "${IFACE_IPV6_GW[$iface]}" "${IFACE_IPV6_ADDR[$iface]}")
                if [[ "$ipv6_gw_onlink" == "yes" ]]; then
                    echo "Gateway=${IFACE_IPV6_GW[$iface]}" >> "$config_file"
                fi
            fi
        fi
        
        # DNS 配置
        local all_dns=""
        if [[ -n "${IFACE_DNS4[$iface]}" ]]; then
            all_dns="${IFACE_DNS4[$iface]}"
        fi
        if [[ -n "${IFACE_DNS6[$iface]}" ]]; then
            if [[ -n "$all_dns" ]]; then
                all_dns="$all_dns ${IFACE_DNS6[$iface]}"
            else
                all_dns="${IFACE_DNS6[$iface]}"
            fi
        fi
        
        if [[ -n "$all_dns" ]]; then
            local seen_dns=""
            for dns in $all_dns; do
                if [[ ! " $seen_dns " =~ " $dns " ]]; then
                    echo "DNS=$dns" >> "$config_file"
                    seen_dns="$seen_dns $dns"
                fi
            done
        fi
        
        # IPv6 RA 配置
        if [[ -n "${IFACE_IPV6_ADDR[$iface]}" ]]; then
            echo "IPv6AcceptRA=no" >> "$config_file"
        fi
        
        # DHCP（如果没有静态地址）
        if [[ -z "${IFACE_IPV4_ADDR[$iface]}" ]] && [[ -z "${IFACE_IPV6_ADDR[$iface]}" ]]; then
            echo "DHCP=yes" >> "$config_file"
        fi
        
        # IPv4 网关不在子网内
        if [[ -n "${IFACE_IPV4_GW[$iface]}" ]]; then
            local ipv4_gw_onlink=$(ipv4_in_subnet "${IFACE_IPV4_GW[$iface]}" "${IFACE_IPV4_ADDR[$iface]}")
            if [[ "$ipv4_gw_onlink" != "yes" ]]; then
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
            local ipv6_gw_onlink=$(ipv6_in_subnet "${IFACE_IPV6_GW[$iface]}" "${IFACE_IPV6_ADDR[$iface]}")
            if [[ "$ipv6_gw_onlink" != "yes" ]]; then
                log_warn "IPv6 网关 ${IFACE_IPV6_GW[$iface]} 不在子网内，添加 GatewayOnLink"
                cat >> "$config_file" << EOF

[Route]
Gateway=${IFACE_IPV6_GW[$iface]}
GatewayOnLink=yes
EOF
            fi
        fi
        
        # Link 配置
        cat >> "$config_file" << EOF

[Link]
RequiredForOnline=routable
EOF
        
        if [[ -n "${IFACE_MTU[$iface]}" ]]; then
            echo "MTUBytes=${IFACE_MTU[$iface]}" >> "$config_file"
        fi
        
        if [[ -n "${IFACE_MAC[$iface]}" ]]; then
            echo "MACAddress=${IFACE_MAC[$iface]}" >> "$config_file"
        fi
        
        chmod 644 "$config_file"
        
        ((priority+=10))
    done
    
    log_info "配置文件生成完成"
}

# 配置 systemd-resolved (最终配置)
configure_resolved() {
    log_step "配置 systemd-resolved..."
    
    mkdir -p /etc/systemd/resolved.conf.d
    
    # 收集所有 DNS（去重）
    local all_dns=""
    local seen_dns=""
    
    for iface in "${IFACE_LIST[@]}"; do
        for dns in ${IFACE_DNS4[$iface]} ${IFACE_DNS6[$iface]}; do
            if [[ -n "$dns" ]] && [[ ! " $seen_dns " =~ " $dns " ]]; then
                all_dns="$all_dns $dns"
                seen_dns="$seen_dns $dns"
            fi
        done
    done
    
    all_dns=$(echo "$all_dns" | sed 's/^ //;s/ $//')
    
    # 如果没有解析到 DNS，使用默认值
    if [[ -z "$all_dns" ]]; then
        all_dns="1.1.1.1 8.8.8.8"
    fi
    
    # 删除临时配置，写入最终配置
    rm -f /etc/systemd/resolved.conf.d/00-migration-fallback.conf
    
    cat > /etc/systemd/resolved.conf.d/dns.conf << EOF
# Auto-generated by migration script
[Resolve]
DNS=$all_dns
FallbackDNS=1.1.1.1 8.8.8.8 2606:4700:4700::1111 2001:4860:4860::8888
DNSStubListener=yes
DNSSEC=no
EOF
    
    chmod 644 /etc/systemd/resolved.conf.d/dns.conf
    log_info "systemd-resolved 配置完成"
}

# 禁用 ifupdown
disable_ifupdown() {
    log_step "禁用 ifupdown..."
    
    if [[ -f /etc/network/interfaces ]]; then
        mv /etc/network/interfaces /etc/network/interfaces.bak.$(date +%Y%m%d-%H%M%S)
        
        cat > /etc/network/interfaces << EOF
# Network configuration has been migrated to systemd-networkd
# Original configuration backed up with .bak extension

auto lo
iface lo inet loopback
EOF
    fi
    
    if systemctl is-active --quiet networking 2>/dev/null; then
        systemctl stop networking || true
    fi
    
    if systemctl is-enabled --quiet networking 2>/dev/null; then
        systemctl disable networking || true
    fi
    
    log_info "ifupdown 已禁用"
}

# 启用 systemd-networkd
enable_networkd() {
    log_step "启用 systemd-networkd..."
    
    # 启用服务
    systemctl enable systemd-networkd
    systemctl enable systemd-resolved
    
    # 先启动 resolved（确保 DNS 可用）
    systemctl restart systemd-resolved
    
    # 等待 resolved 就绪
    sleep 1
    
    # 配置 resolv.conf 软链接
    if [[ -f /etc/resolv.conf ]] && [[ ! -L /etc/resolv.conf ]]; then
        mv /etc/resolv.conf /etc/resolv.conf.bak.$(date +%Y%m%d-%H%M%S)
    elif [[ -L /etc/resolv.conf ]]; then
        rm -f /etc/resolv.conf
    fi
    ln -sf /run/systemd/resolve/stub-resolv.conf /etc/resolv.conf
    
    log_info "systemd-networkd 已启用"
}

# 应用新配置
apply_config() {
    log_step "应用新网络配置..."
    
    # 重启 networkd
    systemctl restart systemd-networkd
    
    log_info "等待网络就绪..."
    
    # 等待网络就绪（带超时）
    local max_wait=15
    local waited=0
    while [[ $waited -lt $max_wait ]]; do
        if ip route show default 2>/dev/null | grep -q "default"; then
            break
        fi
        sleep 1
        ((waited++))
    done
    
    # 额外等待确保稳定
    sleep 2
    
    log_info "新配置已应用"
}

# 验证配置
verify_config() {
    log_step "验证网络配置..."
    
    echo ""
    echo "=========================================="
    echo "网络接口状态:"
    echo "=========================================="
    networkctl status --no-pager 2>/dev/null || ip addr show
    
    echo ""
    echo "=========================================="
    echo "IPv4 路由表:"
    echo "=========================================="
    ip -4 route show
    
    echo ""
    echo "=========================================="
    echo "IPv6 路由表:"
    echo "=========================================="
    ip -6 route show 2>/dev/null || echo "无 IPv6 路由"
    
    echo ""
    echo "=========================================="
    echo "DNS 配置:"
    echo "=========================================="
    resolvectl status 2>/dev/null || cat /etc/resolv.conf
    
    echo ""
    echo "=========================================="
    echo "连通性测试:"
    echo "=========================================="
    
    # IPv4 测试
    if run_with_timeout $TIMEOUT_PING ping -4 -c 2 1.1.1.1 &>/dev/null; then
        log_info "IPv4 连通性: 正常 ✓"
    else
        log_warn "IPv4 连通性: 异常 ✗"
    fi
    
    # IPv6 测试
    if run_with_timeout $TIMEOUT_PING ping -6 -c 2 2606:4700:4700::1111 &>/dev/null; then
        log_info "IPv6 连通性: 正常 ✓"
    else
        log_warn "IPv6 连通性: 异常或不支持 ✗"
    fi
    
    # DNS 测试
    if run_with_timeout $TIMEOUT_CMD host google.com &>/dev/null || \
       run_with_timeout $TIMEOUT_CMD nslookup google.com &>/dev/null; then
        log_info "DNS 解析: 正常 ✓"
    else
        log_warn "DNS 解析: 异常 ✗"
    fi
    
    echo ""
}

# 生成回滚脚本
generate_rollback_script() {
    local backup_dir="$1"
    local rollback_script="/root/rollback-to-ifupdown.sh"
    
    log_step "生成回滚脚本: $rollback_script"
    
    cat > "$rollback_script" << ROLLBACK_EOF
#!/bin/bash
# 回滚脚本：从 systemd-networkd 恢复到 ifupdown
# 备份目录: $backup_dir

set -e

echo "开始回滚到 ifupdown..."

# 停止服务
systemctl stop systemd-networkd || true
systemctl stop systemd-resolved || true
systemctl disable systemd-networkd || true
systemctl disable systemd-resolved || true

# 删除配置
rm -f /etc/systemd/network/*.network
rm -f /etc/systemd/resolved.conf.d/*.conf

# 恢复 resolv.conf
rm -f /etc/resolv.conf
cat > /etc/resolv.conf << 'DNSEOF'
nameserver 1.1.1.1
nameserver 8.8.8.8
DNSEOF

# 恢复备份
BACKUP_DIR="$backup_dir"
if [[ -d "\$BACKUP_DIR" ]] && [[ -f "\$BACKUP_DIR/interfaces" ]]; then
    cp "\$BACKUP_DIR/interfaces" /etc/network/interfaces
    echo "已恢复 /etc/network/interfaces"
else
    echo "警告: 未找到备份文件"
fi

# 启用 networking
systemctl enable networking
systemctl restart networking

echo "回滚完成！"
ROLLBACK_EOF

    chmod +x "$rollback_script"
    log_info "回滚脚本已生成: $rollback_script"
}

# 显示最终状态
show_final_status() {
    echo ""
    echo "=========================================="
    echo -e "${GREEN}迁移完成！${NC}"
    echo "=========================================="
    echo ""
    echo "生成的配置文件:"
    ls -la /etc/systemd/network/*.network 2>/dev/null || echo "无"
    echo ""
    echo "服务状态:"
    echo "  systemd-networkd: $(systemctl is-active systemd-networkd)"
    echo "  systemd-resolved: $(systemctl is-active systemd-resolved)"
    echo ""
    echo -e "${YELLOW}如果网络出现问题，运行回滚脚本:${NC}"
    echo "  /root/rollback-to-ifupdown.sh"
    echo ""
}

# 主函数
main() {
    echo ""
    echo "=========================================="
    echo "ifupdown → systemd-networkd 迁移脚本 v2.1"
    echo "=========================================="
    echo ""
    
    check_root
    
    # 保存当前 DNS（在做任何事之前）
    save_current_dns
    
    # 安装依赖（会自动处理 DNS 问题）
    install_dependencies
    
    if [[ ! -f /etc/network/interfaces ]]; then
        log_error "未找到 /etc/network/interfaces 文件"
        exit 1
    fi
    
    backup_dir=$(backup_config)
    
    parse_interfaces
    
    if [[ ${#IFACE_LIST[@]} -eq 0 ]]; then
        log_error "未检测到任何网络接口配置"
        exit 1
    fi
    
    show_parsed_config
    
    echo -e "${YELLOW}即将进行迁移，这可能会短暂中断网络连接${NC}"
    echo -n "是否继续? [y/N]: "
    read -r confirm
    
    if [[ "$confirm" != "y" && "$confirm" != "Y" ]]; then
        log_info "迁移已取消"
        exit 0
    fi
    
    generate_networkd_config
    configure_resolved
    generate_rollback_script "$backup_dir"
    disable_ifupdown
    enable_networkd
    apply_config
    verify_config
    show_final_status
}

main "$@"
