#!/bin/bash

# 检查是否有root权限
if [ "$(id -u)" -ne 0 ]; then
    echo "请以root权限运行该脚本"
    exit 1
fi

# 检查内核转发是否开启
check_ip_forward() {
    sysctl net.ipv4.ip_forward | grep -q "1"
}

enable_ip_forward() {
    echo "启用内核转发..."
    sysctl -w net.ipv4.ip_forward=1
    echo "net.ipv4.ip_forward=1" >> /etc/sysctl.conf
}

# 配置nftables端口转发（同时支持TCP和UDP）
setup_nftables_forward() {
    REMOTE_IP=$1
    REMOTE_PORT=$2
    LOCAL_IP=$3
    LOCAL_PORT=$4

    # 检查是否已存在此规则
    nft list ruleset | grep -q "$REMOTE_PORT"
    if [ $? -eq 0 ]; then
        echo "该规则已存在，跳过添加。"
        return
    fi

    echo "添加端口转发规则：远程IP $REMOTE_IP:$REMOTE_PORT 转发到 本地IP $LOCAL_IP:$LOCAL_PORT (同时支持TCP和UDP)"

    # 添加TCP转发规则
    nft add rule inet filter prerouting ip saddr $REMOTE_IP tcp dport $REMOTE_PORT counter dnat to $LOCAL_IP:$LOCAL_PORT
    nft add rule inet filter forward ip daddr $LOCAL_IP tcp dport $LOCAL_PORT counter accept

    # 添加UDP转发规则
    nft add rule inet filter prerouting ip saddr $REMOTE_IP udp dport $REMOTE_PORT counter dnat to $LOCAL_IP:$LOCAL_PORT
    nft add rule inet filter forward ip daddr $LOCAL_IP udp dport $LOCAL_PORT counter accept

    echo "规则添加成功！"
}

# 删除nftables端口转发规则（同时支持TCP和UDP）
delete_nftables_forward() {
    REMOTE_IP=$1
    REMOTE_PORT=$2
    LOCAL_IP=$3
    LOCAL_PORT=$4

    echo "删除端口转发规则：远程IP $REMOTE_IP:$REMOTE_PORT 转发到 本地IP $LOCAL_IP:$LOCAL_PORT (同时支持TCP和UDP)"

    # 删除TCP转发规则
    nft delete rule inet filter prerouting ip saddr $REMOTE_IP tcp dport $REMOTE_PORT dnat to $LOCAL_IP:$LOCAL_PORT
    nft delete rule inet filter forward ip daddr $LOCAL_IP tcp dport $LOCAL_PORT accept

    # 删除UDP转发规则
    nft delete rule inet filter prerouting ip saddr $REMOTE_IP udp dport $REMOTE_PORT dnat to $LOCAL_IP:$LOCAL_PORT
    nft delete rule inet filter forward ip daddr $LOCAL_IP udp dport $LOCAL_PORT accept

    echo "规则已删除。"
}

# 查看当前端口转发规则
view_nftables_forward() {
    nft list ruleset | grep "dport"
}

# 运行时的功能选择
echo "请选择操作："
echo "1. 查看端口转发规则"
echo "2. 增加端口转发规则"
echo "3. 删除端口转发规则"
echo "4. 配置内核转发"
echo "5. 退出"

read -p "请输入操作选项 (1-5): " action

case $action in
    1)
        view_nftables_forward
        ;;
    2)
        read -p "请输入远程IP: " remote_ip
        read -p "请输入远程端口: " remote_port
        read -p "请输入本地IP: " local_ip
        read -p "请输入本地端口: " local_port
        setup_nftables_forward $remote_ip $remote_port $local_ip $local_port
        ;;
    3)
        read -p "请输入远程IP: " remote_ip
        read -p "请输入远程端口: " remote_port
        read -p "请输入本地IP: " local_ip
        read -p "请输入本地端口: " local_port
        delete_nftables_forward $remote_ip $remote_port $local_ip $local_port
        ;;
    4)
        if check_ip_forward; then
            echo "内核转发已启用"
        else
            enable_ip_forward
        fi
        ;;
    5)
        echo "退出脚本"
        exit 0
        ;;
    *)
        echo "无效的选项"
        exit 1
        ;;
esac
