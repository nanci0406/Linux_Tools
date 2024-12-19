#!/bin/bash

###################
# 全局变量定义
###################
NFT_FILE="/etc/nftables.conf"
TABLE_NAME="nat"
CHAIN_PREROUTING="prerouting"
CHAIN_POSTROUTING="postrouting"
PROTOCOLS=("tcp" "udp")
SYSCTL_CONF="/etc/sysctl.conf"

###################
# 工具函数
###################

# 错误处理函数
error_exit() {
    echo "错误: $1" >&2
    exit 1
}

# 检查root权限
check_root() {
    if [ "$(id -u)" != "0" ]; then
        error_exit "此脚本需要root权限运行"
    fi
}

# 检查并安装nftables
check_nftables() {
    echo "检查 nftables..."
    if ! command -v nft &> /dev/null; then
        echo "nftables 未安装，正在安装..."
        if command -v apt &> /dev/null; then
            apt update && apt install -y nftables || error_exit "安装 nftables 失败"
        elif command -v yum &> /dev/null; then
            yum install -y nftables || error_exit "安装 nftables 失败"
        else
            error_exit "无法确定包管理器，请手动安装 nftables"
        fi
    fi

    # 确保 nftables 服务开机自启动并运行
    systemctl enable nftables
    systemctl start nftables
    echo "nftables 已安装并启动"
}

# 检查并启用IP转发
enable_ip_forward() {
    echo "检查IP转发..."
    
    # 临时启用IP转发
    sysctl -w net.ipv4.ip_forward=1 > /dev/null

    # 检查是否已经在配置文件中设置了IP转发
    if ! grep -q "^net.ipv4.ip_forward *= *1" $SYSCTL_CONF; then
        # 备份原配置文件
        cp $SYSCTL_CONF "${SYSCTL_CONF}.bak"
        
        # 添加IP转发配置
        echo "net.ipv4.ip_forward = 1" >> $SYSCTL_CONF
        
        # 重新加载sysctl配置
        sysctl -p > /dev/null
        
        echo "IP转发已永久启用"
    else
        echo "IP转发已经启用"
    fi
}

# 验证IP地址
validate_ip() {
    local ip=$1
    if [[ ! $ip =~ ^[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}$ ]]; then
        return 1
    fi
    return 0
}

# 验证端口号
validate_port() {
    local port=$1
    if [[ ! $port =~ ^[0-9]+$ ]] || [ $port -lt 1 ] || [ $port -gt 65535 ]; then
        return 1
    fi
    return 0
}

###################
# 核心功能函数
###################

# 初始化nftables配置
setup_nft() {
    if ! nft list table ip $TABLE_NAME &>/dev/null; then
        nft add table ip $TABLE_NAME
    fi
    if ! nft list chain ip $TABLE_NAME $CHAIN_PREROUTING &>/dev/null; then
        nft add chain ip $TABLE_NAME $CHAIN_PREROUTING { type nat hook prerouting priority 0 \; }
    fi
    if ! nft list chain ip $TABLE_NAME $CHAIN_POSTROUTING &>/dev/null; then
        nft add chain ip $TABLE_NAME $CHAIN_POSTROUTING { type nat hook postrouting priority 100 \; }
    fi
}

# 格式化显示规则
format_rules() {
    local rules
    rules=$(nft --handle list chain ip $TABLE_NAME $CHAIN_PREROUTING | grep "dnat to" | grep "tcp")

    if [ -z "$rules" ]; then
        echo "当前没有转发规则"
        return
    fi

    echo "==================== 当前端口转发规则 ===================="
    echo "规则ID  本地地址:端口 >>> 目标地址:端口 (TCP+UDP)"
    echo "======================================================="

    local index=1
    while IFS= read -r line; do
        local tcp_handle=$(echo "$line" | grep -o "handle [0-9]*" | awk '{print $2}')
        local local_ip_port=$(echo "$line" | grep -o "ip daddr [^ ]* tcp dport [0-9]*" | awk '{print $3 ":" $5}')
        local target_ip_port=$(echo "$line" | grep -o "dnat to [^ ]*" | awk '{print $3}')

        # 获取对应的UDP规则handle
        local udp_rule=$(nft --handle list chain ip $TABLE_NAME $CHAIN_PREROUTING | grep "udp.*dnat to $target_ip_port" | grep "$local_ip_port")
        local udp_handle=$(echo "$udp_rule" | grep -o "handle [0-9]*" | awk '{print $2}')

        printf "%-7s %-20s >>> %-20s (handles: %s, %s)\n" \
               "$index" "$local_ip_port" "$target_ip_port" "$tcp_handle" "$udp_handle"

        index=$((index + 1))
    done <<< "$rules"
    echo "======================================================="
}

