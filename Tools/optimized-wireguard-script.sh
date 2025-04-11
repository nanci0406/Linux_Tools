#!/bin/bash
set -e

# 配置变量
WG_IF="wg0"
WG_PORT=51820
WG_CLIENT_IP="192.168.0.2"
WG_SERVER_IP="192.168.0.1"
WG_PATH="/etc/wireguard"
KEY_PATH="./keys"
CONFIG_FILE="./wg-config.conf"

# 路由控制选项
ROUTE_ALL_TRAFFIC=0
ROUTE_INCOMING_TRAFFIC=0
ROUTE_V6_TRAFFIC=0

# 颜色代码
RED='\033[0;31m'
GREEN='\033[0;32m'
YELLOW='\033[0;33m'
BLUE='\033[0;34m'
NC='\033[0m'

# 基础函数
check_root() {
    if [[ $EUID -ne 0 ]]; then
        echo -e "${RED}错误: 此脚本需要root权限${NC}"
        exit 1
    fi
}

# 配置路由选项
configure_routing_options() {
    echo -e "${BLUE}[+] 配置路由选项${NC}"
    echo -e "请选择需要启用的路由选项："
    
    read -rp "是否路由所有流量通过 WireGuard? (y/N): " route_all
    ROUTE_ALL_TRAFFIC=$([ "$route_all" = "y" ] || [ "$route_all" = "Y" ] && echo 1 || echo 0)
    
    read -rp "是否允许处理入站流量? (y/N): " route_incoming
    ROUTE_INCOMING_TRAFFIC=$([ "$route_incoming" = "y" ] || [ "$route_incoming" = "Y" ] && echo 1 || echo 0)
    
    read -rp "是否路由 IPv6 流量? (y/N): " route_v6
    ROUTE_V6_TRAFFIC=$([ "$route_v6" = "y" ] || [ "$route_v6" = "Y" ] && echo 1 || echo 0)
    
    # 保存路由配置
    cat > "${CONFIG_FILE}.routing" <<EOF
ROUTE_ALL_TRAFFIC=$ROUTE_ALL_TRAFFIC
ROUTE_INCOMING_TRAFFIC=$ROUTE_INCOMING_TRAFFIC
ROUTE_V6_TRAFFIC=$ROUTE_V6_TRAFFIC
EOF
    
    echo -e "${GREEN}✅ 路由选项已保存${NC}"
}

# 修改后的启动服务端函数
start_wg_server() {
    echo -e "${BLUE}[+] 启动 WireGuard 服务端配置${NC}"
    
    if [[ ! -f "$KEY_PATH/server.private" ]]; then
        echo -e "${RED}错误: 服务器私钥不存在. 请先生成密钥对${NC}"
        return 1
    fi
    
    # 基础接口配置
    cat > "$WG_PATH/$WG_IF.conf" <<EOF
[Interface]
PrivateKey = $(cat "$KEY_PATH/server.private")
ListenPort = $WG_PORT
Address = $WG_SERVER_IP/24
EOF
    
    # 如果存在客户端公钥，添加对等配置
    if [[ -f "$KEY_PATH/client.public" ]]; then
        cat >> "$WG_PATH/$WG_IF.conf" <<EOF

[Peer]
PublicKey = $(cat "$KEY_PATH/client.public")
AllowedIPs = $WG_CLIENT_IP/32
EOF
    fi
    
    chmod 600 "$WG_PATH/$WG_IF.conf"
    
    # 启动接口
    systemctl enable wg-quick@$WG_IF
    systemctl restart wg-quick@$WG_IF
    
    # 根据配置设置路由规则
    if [[ $ROUTE_INCOMING_TRAFFIC -eq 1 ]]; then
        setup_nat_forwarding
    fi
    
    if [[ $ROUTE_V6_TRAFFIC -eq 1 ]]; then
        setup_ipv6_routing
    fi
    
    if systemctl is-active --quiet wg-quick@$WG_IF; then
        echo -e "${GREEN}✅ WireGuard 服务端已成功启动${NC}"
        wg show
    else
        echo -e "${RED}❌ WireGuard 服务端启动失败${NC}"
        journalctl -xeu wg-quick@$WG_IF
    fi
}

