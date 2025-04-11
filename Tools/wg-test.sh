#!/bin/bash

WG_IF="wg0"
WG_PORT=51820
WG_CLIENT_IP="192.168.0.2"
WG_SERVER_IP="192.168.0.1"
WG_PATH="/etc/wireguard"
KEY_PATH="./keys"

mkdir -p "$KEY_PATH"

show_menu() {
  echo "==========================================="
  echo " WireGuard 隧道管理工具"
  echo "==========================================="
  echo "[密钥管理]"
  echo "0) 生成密钥对（客户端或服务端通用）"
  echo
  echo "[服务端 - 双栈服务器]"
  echo "1) 安装 WireGuard"
  echo "2) 启用 IPv4 转发"
  echo "3) 设置 NAT 转发规则（你自定义的方式）"
  echo "4) 启动 WireGuard 服务端配置"
  echo
  echo "[客户端 - 纯IPv6服务器]"
  echo "5) 安装 WireGuard"
  echo "6) 启动 WireGuard 客户端配置"
  echo
  echo "[通用功能]"
  echo "7) 设置默认路由走 wg0"
  echo "8) 恢复默认路由"
  echo "9) 查看 wg 状态"
  echo "q) 退出"
  echo "==========================================="
}

pause() {
  read -rp "按 Enter 返回主菜单..."
}

generate_keys() {
  echo "请输入要生成密钥对的标识（如：server 或 client）"
  read -rp "标识名: " name
  mkdir -p "$KEY_PATH"
  wg genkey | tee "$KEY_PATH/$name.private" | wg pubkey > "$KEY_PATH/$name.public"
  echo
  echo "✅ 密钥对已生成，路径如下："
  echo "私钥：$KEY_PATH/$name.private"
  echo "公钥：$KEY_PATH/$name.public"
  echo
  echo "请复制你需要使用的公钥或私钥 ↓↓↓"
  echo "私钥：$(cat $KEY_PATH/$name.private)"
  echo "公钥：$(cat $KEY_PATH/$name.public)"
  pause
}

install_wg() {
  echo "[+] 安装 WireGuard 中..."
  apt update && apt install -y wireguard iptables
}

enable_ipv4_forward() {
  echo "[+] 启用 IPv4 转发..."
  sed -i 's/^#net.ipv4.ip_forward=1/net.ipv4.ip_forward=1/' /etc/sysctl.conf
  sysctl -p
}

setup_nat_forwarding() {
  echo "[+] 设置 NAT 转发规则 (来自你的方式)"
  LOCAL_IP=$(ip -4 addr show dev $(ip route show default | awk '/default/ {print $5}') | grep -oP '(?<=inet\s)\d+(\.\d+){3}')
  echo "[*] 本地 IPv4 地址为：$LOCAL_IP"

  iptables -I INPUT -p udp --dport $WG_PORT -j ACCEPT
  iptables -t nat -A PREROUTING -d "$LOCAL_IP" -j DNAT --to-destination "$WG_CLIENT_IP"
  iptables -t nat -A POSTROUTING -j MASQUERADE
  sudo apt install iptables-persistent
  sudo netfilter-persistent save
  

  echo "[+] 已添加自定义 NAT 转发规则"
}

start_wg_server() {
  echo "[+] 启动 WireGuard 服务端配置"

  if [ ! -f "$KEY_PATH/server.private" ] || [ ! -f "$KEY_PATH/client.public" ]; then
    echo "❌ 错误：请先生成 server 的私钥和 client 的公钥"
    pause
    return
  fi

  cat > $WG_PATH/$WG_IF.conf <<EOF
[Interface]
Address = $WG_SERVER_IP/24
ListenPort = $WG_PORT
PrivateKey = $(cat $KEY_PATH/server.private)

[Peer]
PublicKey = $(cat $KEY_PATH/client.public)
AllowedIPs = $WG_CLIENT_IP/32
EOF

  systemctl enable wg-quick@$WG_IF
  systemctl restart wg-quick@$WG_IF

  echo "[+] 服务端配置已启动"
}

start_wg_client() {
  echo "[+] 启动 WireGuard 客户端配置"

  if [ ! -f "$KEY_PATH/client.private" ] || [ ! -f "$KEY_PATH/server.public" ]; then
    echo "❌ 错误：请先生成 client 的私钥和 server 的公钥"
    pause
    return
  fi

  read -rp "请输入服务端 IPv6 地址: " SERVER_IPV6

  cat > $WG_PATH/$WG_IF.conf <<EOF
[Interface]
Address = $WG_CLIENT_IP/24
PrivateKey = $(cat $KEY_PATH/client.private)

[Peer]
PublicKey = $(cat $KEY_PATH/server.public)
Endpoint = [$SERVER_IPV6]:$WG_PORT
AllowedIPs = 0.0.0.0/0
PersistentKeepalive = 25
EOF

  systemctl enable wg-quick@$WG_IF
  systemctl restart wg-quick@$WG_IF

  echo "[+] 客户端配置已启动"
}

set_default_route() {
  echo "[+] 将默认 IPv4 路由设置为 wg0..."
  ip route replace default dev $WG_IF
}

reset_default_route() {
  echo "[+] 恢复默认 IPv4 路由..."
  GATEWAY=$(ip route show | awk '/default/ && $3 != "wg0" {print $3; exit}')
  IFACE=$(ip route show | awk '/default/ && $5 != "wg0" {print $5; exit}')
  ip route replace default via $GATEWAY dev $IFACE
}

show_wg_status() {
  echo "[+] 当前 WireGuard 状态："
  wg show
}

while true; do
  show_menu
  read -rp "请选择操作编号: " opt
  case $opt in
    0) generate_keys ;;
    1) install_wg ;;
    2) enable_ipv4_forward ;;
    3) setup_nat_forwarding ;;
    4) start_wg_server ;;
    5) install_wg ;;
    6) start_wg_client ;;
    7) set_default_route ;;
    8) reset_default_route ;;
    9) show_wg_status ;;
    q) echo "再见！" && exit 0 ;;
    *) echo "无效选项，请重新选择。" ;;
  esac
  pause
done
