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
NC='\033[0m' # 恢复默认颜色

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
  
  # 加载已保存的配置(如果存在)
  load_config
}

show_menu() {
  clear
  echo -e "${BLUE}==========================================${NC}"
  echo -e "${BLUE} WireGuard 隧道管理工具 v2.0${NC}"
  echo -e "${BLUE}==========================================${NC}"
  echo -e "${YELLOW}[基本设置]${NC}"
  echo -e "0) 配置基本参数"
  echo -e "1) 生成密钥对"
  echo
  echo -e "${YELLOW}[服务端 - 双栈服务器]${NC}"
  echo -e "2) 安装 WireGuard"
  echo -e "3) 启用 IPv4 转发"
  echo -e "4) 设置 NAT 转发规则"
  echo -e "5) 启动 WireGuard 服务端"
  echo
  echo -e "${YELLOW}[客户端 - 纯IPv6服务器]${NC}"
  echo -e "6) 安装 WireGuard"
  echo -e "7) 启动 WireGuard 客户端"
  echo
  echo -e "${YELLOW}[通用功能]${NC}"
  echo -e "8) 设置默认路由走 wg0"
  echo -e "9) 恢复默认路由"
  echo -e "10) 查看 wg 状态"
  echo -e "11) 停止 WireGuard 服务"
  echo -e "12) 显示配置信息"
  echo -e "13) 导出配置为二维码(客户端)"
  echo -e "q) 退出"
  echo -e "${BLUE}==========================================${NC}"
  echo -e "当前配置: 接口=${GREEN}$WG_IF${NC}, 端口=${GREEN}$WG_PORT${NC}"
  echo -e "服务器IP=${GREEN}$WG_SERVER_IP${NC}, 客户端IP=${GREEN}$WG_CLIENT_IP${NC}"
}

pause() {
  echo
  read -rp "按 Enter 返回主菜单..."
}

configure_params() {
  echo -e "${BLUE}[+] 基本参数配置${NC}"
  
  read -rp "输入 WireGuard 接口名称 [默认: $WG_IF]: " input
  WG_IF=${input:-$WG_IF}
  
  read -rp "输入 WireGuard 端口 [默认: $WG_PORT]: " input
  WG_PORT=${input:-$WG_PORT}
  
  read -rp "输入 WireGuard 服务器IP [默认: $WG_SERVER_IP]: " input
  WG_SERVER_IP=${input:-$WG_SERVER_IP}
  
  read -rp "输入 WireGuard 客户端IP [默认: $WG_CLIENT_IP]: " input
  WG_CLIENT_IP=${input:-$WG_CLIENT_IP}
  
  # 保存配置
  save_config
  
  echo -e "${GREEN}✅ 参数配置完成${NC}"
}

generate_keys() {
  echo -e "${BLUE}[+] 密钥对生成器${NC}"
  echo "请输入要生成密钥对的标识（如：server 或 client）"
  read -rp "标识名: " name
  
  if [[ -z "$name" ]]; then
    echo -e "${RED}错误: 标识名不能为空${NC}"
    return 1
  fi
  
  mkdir -p "$KEY_PATH"
  wg genkey | tee "$KEY_PATH/$name.private" | wg pubkey > "$KEY_PATH/$name.public"
  chmod 600 "$KEY_PATH/$name.private"
  
  echo
  echo -e "${GREEN}✅ 密钥对已生成，路径如下：${NC}"
  echo "私钥：$KEY_PATH/$name.private"
  echo "公钥：$KEY_PATH/$name.public"
  echo
  echo -e "${YELLOW}密钥内容:${NC}"
  echo -e "私钥：${BLUE}$(cat $KEY_PATH/$name.private)${NC}"
  echo -e "公钥：${BLUE}$(cat $KEY_PATH/$name.public)${NC}"
}

install_wg() {
  echo -e "${BLUE}[+] 安装 WireGuard 中...${NC}"
  
  # 检测系统类型
  if command -v apt-get &> /dev/null; then
    apt-get update && apt-get install -y wireguard iptables qrencode
  elif command -v yum &> /dev/null; then
    yum install -y epel-release
    yum install -y wireguard-tools iptables qrencode
  else
    echo -e "${RED}不支持的系统类型。请手动安装 WireGuard。${NC}"
    return 1
  fi
  
  echo -e "${GREEN}✅ WireGuard 安装完成${NC}"
}

