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

# 颜色代码
RED='\033[0;31m'
GREEN='\033[0;32m'
YELLOW='\033[0;33m'
BLUE='\033[0;34m'
NC='\033[0m'

# 检查root权限
check_root() {
  if [[ $EUID -ne 0 ]]; then
    echo -e "${RED}错误: 此脚本需要root权限${NC}"
    exit 1
  fi
}

# 保存配置到文件
save_config() {
  cat > "$CONFIG_FILE" <<EOF
WG_IF="$WG_IF"
WG_PORT=$WG_PORT
WG_CLIENT_IP="$WG_CLIENT_IP"
WG_SERVER_IP="$WG_SERVER_IP"
EOF
  echo -e "${GREEN}配置已保存到 $CONFIG_FILE${NC}"
}

# 加载配置
load_config() {
  if [[ -f "$CONFIG_FILE" ]]; then
    source "$CONFIG_FILE"
    echo -e "${GREEN}已加载配置${NC}"
  fi
}

# 创建初始目录
init() {
  mkdir -p "$KEY_PATH"
  mkdir -p "$WG_PATH" 2>/dev/null || true
  load_config
}

show_server_menu() {
  clear
  echo -e "${BLUE}==========================================${NC}"
  echo -e "${BLUE} WireGuard 服务端管理工具 (双栈服务器)${NC}"
  echo -e "${BLUE}==========================================${NC}"
  echo -e "${YELLOW}[基本设置]${NC}"
  echo -e "0) 配置基本参数"
  echo -e "1) 生成服务端密钥对"
  echo -e "2) 安装 WireGuard"
  echo
  echo -e "${YELLOW}[服务配置]${NC}"
  echo -e "3) 配置并启动 WireGuard 服务端"
  echo -e "4) 配置入站流量路由 (IPv4 -> 客户端)"
  echo -e "5) 删除入站流量路由"
  echo -e "6) 显示服务端状态"
  echo -e "7) 停止 WireGuard 服务"
  echo -e "8) 显示当前配置"
  echo
  echo -e "q) 退出"
  echo -e "${BLUE}==========================================${NC}"
}

show_client_menu() {
  clear
  echo -e "${BLUE}==========================================${NC}"
  echo -e "${BLUE} WireGuard 客户端管理工具 (纯V6服务器)${NC}"
  echo -e "${BLUE}==========================================${NC}"
  echo -e "${YELLOW}[基本设置]${NC}"
  echo -e "0) 配置基本参数"
  echo -e "1) 生成客户端密钥对"
  echo -e "2) 安装 WireGuard"
  echo
  echo -e "${YELLOW}[客户端配置]${NC}"
  echo -e "3) 配置并启动 WireGuard 客户端"
  echo -e "4) 配置出站流量路由 (通过WG访问IPv4)"
  echo -e "5) 删除出站流量路由"
  echo -e "6) 显示客户端状态"
  echo -e "7) 停止 WireGuard 服务"
  echo -e "8) 显示当前配置"
  echo
  echo -e "q) 退出"
  echo -e "${BLUE}==========================================${NC}"
}

# 生成密钥对
generate_keys() {
  local role=$1
  echo -e "${BLUE}[+] 生成${role}密钥对${NC}"
  
  mkdir -p "$KEY_PATH"
  wg genkey | tee "$KEY_PATH/${role}.private" | wg pubkey > "$KEY_PATH/${role}.public"
  chmod 600 "$KEY_PATH/${role}.private"
  
  echo -e "${GREEN}✅ ${role}密钥对已生成：${NC}"
  echo -e "私钥：${BLUE}$(cat $KEY_PATH/${role}.private)${NC}"
  echo -e "公钥：${BLUE}$(cat $KEY_PATH/${role}.public)${NC}"
}

