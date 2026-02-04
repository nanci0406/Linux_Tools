#!/bin/bash

# ============================================================================
# ifupdown to systemd-networkd 一键迁移脚本
# 适用于 Debian 13 系统
# 自动识别网络接口和配置，自动完成迁移
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

# 检查是否为root用户
check_root() {
    if [[ $EUID -ne 0 ]]; then
        log_error "此脚本必须以root用户运行"
        exit 1
    fi
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
        cp -r /etc/network/interfaces.d "$backup_dir/"
    fi
    
    log_info "配置已备份到: $backup_dir"
    echo "$backup_dir"
}

# 解析 /etc/network/interfaces 文件
parse_interfaces() {
    log_step "解析当前网络配置..."
    
    local interfaces_file="/etc/network/interfaces"
    local current_iface=""
    local current_family=""
    
    # 清空临时文件
    rm -f /tmp/parsed_interfaces.conf
    
    while IFS= read -r line || [[ -n "$line" ]]; do
        # 跳过注释和空行
        [[ "$line" =~ ^[[:space:]]*# ]] && continue
        [[ -z "${line// }" ]] && continue
        
        # 处理 source 指令，读取额外配置文件
        if [[ "$line" =~ ^source[[:space:]]+(.*) ]]; then
            local source_pattern="${BASH_REMATCH[1]}"
            for source_file in $source_pattern; do
                if [[ -f "$source_file" ]]; then
                    cat "$source_file" >> /tmp/interfaces_combined.tmp
                fi
            done
            continue
        fi
        
        echo "$line" >> /tmp/interfaces_combined.tmp
        
    done < "$interfaces_file"
    
    # 如果没有额外文件，直接使用主配置
    [[ ! -f /tmp/interfaces_combined.tmp ]] && cp "$interfaces_file" /tmp/interfaces_combined.tmp
    
    # 解析合并后的配置
    parse_combined_config
}

# 解析合并后的配置
parse_combined_config() {
    local current_iface=""
    local current_family=""
    
    declare -gA IFACE_IPV4_ADDR
    declare -gA IFACE_IPV4_GW
    declare -gA IFACE_IPV6_ADDR
    declare -gA IFACE_IPV6_GW
    declare -gA IFACE_DNS4
    declare -gA IFACE_DNS6
    declare -gA IFACE_ACCEPT_RA
    declare -gA IFACE_AUTOCONF
    declare -ga IFACE_LIST=()
    
    while IFS= read -r line || [[ -n "$line" ]]; do
        # 跳过注释和空行
        [[ "$line" =~ ^[[:space:]]*# ]] && continue
        [[ -z "${line// }" ]] && continue
        
        # 去除前后空格
        line=$(echo "$line" | sed 's/^[[:space:]]*//;s/[[:space:]]*$//')
        
        # 匹配 auto 行
        if [[ "$line" =~ ^auto[[:space:]]+(.+) ]]; then
            local ifaces="${BASH_REMATCH[1]}"
            for iface in $ifaces; do
                if [[ "$iface" != "lo" ]] && [[ ! " ${IFACE_LIST[*]} " =~ " ${iface} " ]]; then
                    IFACE_LIST+=("$iface")
                fi
            done
            continue
        fi
        
        # 匹配 iface 行
        if [[ "$line" =~ ^iface[[:space:]]+([^[:space:]]+)[[:space:]]+(inet6?)[[:space:]]+(.+) ]]; then
            current_iface="${BASH_REMATCH[1]}"
            current_family="${BASH_REMATCH[2]}"
            local method="${BASH_REMATCH[3]}"
            
            # 跳过 loopback
            [[ "$current_iface" == "lo" ]] && continue
            
            # 添加到接口列表
            if [[ ! " ${IFACE_LIST[*]} " =~ " ${current_iface} " ]]; then
                IFACE_LIST+=("$current_iface")
            fi
            continue
        fi
        
        # 跳过 loopback 相关配置
        [[ "$current_iface" == "lo" ]] && continue
        [[ -z "$current_iface" ]] && continue
        
        # 解析地址
        if [[ "$line" =~ ^address[[:space:]]+(.+) ]]; then
            local addr="${BASH_REMATCH[1]}"
            if [[ "$current_family" == "inet" ]]; then
                IFACE_IPV4_ADDR[$current_iface]="$addr"
            else
                IFACE_IPV6_ADDR[$current_iface]="$addr"
            fi
            continue
        fi
        
        # 解析网关
        if [[ "$line" =~ ^gateway[[:space:]]+(.+) ]]; then
            local gw="${BASH_REMATCH[1]}"
            if [[ "$current_family" == "inet" ]]; then
                IFACE_IPV4_GW[$current_iface]="$gw"
            else
                IFACE_IPV6_GW[$current_iface]="$gw"
            fi
            continue
        fi
        
        # 解析 DNS (dns-nameservers 用于 IPv4，可能多个)
        if [[ "$line" =~ ^dns-nameservers?[[:space:]]+(.+) ]]; then
            local dns="${BASH_REMATCH[1]}"
            if [[ -n "${IFACE_DNS4[$current_iface]}" ]]; then
                IFACE_DNS4[$current_iface]="${IFACE_DNS4[$current_iface]} $dns"
            else
                IFACE_DNS4[$current_iface]="$dns"
            fi
            continue
        fi
        
        # 解析 DNS (dns-nameserver 用于 IPv6，可能多个)
        if [[ "$line" =~ ^dns-nameserver[[:space:]]+(.+) ]]; then
            local dns="${BASH_REMATCH[1]}"
            # 判断是 IPv6 DNS
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
        
        # 解析 accept_ra
        if [[ "$line" =~ ^accept_ra[[:space:]]+(.+) ]]; then
            IFACE_ACCEPT_RA[$current_iface]="${BASH_REMATCH[1]}"
            continue
        fi
        
        # 解析 autoconf
        if [[ "$line" =~ ^autoconf[[:space:]]+(.+) ]]; then
            IFACE_AUTOCONF[$current_iface]="${BASH_REMATCH[1]}"
            continue
        fi
        
    done < /tmp/interfaces_combined.tmp
    
    # 清理临时文件
    rm -f /tmp/interfaces_combined.tmp
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
        
        if [[ -n "${IFACE_ACCEPT_RA[$iface]}" ]]; then
            echo "  Accept RA: ${IFACE_ACCEPT_RA[$iface]}"
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
        
        # 添加 IPv4 配置
        if [[ -n "${IFACE_IPV4_ADDR[$iface]}" ]]; then
            echo "Address=${IFACE_IPV4_ADDR[$iface]}" >> "$config_file"
            if [[ -n "${IFACE_IPV4_GW[$iface]}" ]]; then
                echo "Gateway=${IFACE_IPV4_GW[$iface]}" >> "$config_file"
            fi
        fi
        
        # 添加 IPv6 配置
        if [[ -n "${IFACE_IPV6_ADDR[$iface]}" ]]; then
            echo "Address=${IFACE_IPV6_ADDR[$iface]}" >> "$config_file"
            if [[ -n "${IFACE_IPV6_GW[$iface]}" ]]; then
                echo "Gateway=${IFACE_IPV6_GW[$iface]}" >> "$config_file"
            fi
        fi
        
        # 添加 DNS 配置
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
        
        # 写入 DNS 配置
        for dns in $all_dns; do
            echo "DNS=$dns" >> "$config_file"
        done
        
        # IPv6 Accept RA 配置
        if [[ -n "${IFACE_IPV6_ADDR[$iface]}" ]]; then
            if [[ "${IFACE_ACCEPT_RA[$iface]}" == "0" ]]; then
                echo "IPv6AcceptRA=no" >> "$config_file"
            else
                echo "IPv6AcceptRA=no" >> "$config_file"  # 静态配置默认关闭 RA
            fi
        fi
        
        # Link 配置
        cat >> "$config_file" << EOF

[Link]
RequiredForOnline=routable
EOF
        
        # 设置权限
        chmod 644 "$config_file"
        
        ((priority+=10))
    done
    
    log_info "配置文件生成完成"
}

# 配置 systemd-resolved (DNS)
configure_resolved() {
    log_step "配置 systemd-resolved..."
    
    # 确保 systemd-resolved 配置目录存在
    mkdir -p /etc/systemd/resolved.conf.d
    
    # 收集所有 DNS
    local all_dns=""
    for iface in "${IFACE_LIST[@]}"; do
        if [[ -n "${IFACE_DNS4[$iface]}" ]]; then
            all_dns="$all_dns ${IFACE_DNS4[$iface]}"
        fi
        if [[ -n "${IFACE_DNS6[$iface]}" ]]; then
            all_dns="$all_dns ${IFACE_DNS6[$iface]}"
        fi
    done
    
    # 去重
    all_dns=$(echo "$all_dns" | tr ' ' '\n' | sort -u | tr '\n' ' ' | sed 's/^ //;s/ $//')
    
    if [[ -n "$all_dns" ]]; then
        cat > /etc/systemd/resolved.conf.d/dns.conf << EOF
# Auto-generated by migration script
[Resolve]
DNS=$all_dns
FallbackDNS=1.1.1.1 8.8.8.8 2606:4700:4700::1111 2001:4860:4860::8888
DNSStubListener=yes
EOF
        chmod 644 /etc/systemd/resolved.conf.d/dns.conf
    fi
    
    log_info "systemd-resolved 配置完成"
}

# 禁用 ifupdown
disable_ifupdown() {
    log_step "禁用 ifupdown..."
    
    # 重命名 interfaces 文件，保留但不使用
    if [[ -f /etc/network/interfaces ]]; then
        mv /etc/network/interfaces /etc/network/interfaces.bak.$(date +%Y%m%d-%H%M%S)
        
        # 创建一个最小的 interfaces 文件（只保留 loopback）
        cat > /etc/network/interfaces << EOF
# Network configuration has been migrated to systemd-networkd
# Original configuration backed up with .bak extension

source /etc/network/interfaces.d/*

auto lo
iface lo inet loopback
EOF
    fi
    
    # 停止 networking 服务
    if systemctl is-active --quiet networking 2>/dev/null; then
        systemctl stop networking || true
    fi
    
    # 禁用 networking 服务
    if systemctl is-enabled --quiet networking 2>/dev/null; then
        systemctl disable networking || true
    fi
    
    log_info "ifupdown 已禁用"
}

# 启用 systemd-networkd
enable_networkd() {
    log_step "启用 systemd-networkd..."
    
    # 启用并启动 systemd-networkd
    systemctl enable systemd-networkd
    
    # 启用并启动 systemd-resolved
    systemctl enable systemd-resolved
    
    # 配置 resolv.conf 软链接
    if [[ -f /etc/resolv.conf ]] && [[ ! -L /etc/resolv.conf ]]; then
        mv /etc/resolv.conf /etc/resolv.conf.bak.$(date +%Y%m%d-%H%M%S)
    fi
    ln -sf /run/systemd/resolve/stub-resolv.conf /etc/resolv.conf
    
    log_info "systemd-networkd 已启用"
}

# 应用新配置
apply_config() {
    log_step "应用新网络配置..."
    
    # 重启 systemd-resolved
    systemctl restart systemd-resolved
    
    # 重启 systemd-networkd
    systemctl restart systemd-networkd
    
    # 等待网络就绪
    sleep 3
    
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
    echo "路由表:"
    echo "=========================================="
    ip route show
    ip -6 route show 2>/dev/null || true
    
    echo ""
    echo "=========================================="
    echo "DNS 配置:"
    echo "=========================================="
    resolvectl status 2>/dev/null || cat /etc/resolv.conf
    
    echo ""
    echo "=========================================="
    echo "连通性测试:"
    echo "=========================================="
    
    # 测试 IPv4
    if ping -c 2 -W 3 1.1.1.1 &>/dev/null; then
        log_info "IPv4 连通性: 正常 ✓"
    else
        log_warn "IPv4 连通性: 异常 ✗"
    fi
    
    # 测试 IPv6
    if ping -6 -c 2 -W 3 2606:4700:4700::1111 &>/dev/null; then
        log_info "IPv6 连通性: 正常 ✓"
    else
        log_warn "IPv6 连通性: 异常或不支持 ✗"
    fi
    
    # 测试 DNS
    if host google.com &>/dev/null || nslookup google.com &>/dev/null; then
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
    
    cat > "$rollback_script" << 'ROLLBACK_EOF'
#!/bin/bash
# 回滚脚本：从 systemd-networkd 恢复到 ifupdown

set -e

echo "开始回滚到 ifupdown..."

# 停止并禁用 systemd-networkd
systemctl stop systemd-networkd
systemctl disable systemd-networkd

# 停止并禁用 systemd-resolved
systemctl stop systemd-resolved
systemctl disable systemd-resolved

# 删除 systemd-networkd 配置
rm -f /etc/systemd/network/*.network
rm -f /etc/systemd/resolved.conf.d/dns.conf

# 恢复 resolv.conf
rm -f /etc/resolv.conf
echo "nameserver 1.1.1.1" > /etc/resolv.conf
echo "nameserver 8.8.8.8" >> /etc/resolv.conf

ROLLBACK_EOF

    cat >> "$rollback_script" << ROLLBACK_EOF
# 恢复备份的配置
BACKUP_DIR="$backup_dir"
if [[ -d "\$BACKUP_DIR" ]]; then
    cp "\$BACKUP_DIR/interfaces" /etc/network/interfaces 2>/dev/null || true
    if [[ -d "\$BACKUP_DIR/interfaces.d" ]]; then
        cp -r "\$BACKUP_DIR/interfaces.d/"* /etc/network/interfaces.d/ 2>/dev/null || true
    fi
fi

# 启用 networking 服务
systemctl enable networking
systemctl restart networking

echo "回滚完成！"
echo "请检查网络连接是否正常"
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
    echo -e "${YELLOW}如果网络出现问题，可以运行回滚脚本:${NC}"
    echo "  /root/rollback-to-ifupdown.sh"
    echo ""
    echo -e "${YELLOW}或者在恢复控制台中运行:${NC}"
    echo "  systemctl stop systemd-networkd"
    echo "  systemctl start networking"
    echo ""
}

# 主函数
main() {
    echo ""
    echo "=========================================="
    echo "ifupdown → systemd-networkd 迁移脚本"
    echo "=========================================="
    echo ""
    
    # 检查 root 权限
    check_root
    
    # 检查系统
    if [[ ! -f /etc/network/interfaces ]]; then
        log_error "未找到 /etc/network/interfaces 文件"
        exit 1
    fi
    
    # 备份
    backup_dir=$(backup_config)
    
    # 解析配置
    parse_interfaces
    
    # 显示解析结果
    show_parsed_config
    
    # 确认
    echo -e "${YELLOW}即将进行迁移，这可能会短暂中断网络连接${NC}"
    echo -n "是否继续? [y/N]: "
    read -r confirm
    
    if [[ "$confirm" != "y" && "$confirm" != "Y" ]]; then
        log_info "迁移已取消"
        exit 0
    fi
    
    # 生成配置
    generate_networkd_config
    
    # 配置 DNS
    configure_resolved
    
    # 生成回滚脚本
    generate_rollback_script "$backup_dir"
    
    # 禁用 ifupdown
    disable_ifupdown
    
    # 启用 networkd
    enable_networkd
    
    # 应用配置
    apply_config
    
    # 验证
    verify_config
    
    # 显示最终状态
    show_final_status
}

# 运行主函数
main "$@"