enable_ipv4_forward() {
  echo -e "${BLUE}[+] 启用 IPv4 转发...${NC}"
  
  # 检查是否已经启用
  if grep -q "^net.ipv4.ip_forward=1" /etc/sysctl.conf; then
    echo -e "${YELLOW}IPv4 转发已经启用${NC}"
  else
    # 启用 IPv4 转发
    sed -i '/net.ipv4.ip_forward=/d' /etc/sysctl.conf
    echo "net.ipv4.ip_forward=1" >> /etc/sysctl.conf
    sysctl -p
  fi
  
  echo -e "${GREEN}✅ IPv4 转发已启用${NC}"
}

setup_nat_forwarding() {
  echo -e "${BLUE}[+] 设置 NAT 转发规则${NC}"
  
  # 获取默认网络接口
  DEFAULT_IFACE=$(ip route show default | awk '/default/ {print $5; exit}')
  if [[ -z "$DEFAULT_IFACE" ]]; then
    echo -e "${RED}错误: 无法确定默认网络接口${NC}"
    return 1
  fi
  
  LOCAL_IP=$(ip -4 addr show dev "$DEFAULT_IFACE" | grep -oP '(?<=inet\s)\d+(\.\d+){3}' | head -n1)
  if [[ -z "$LOCAL_IP" ]]; then
    echo -e "${RED}错误: 无法确定本地IPv4地址${NC}"
    return 1
  fi
  
  echo -e "${YELLOW}[*] 本地 IPv4 地址为: $LOCAL_IP${NC}"
  echo -e "${YELLOW}[*] 默认网络接口为: $DEFAULT_IFACE${NC}"

  # 清除旧规则
  iptables -D INPUT -p udp --dport "$WG_PORT" -j ACCEPT 2>/dev/null || true
  iptables -t nat -D PREROUTING -d "$LOCAL_IP" -j DNAT --to-destination "$WG_CLIENT_IP" 2>/dev/null || true
  iptables -t nat -D POSTROUTING -s "$WG_CLIENT_IP/32" -j SNAT --to-source "$LOCAL_IP" 2>/dev/null || true
  
  # 添加新规则
  iptables -I INPUT -p udp --dport "$WG_PORT" -j ACCEPT
  iptables -t nat -A POSTROUTING -o "$DEFAULT_IFACE" -j MASQUERADE
  
  # 保存iptables规则
  if command -v iptables-save &> /dev/null; then
    if [[ -d /etc/iptables ]]; then
      iptables-save > /etc/iptables/rules.v4
      echo -e "${GREEN}[*] iptables规则已保存到/etc/iptables/rules.v4${NC}"
    else
      iptables-save > /root/wg-iptables-rules
      echo -e "${YELLOW}[*] iptables规则已保存到/root/wg-iptables-rules${NC}"
    fi
  fi
  
  echo -e "${GREEN}✅ NAT 转发规则设置完成${NC}"
}

start_wg_server() {
  echo -e "${BLUE}[+] 启动 WireGuard 服务端配置${NC}"

  if [[ ! -f "$KEY_PATH/server.private" ]]; then
    echo -e "${RED}错误: 服务器私钥不存在. 请先生成密钥对${NC}"
    return 1
  fi
  
  # 检查是否有客户端公钥
  if [[ ! -f "$KEY_PATH/client.public" ]]; then
    echo -e "${YELLOW}警告: 客户端公钥不存在. 是否继续? [y/N]${NC}"
    read -r response
    if [[ ! "$response" =~ ^[Yy]$ ]]; then
      echo -e "${YELLOW}已取消${NC}"
      return 0
    fi
    # 如果用户确认继续，但没有客户端公钥，就创建一个空的peer配置部分
    PEER_CONFIG=""
  else
    # 创建peer配置部分
    PEER_CONFIG=$(cat <<EOF

[Peer]
PublicKey = $(cat "$KEY_PATH/client.public")
AllowedIPs = $WG_CLIENT_IP/32
EOF
)
  fi

  # 创建配置文件
  cat > "$WG_PATH/$WG_IF.conf" <<EOF
[Interface]
Address = $WG_SERVER_IP/24
ListenPort = $WG_PORT
PrivateKey = $(cat "$KEY_PATH/server.private")
$PEER_CONFIG
EOF

  # 确保文件权限正确
  chmod 600 "$WG_PATH/$WG_IF.conf"

  # 启动服务
  systemctl enable wg-quick@$WG_IF
  systemctl restart wg-quick@$WG_IF
  
  # 检查启动状态
  if systemctl is-active --quiet wg-quick@$WG_IF; then
    echo -e "${GREEN}✅ WireGuard 服务端已成功启动${NC}"
    wg show
  else
    echo -e "${RED}❌ WireGuard 服务端启动失败，请检查日志${NC}"
    journalctl -xeu wg-quick@$WG_IF
  fi
}