# 安装WireGuard
install_wg() {
  echo -e "${BLUE}[+] 安装 WireGuard...${NC}"
  if command -v apt-get &> /dev/null; then
    apt-get update && apt-get install -y wireguard
  elif command -v yum &> /dev/null; then
    yum install -y epel-release
    yum install -y wireguard-tools
  else
    echo -e "${RED}不支持的系统类型${NC}"
    return 1
  fi
  echo -e "${GREEN}✅ WireGuard 安装完成${NC}"
}

# 配置服务端
setup_server() {
  echo -e "${BLUE}[+] 配置 WireGuard 服务端...${NC}"
  
  # 检查服务端私钥
  if [[ ! -f "$KEY_PATH/server.private" ]]; then
    echo -e "${RED}错误: 服务端私钥不存在，请先生成密钥对${NC}"
    return 1
  fi
  
  # 创建服务端配置
  cat > "$WG_PATH/$WG_IF.conf" <<EOF
[Interface]
Address = $WG_SERVER_IP/24
ListenPort = $WG_PORT
PrivateKey = $(cat "$KEY_PATH/server.private")

EOF
  
  # 如果存在客户端公钥，添加Peer配置
  if [[ -f "$KEY_PATH/client.public" ]]; then
    cat >> "$WG_PATH/$WG_IF.conf" <<EOF
[Peer]
PublicKey = $(cat "$KEY_PATH/client.public")
AllowedIPs = $WG_CLIENT_IP/32
EOF
  fi
  
  chmod 600 "$WG_PATH/$WG_IF.conf"
  
  # 启动服务
  systemctl enable wg-quick@$WG_IF
  systemctl restart wg-quick@$WG_IF
  
  echo -e "${GREEN}✅ WireGuard 服务端配置完成${NC}"
}

# 配置客户端
setup_client() {
  echo -e "${BLUE}[+] 配置 WireGuard 客户端...${NC}"
  
  # 检查必要的密钥
  if [[ ! -f "$KEY_PATH/client.private" ]]; then
    echo -e "${RED}错误: 客户端私钥不存在${NC}"
    return 1
  fi
  
  if [[ ! -f "$KEY_PATH/server.public" ]]; then
    echo -e "${RED}错误: 服务端公钥不存在${NC}"
    return 1
  fi
  
  # 获取服务端IPv6地址
  read -rp "请输入服务端IPv6地址: " SERVER_IPV6
  if [[ -z "$SERVER_IPV6" ]]; then
    echo -e "${RED}错误: 服务端IPv6地址不能为空${NC}"
    return 1
  fi
  
  # 创建客户端配置
  cat > "$WG_PATH/$WG_IF.conf" <<EOF
[Interface]
Address = $WG_CLIENT_IP/24
PrivateKey = $(cat "$KEY_PATH/client.private")

[Peer]
PublicKey = $(cat "$KEY_PATH/server.public")
Endpoint = [$SERVER_IPV6]:$WG_PORT
AllowedIPs = $WG_SERVER_IP/32
PersistentKeepalive = 25
EOF
  
  chmod 600 "$WG_PATH/$WG_IF.conf"
  
  # 启动服务
  systemctl enable wg-quick@$WG_IF
  systemctl restart wg-quick@$WG_IF
  
  echo -e "${GREEN}✅ WireGuard 客户端配置完成${NC}"
}

# 配置服务端入站流量路由
setup_server_routing() {
  echo -e "${BLUE}[+] 配置服务端入站流量路由...${NC}"
  
  # 获取服务端公网IPv4
  local PUBLIC_IPV4=$(curl -s4 ip.sb)
  if [[ -z "$PUBLIC_IPV4" ]]; then
    echo -e "${RED}错误: 无法获取服务端公网IPv4地址${NC}"
    return 1
  fi
  
  # 启用IPv4转发
  echo 1 > /proc/sys/net/ipv4/ip_forward
  sed -i '/net.ipv4.ip_forward=/d' /etc/sysctl.conf
  echo "net.ipv4.ip_forward=1" >> /etc/sysctl.conf
  sysctl -p
  
  # 配置NAT规则
  iptables -t nat -A PREROUTING -d $PUBLIC_IPV4 -j DNAT --to-destination $WG_CLIENT_IP
  iptables -t nat -A POSTROUTING -s $WG_CLIENT_IP/32 -j SNAT --to-source $PUBLIC_IPV4
  
  # 保存iptables规则
  if command -v iptables-save &> /dev/null; then
    iptables-save > /etc/iptables/rules.v4 2>/dev/null || iptables-save > /root/wg-iptables-rules
  fi
  
  echo -e "${GREEN}✅ 入站流量路由配置完成${NC}"
  echo -e "${YELLOW}已将发往 $PUBLIC_IPV4 的流量转发至客户端 $WG_CLIENT_IP${NC}"
}