# 添加端口转发规则
add_forward() {
    local local_ip local_port target_ip target_port

    # 获取并验证本地IP
    echo "请输入本地IP地址："
    read local_ip
    if ! validate_ip "$local_ip"; then
        error_exit "无效的IP地址格式"
    fi

    # 获取并验证本地端口
    echo "请输入本地端口："
    read local_port
    if ! validate_port "$local_port"; then
        error_exit "无效的端口号（1-65535）"
    fi

    # 获取并验证目标IP
    echo "请输入目标IP地址："
    read target_ip
    if ! validate_ip "$target_ip"; then
        error_exit "无效的IP地址格式"
    fi

    # 获取并验证目标端口
    echo "请输入目标端口："
    read target_port
    if ! validate_port "$target_port"; then
        error_exit "无效的端口号（1-65535）"
    fi

    # 为TCP和UDP都添加规则
    for protocol in "${PROTOCOLS[@]}"; do
        nft add rule ip $TABLE_NAME $CHAIN_PREROUTING \
            ip daddr $local_ip $protocol dport $local_port \
            dnat to $target_ip:$target_port
        nft add rule ip $TABLE_NAME $CHAIN_POSTROUTING \
            ip daddr $target_ip $protocol dport $target_port \
            masquerade
    done

    echo "端口转发规则已添加（TCP + UDP）："
    echo "本地 $local_ip:$local_port >>> 目标 $target_ip:$target_port"
}

# 删除转发规则
delete_forward() {
    format_rules
    echo "请输入要删除的规则ID："
    read rule_id

    if [[ ! $rule_id =~ ^[0-9]+$ ]]; then
        error_exit "规则ID必须是数字"
    fi

    local rules
    rules=$(nft --handle list chain ip $TABLE_NAME $CHAIN_PREROUTING | grep "dnat to" | grep "tcp")
    local index=1
    local tcp_handle=""
    local udp_handle=""
    local target_ip_port=""
    local local_ip_port=""

    while IFS= read -r line; do
        if [ $index -eq $rule_id ]; then
            tcp_handle=$(echo "$line" | grep -o "handle [0-9]*" | awk '{print $2}')
            local_ip_port=$(echo "$line" | grep -o "ip daddr [^ ]* tcp dport [0-9]*" | awk '{print $3 ":" $5}')
            target_ip_port=$(echo "$line" | grep -o "dnat to [^ ]*" | awk '{print $3}')
            break
        fi
        index=$((index + 1))
    done <<< "$rules"

    if [ -z "$tcp_handle" ]; then
        error_exit "未找到指定的规则ID"
    fi

    # 找到对应的UDP规则
    local udp_rule=$(nft --handle list chain ip $TABLE_NAME $CHAIN_PREROUTING | grep "udp.*dnat to $target_ip_port" | grep "$local_ip_port")
    udp_handle=$(echo "$udp_rule" | grep -o "handle [0-9]*" | awk '{print $2}')

    # 检查并删除TCP和UDP规则
    if [ -n "$tcp_handle" ]; then
        nft delete rule ip $TABLE_NAME $CHAIN_PREROUTING handle $tcp_handle
    fi

    if [ -n "$udp_handle" ]; then
        nft delete rule ip $TABLE_NAME $CHAIN_PREROUTING handle $udp_handle
    fi

    # 删除对应的POSTROUTING规则
    local tcp_post_handle=$(nft --handle list chain ip $TABLE_NAME $CHAIN_POSTROUTING | grep "masquerade" | grep "tcp dport $target_port" | grep "$target_ip" | grep -o "handle [0-9]*" | awk '{print $2}')
    local udp_post_handle=$(nft --handle list chain ip $TABLE_NAME $CHAIN_POSTROUTING | grep "masquerade" | grep "udp dport $target_port" | grep "$target_ip" | grep -o "handle [0-9]*" | awk '{print $2}')

    if [ -n "$tcp_post_handle" ]; then
        nft delete rule ip $TABLE_NAME $CHAIN_POSTROUTING handle $tcp_post_handle
    fi

    if [ -n "$udp_post_handle" ]; then
        nft delete rule ip $TABLE_NAME $CHAIN_POSTROUTING handle $udp_post_handle
    fi

    echo "TCP和UDP转发规则已成功删除"
}

# 保存配置
save_config() {
    nft list ruleset > $NFT_FILE
    if [ $? -eq 0 ]; then
        echo "配置已成功保存到 $NFT_FILE"
        echo "系统重启后规则将自动生效"
    else
        error_exit "保存配置失败"
    fi
}

# 显示菜单
show_menu() {
    echo
    echo "============ NFTables 端口转发管理脚本 ============"
    echo "1. 添加端口转发 (TCP + UDP)"
    echo "2. 查看所有转发规则"
    echo "3. 删除转发规则"
    echo "4. 保存配置"
    echo "5. 退出"
    echo "================================================="
    echo "请选择操作 (1-5)："
}

###################
# 主程序
###################
main() {
    # 显示欢迎信息
    echo "正在初始化端口转发管理工具..."
    
    # 检查root权限
    check_root
    
    # 检查并安装必要组件
    check_nftables
    enable_ip_forward
    
    # 初始化nftables配置
    setup_nft
    
    echo "初始化完成！"
    sleep 1
    clear

    while true; do
        show_menu
        read choice

        case $choice in
            1) add_forward ;;
            2) list_forwards ;;
            3) delete_forward ;;
            4) save_config ;;
            5)
                echo "退出程序"
                exit 0
                ;;
            *)
                echo "无效选择，请重试"
                ;;
        esac

        echo -e "\n按Enter键继续..."
        read
        clear
    done
}

# 定义查看规则的别名函数
list_forwards() {
    format_rules
}

# 启动主程序
main