# 修改后的启动客户端函数
start_wg_client() {
    echo -e "${BLUE}[+] 启动 WireGuard 客户端配置${NC}"
    
    if [[ ! -f "$KEY_PATH/client.private" ]] || [[ ! -f "$KEY_PATH/server.public" ]]; then
        echo -e "${RED}错误: 缺少必要的密钥文件${NC}"
        return 1
    fi
    
    read -rp "请输入服务端IP地址: " SERVER_IP
    if [[ -z "$SERVER_IP" ]]; then
        echo -e "${RED}错误: 服务端IP不能为空${NC}"
        return 1
    fi
    
    # 格式化IPv6地址
    if [[ "$SERVER_IP" =~ : ]]; then
        SERVER_IP="[$SERVER_IP]"
    fi
    
    # 基础客户端配置
    cat > "$WG_PATH/$WG_IF.conf" <<EOF
[Interface]
PrivateKey = $(cat "$KEY_PATH/client.private")
Address = $WG_CLIENT_IP/24

[Peer]
PublicKey = $(cat "$KEY_PATH/server.public")
Endpoint = $SERVER_IP:$WG_PORT
EOF
    
    # 根据路由选项设置AllowedIPs
    if [[ $ROUTE_ALL_TRAFFIC -eq 1 ]]; then
        if [[ $ROUTE_V6_TRAFFIC -eq 1 ]]; then
            echo "AllowedIPs = 0.0.0.0/0, ::/0" >> "$WG_PATH/$WG_IF.conf"
        else
            echo "AllowedIPs = 0.0.0.0/0" >> "$WG_PATH/$WG_IF.conf"
        fi
    else
        echo "AllowedIPs = $WG_SERVER_IP/32" >> "$WG_PATH/$WG_IF.conf"
    fi
    
    echo "PersistentKeepalive = 25" >> "$WG_PATH/$WG_IF.conf"
    
    chmod 600 "$WG_PATH/$WG_IF.conf"
    
    systemctl enable wg-quick@$WG_IF
    systemctl restart wg-quick@$WG_IF
    
    if systemctl is-active --quiet wg-quick@$WG_IF; then
        echo -e "${GREEN}✅ WireGuard 客户端已成功启动${NC}"
        wg show
    else
        echo -e "${RED}❌ WireGuard 客户端启动失败${NC}"
        journalctl -xeu wg-quick@$WG_IF
    fi
}

# 新增：IPv6 路由设置
setup_ipv6_routing() {
    echo -e "${BLUE}[+] 配置 IPv6 路由...${NC}"
    
    # 启用 IPv6 转发
    if ! grep -q "^net.ipv6.conf.all.forwarding=1" /etc/sysctl.conf; then
        echo "net.ipv6.conf.all.forwarding=1" >> /etc/sysctl.conf
        sysctl -p
    fi
    
    # 设置 IPv6 NAT（如果需要）
    if [[ $ROUTE_INCOMING_TRAFFIC -eq 1 ]]; then
        if command -v ip6tables &> /dev/null; then
            ip6tables -t nat -A POSTROUTING -o $(ip -6 route show default | awk '/default/ {print $5}') -j MASQUERADE
        fi
    fi
}

# 修改后的菜单函数
show_menu() {
    clear
    echo -e "${BLUE}==========================================${NC}"
    echo -e "${BLUE} WireGuard 隧道管理工具 v3.0${NC}"
    echo -e "${BLUE}==========================================${NC}"
    echo -e "${YELLOW}[基本设置]${NC}"
    echo -e "0) 配置基本参数"
    echo -e "1) 生成密钥对"
    echo -e "2) 安装 WireGuard"
    echo -e "3) 配置路由选项"
    echo
    echo -e "${YELLOW}[服务端 - 双栈服务器]${NC}"
    echo -e "4) 启动 WireGuard 服务端"
    echo
    echo -e "${YELLOW}[客户端 - 纯 IPv6 服务器]${NC}"
    echo -e "5) 启动 WireGuard 客户端"
    echo
    echo -e "${YELLOW}[管理功能]${NC}"
    echo -e "6) 查看 WireGuard 状态"
    echo -e "7) 停止 WireGuard 服务"
    echo -e "8) 显示当前配置"
    echo -e "9) 导出客户端配置"
    echo -e "q) 退出"
    echo -e "${BLUE}==========================================${NC}"
}

# 主程序
check_root
init

while true; do
    show_menu
    read -rp "请选择操作编号: " opt
    case $opt in
        0) configure_params ;;
        1) generate_keys ;;
        2) install_wg ;;
        3) configure_routing_options ;;
        4) start_wg_server ;;
        5) start_wg_client ;;
        6) show_wg_status ;;
        7) stop_wg ;;
        8) show_config ;;
        9) export_client_qrcode ;;
        q|Q) echo -e "${GREEN}谢谢使用，再见！${NC}" && exit 0 ;;
        *) echo -e "${RED}无效选项，请重新选择。${NC}" ;;
    esac
    pause
done