start_wg_client() {
  echo -e "${BLUE}[+] 启动 WireGuard 客户端配置${NC}"

  if [[ ! -f "$KEY_PATH/client.private" ]]; then
    echo -e "${RED}错误: 客户端私钥不存在. 请先生成密钥对${NC}"
    return 1
  fi
  
  if [[ ! -f "$KEY_PATH/server.public" ]]; then
    echo -e "${RED}错误: 服务器公钥不存在. 请先生成密钥对${NC}"
    return 1
  fi

  # 获取服务端信息
  read -rp "请输入服务端IP地址(IPv4或IPv6): " SERVER_IP
  
  if [[ -z "$SERVER_IP" ]]; then
    echo -e "${RED}错误: 服务端IP不能为空${NC}"
    return 1
  fi
  
  # 检测IP地址类型并格式化
  if [[ "$SERVER_IP" =~ : ]]; then
    # IPv6 地址
    FORMATTED_SERVER_IP="[$SERVER_IP]"
  else
    # IPv4 地址
    FORMATTED_SERVER_IP="$SERVER_IP"
  fi

  # 创建配置文件
  cat > "$WG_PATH/$WG_IF.conf" <<EOF
[Interface]
Address = $WG_CLIENT_IP/24
PrivateKey = $(cat "$KEY_PATH/client.private")

[Peer]
PublicKey = $(cat "$KEY_PATH/server.public")
Endpoint = $FORMATTED_SERVER_IP:$WG_PORT
AllowedIPs = 0.0.0.0/0
PersistentKeepalive = 25
EOF

  # 确保文件权限正确
  chmod 600 "$WG_PATH/$WG_IF.conf"

  # 启动服务
  systemctl enable wg-quick@$WG_IF
  systemctl restart wg-quick@$WG_IF
  
  # 检查启动状态
  if systemctl is-active --quiet wg-quick@$WG_IF; then
    echo -e "${GREEN}✅ WireGuard 客户端已成功启动${NC}"
    wg show
  else
    echo -e "${RED}❌ WireGuard 客户端启动失败，请检查日志${NC}"
    journalctl -xeu wg-quick@$WG_IF
  fi
}

set_default_route() {
  echo -e "${BLUE}[+] 将默认 IPv4 路由设置为 $WG_IF...${NC}"
  
  # 检查接口是否存在
  if ! ip link show "$WG_IF" &>/dev/null; then
    echo -e "${RED}错误: $WG_IF 接口不存在${NC}"
    return 1
  fi
  
  # 保存原始路由
  ORIGINAL_GW=$(ip route show default | head -n1)
  echo "$ORIGINAL_GW" > "/tmp/wg_original_route"
  
  # 设置新路由
  ip route replace default dev "$WG_IF"
  
  echo -e "${GREEN}✅ 默认路由已设置为 $WG_IF${NC}"
  echo -e "${YELLOW}原路由已保存到 /tmp/wg_original_route${NC}"
}

reset_default_route() {
  echo -e "${BLUE}[+] 恢复默认 IPv4 路由...${NC}"
  
  if [[ -f "/tmp/wg_original_route" ]]; then
    ORIGINAL_ROUTE=$(cat "/tmp/wg_original_route")
    ip route replace $ORIGINAL_ROUTE
    echo -e "${GREEN}✅ 默认路由已恢复${NC}"
  else
    echo -e "${YELLOW}无法找到原始路由信息，尝试自动检测...${NC}"
    
    # 尝试查找非WG的默认路由
    GATEWAY=$(ip route show | grep -v "$WG_IF" | awk '/default/ {print $3; exit}')
    IFACE=$(ip route show | grep -v "$WG_IF" | awk '/default/ {print $5; exit}')
    
    if [[ -n "$GATEWAY" && -n "$IFACE" ]]; then
      ip route replace default via "$GATEWAY" dev "$IFACE"
      echo -e "${GREEN}✅ 默认路由已恢复为 via $GATEWAY dev $IFACE${NC}"
    else
      echo -e "${RED}❌ 无法自动检测默认路由，请手动设置${NC}"
    fi
  fi
}

show_wg_status() {
  echo -e "${BLUE}[+] 当前 WireGuard 状态：${NC}"
  
  if ! command -v wg &> /dev/null; then
    echo -e "${RED}错误: WireGuard 未安装${NC}"
    return 1
  fi
  
  if ip link show "$WG_IF" &>/dev/null; then
    echo -e "${GREEN}接口 $WG_IF 存在${NC}"
    wg show
  else
    echo -e "${YELLOW}接口 $WG_IF 不存在或未启动${NC}"
  fi
  
  # 显示连接状态
  echo -e "\n${BLUE}[+] 连接状态：${NC}"
  systemctl status wg-quick@$WG_IF --no-pager
}