# 配置客户端出站流量路由
setup_client_routing() {
  echo -e "${BLUE}[+] 配置客户端出站流量路由...${NC}"
  
  # 修改WireGuard配置中的AllowedIPs
  sed -i 's/AllowedIPs = .*/AllowedIPs = 0.0.0.0\/0/' "$WG_PATH/$WG_IF.conf"
  
  # 重启WireGuard服务
  systemctl restart wg-quick@$WG_IF
  
  echo -e "${GREEN}✅ 出站流量路由配置完成${NC}"
  echo -e "${YELLOW}所有IPv4流量将通过WireGuard隧道转发${NC}"
}

# 删除服务端入站流量路由
remove_server_routing() {
  echo -e "${BLUE}[+] 删除服务端入站流量路由...${NC}"
  
  # 获取服务端公网IPv4
  local PUBLIC_IPV4=$(curl -s4 ip.sb)
  
  # 删除NAT规则
  iptables -t nat -D PREROUTING -d $PUBLIC_IPV4 -j DNAT --to-destination $WG_CLIENT_IP 2>/dev/null || true
  iptables -t nat -D POSTROUTING -s $WG_CLIENT_IP/32 -j SNAT --to-source $PUBLIC_IPV4 2>/dev/null || true
  
  # 保存iptables规则
  if command -v iptables-save &> /dev/null; then
    iptables-save > /etc/iptables/rules.v4 2>/dev/null || iptables-save > /root/wg-iptables-rules
  fi
  
  echo -e "${GREEN}✅ 入站流量路由规则已删除${NC}"
}

# 删除客户端出站流量路由
remove_client_routing() {
  echo -e "${BLUE}[+] 删除客户端出站流量路由...${NC}"
  
  # 修改WireGuard配置中的AllowedIPs
  sed -i "s/AllowedIPs = .*/AllowedIPs = $WG_SERVER_IP\/32/" "$WG_PATH/$WG_IF.conf"
  
  # 重启WireGuard服务
  systemctl restart wg-quick@$WG_IF
  
  echo -e "${GREEN}✅ 出站流量路由配置已删除${NC}"
}

# 显示WireGuard状态
show_wg_status() {
  echo -e "${BLUE}[+] WireGuard 状态：${NC}"
  
  if ! command -v wg &> /dev/null; then
    echo -e "${RED}错误: WireGuard 未安装${NC}"
    return 1
  fi
  
  if ip link show "$WG_IF" &>/dev/null; then
    echo -e "${GREEN}接口 $WG_IF 状态：${NC}"
    wg show
    
    echo -e "\n${GREEN}路由表：${NC}"
    ip route show
    
    echo -e "\n${GREEN}NAT规则：${NC}"
    iptables -t nat -L -n -v
  else
    echo -e "${YELLOW}接口 $WG_IF 未启动${NC}"
  fi
}

# 停止WireGuard服务
stop_wg() {
  echo -e "${BLUE}[+] 停止 WireGuard 服务...${NC}"
  
  if systemctl is-active --quiet wg-quick@$WG_IF; then
    systemctl stop wg-quick@$WG_IF
    systemctl disable wg-quick@$WG_IF
    echo -e "${GREEN}✅ WireGuard 服务已停止${NC}"
  else
    echo -e "${YELLOW}WireGuard 服务未运行${NC}"
  fi