stop_wg() {
  echo -e "${BLUE}[+] 停止 WireGuard 服务...${NC}"
  
  if systemctl is-active --quiet wg-quick@$WG_IF; then
    systemctl stop wg-quick@$WG_IF
    systemctl disable wg-quick@$WG_IF
    echo -e "${GREEN}✅ WireGuard 服务已停止${NC}"
  else
    echo -e "${YELLOW}WireGuard 服务未运行${NC}"
  fi
}

show_config() {
  echo -e "${BLUE}[+] 当前配置信息：${NC}"
  echo -e "WireGuard 接口: ${GREEN}$WG_IF${NC}"
  echo -e "监听端口: ${GREEN}$WG_PORT${NC}"
  echo -e "服务器IP: ${GREEN}$WG_SERVER_IP${NC}"
  echo -e "客户端IP: ${GREEN}$WG_CLIENT_IP${NC}"
  
  # 显示密钥状态
  echo -e "\n${BLUE}[+] 密钥状态：${NC}"
  if [[ -f "$KEY_PATH/server.private" ]]; then
    echo -e "服务器私钥: ${GREEN}存在${NC}"
  else
    echo -e "服务器私钥: ${RED}不存在${NC}"
  fi
  
  if [[ -f "$KEY_PATH/server.public" ]]; then
    echo -e "服务器公钥: ${GREEN}存在${NC}"
  else
    echo -e "服务器公钥: ${RED}不存在${NC}"
  fi
  
  if [[ -f "$KEY_PATH/client.private" ]]; then
    echo -e "客户端私钥: ${GREEN}存在${NC}"
  else
    echo -e "客户端私钥: ${RED}不存在${NC}"
  fi
  
  if [[ -f "$KEY_PATH/client.public" ]]; then
    echo -e "客户端公钥: ${GREEN}存在${NC}"
  else
    echo -e "客户端公钥: ${RED}不存在${NC}"
  fi
  
  # 显示当前配置文件内容
  if [[ -f "$WG_PATH/$WG_IF.conf" ]]; then
    echo -e "\n${BLUE}[+] 配置文件内容：${NC}"
    cat "$WG_PATH/$WG_IF.conf"
  fi
}

export_client_qrcode() {
  echo -e "${BLUE}[+] 导出客户端配置为二维码${NC}"
  
  # 检查是否安装了qrencode
  if ! command -v qrencode &> /dev/null; then
    echo -e "${YELLOW}正在安装qrencode...${NC}"
    apt-get update && apt-get install -y qrencode || yum install -y qrencode
  fi
  
  # 检查客户端配置是否存在
  if [[ ! -f "$WG_PATH/$WG_IF.conf" ]]; then
    echo -e "${RED}错误: 客户端配置文件不存在${NC}"
    return 1
  fi
  
  echo -e "${YELLOW}请选择导出方式:${NC}"
  echo "1) 显示在终端"
  echo "2) 保存为PNG文件"
  read -rp "选择 [1/2]: " export_option
  
  case $export_option in
    1)
      qrencode -t ansiutf8 < "$WG_PATH/$WG_IF.conf"
      ;;
    2)
      qrcode_file="wg-client-config.png"
      qrencode -t png -o "$qrcode_file" < "$WG_PATH/$WG_IF.conf"
      echo -e "${GREEN}✅ 二维码已保存到 $qrcode_file${NC}"
      ;;
    *)
      echo -e "${RED}无效选项${NC}"
      return 1
      ;;
  esac
  
  echo -e "${GREEN}✅ 导出完成${NC}"
}

# 检查root权限
check_root

# 初始化
init

# 主循环
while true; do
  show_menu
  read -rp "请选择操作编号: " opt
  case $opt in
    0) configure_params ;;
    1) generate_keys ;;
    2) install_wg ;;
    3) enable_ipv4_forward ;;
    4) setup_nat_forwarding ;;
    5) start_wg_server ;;
    6) install_wg ;;
    7) start_wg_client ;;
    8) set_default_route ;;
    9) reset_default_route ;;
    10) show_wg_status ;;
    11) stop_wg ;;
    12) show_config ;;
    13) export_client_qrcode ;;
    q|Q) echo -e "${GREEN}谢谢使用，再见！${NC}" && exit 0 ;;
    *) echo -e "${RED}无效选项，请重新选择。${NC}" ;;
  esac
  pause
done
