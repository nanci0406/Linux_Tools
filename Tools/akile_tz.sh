#!/bin/bash

# 检查并安装 jq
install_jq() {
  if ! command -v jq &> /dev/null; then
    echo "jq 未安装，正在安装 jq..."
    if [ -f /etc/debian_version ]; then
      # Debian/Ubuntu 系统
      apt-get update && apt-get install -y jq
    elif [ -f /etc/redhat-release ]; then
      # CentOS/RHEL 系统
      yum install -y jq
    else
      echo "无法识别的操作系统，请手动安装 jq。"
      exit 1
    fi
  else
    echo "jq 已经安装。"
  fi
}

# 安装监控面板
install_monitor() {
  # 安装 jq
  install_jq

  # 获取最新的版本号
  latest_version=$(curl -s https://api.github.com/repos/akile-network/akile_monitor/releases/latest | jq -r .tag_name)

  # 检查是否成功获取到版本号
  if [ -z "$latest_version" ]; then
    echo "未能获取到最新版本号，请检查网络连接或GitHub API。"
    exit 1
  fi

  # 打印最新版本号
  echo "最新版本号: $latest_version"

  # 创建监控目录
  mkdir -p /etc/ak_monitor/

  # 进入目录
  cd /etc/ak_monitor/

  # 下载最新版本的 ak_monitor 可执行文件
  wget -O ak_monitor "https://github.com/akile-network/akile_monitor/releases/download/${latest_version}/akile_monitor-linux-amd64"

  # 设置可执行权限
  chmod 777 ak_monitor

  # 创建 systemd 服务文件
  cat > /etc/systemd/system/ak_monitor.service <<EOF
[Unit]
Description=AkileCloud Monitor Service
After=network.target nss-lookup.target
Wants=network.target

[Service]
User=root
Group=root
Type=simple
LimitAS=infinity
LimitRSS=infinity
LimitCORE=infinity
LimitNOFILE=999999999
WorkingDirectory=/etc/ak_monitor/
ExecStart=/etc/ak_monitor/ak_monitor
Restart=on-failure
RestartSec=10

[Install]
WantedBy=multi-user.target
EOF

  # 重新加载 systemd 配置
  systemctl daemon-reload

  # 启动并启用服务
  systemctl start ak_monitor.service
  systemctl enable ak_monitor.service

  echo "AkileCloud Monitor 已成功安装并启动！"

  # 拉取配置文件
  wget -O /etc/ak_monitor/config.json https://raw.githubusercontent.com/akile-network/akile_monitor/refs/heads/main/config.json

  # 提示用户修改配置
  read -p "请输入新的 auth_secret: " auth_secret
  sed -i "s/\"auth_secret\": \"auth_secret\"/\"auth_secret\": \"$auth_secret\"/g" /etc/ak_monitor/config.json

  # 让用户输入端口号，去掉冒号（即输入数字部分）
  read -p "请输入新的监听端口: " listen_port
  # 确保用户输入的是有效的端口号
  if [[ ! "$listen_port" =~ ^[0-9]+$ ]]; then
    echo "无效的端口号。请重新输入一个有效的数字端口号。"
    exit 1
  fi
  # 更新配置文件中的监听地址
  sed -i "s/\"listen\": \":3000\"/\"listen\": \":$listen_port\"/g" /etc/ak_monitor/config.json

  # 修改 tg_token
  read -p "请输入新的 Telegram bot token: " tg_token
  sed -i "s/\"tg_token\": \"your_telegram_bot_token\"/\"tg_token\": \"$tg_token\"/g" /etc/ak_monitor/config.json


  echo "配置文件已更新，请检查 /etc/ak_monitor/config.json 是否符合要求。正在重启面板"
  
  # 重启服务
  systemctl restart ak_monitor.service
}

# 安装监控端
install_client() {
  # 创建监控目录
  mkdir -p /etc/ak_monitor/

  # 进入目录
  cd /etc/ak_monitor/

  # 下载监控端客户端
  wget -O client https://github.com/akile-network/akile_monitor/releases/download/v0.01/akile_client-linux-amd64
  chmod 777 client

  # 创建 systemd 服务文件
  cat > /etc/systemd/system/ak_client.service <<EOF
[Unit]
Description=AkileCloud Monitor Client
After=network.target nss-lookup.target
Wants=network.target

[Service]
User=root
Group=root
Type=simple
LimitAS=infinity
LimitRSS=infinity
LimitCORE=infinity
LimitNOFILE=999999999
WorkingDirectory=/etc/ak_monitor/
ExecStart=/etc/ak_monitor/client
Restart=always
RestartSec=10

[Install]
WantedBy=multi-user.target
EOF

  # 重新加载 systemd 配置
  systemctl daemon-reload

  # 启动并启用客户端服务
  systemctl start ak_client.service
  systemctl enable ak_client.service

  echo "AkileCloud Monitor 客户端已成功安装并启动！"

  # 拉取监控端配置文件
  wget -O /etc/ak_monitor/client.json https://raw.githubusercontent.com/akile-network/akile_monitor/refs/heads/main/client.json

  # 提示用户修改配置
  read -p "请输入面板端的 auth_secret: " auth_secret
  sed -i "s/\"auth_secret\": \"面板端设置的key\"/\"auth_secret\": \"$auth_secret\"/g" /etc/ak_monitor/client.json

  # 获取面板端 IP 地址
  read -p "请输入面板端的 IP 地址: " panel_ip
  sed -i "s/\"url\": \"ws://面板端ip:3000/monitor\"/\"url\": \"ws://$panel_ip:3000/monitor\"/g" /etc/ak_monitor/client.json

  # 自动识别主网卡名称
  net_name=$(ip link show | grep -E "enp|eth" | head -n 1 | awk '{print $2}' | tr -d ':')
  sed -i "s/\"net_name\": \"自动识别主网卡名称并填入，如eth0或enp0s3等\"/\"net_name\": \"$net_name\"/g" /etc/ak_monitor/client.json

  # 获取节点名称
  read -p "请输入节点名称: " node_name
  sed -i "s/\"name\": \"节点名称\"/\"name\": \"$node_name\"/g" /etc/ak_monitor/client.json

  echo "配置文件已更新，请检查 /etc/ak_monitor/client.json 是否符合要求。正在重启客户端"
  
  # 重启客户端服务
  systemctl restart ak_client.service
}

# 操作面板端
panel_operations() {
  echo "请选择面板端操作:"
  echo "1. 启动监控面板"
  echo "2. 重启监控面板"
  echo "3. 停止监控面板"
  echo "4. 设置监控面板开机自启"
  echo "5. 修改监控面板配置"
  echo "6. 卸载监控面板"
  echo "0. 返回上级菜单"

  read -p "请输入操作编号: " panel_choice

  case $panel_choice in
    1)
      start_monitor
      ;;
    2)
      restart_monitor
      ;;
    3)
      stop_monitor
      ;;
    4)
      enable_monitor
      ;;
    5)
      modify_config
      ;;
    6)
      uninstall_monitor
      ;;
    0)
      return
      ;;
    *)
      echo "无效的选项，请重新输入"
      ;;
  esac
}

# 操作监控端
client_operations() {
  echo "请选择监控端操作:"
  echo "1. 启动监控端"
  echo "2. 重启监控端"
  echo "3. 停止监控端"
  echo "4. 设置监控端开机自启"
  echo "5. 卸载监控端"
  echo "0. 返回上级菜单"

  read -p "请输入操作编号: " client_choice

  case $client_choice in
    1)
      start_client
      ;;
    2)
      restart_client
      ;;
    3)
      stop_client
      ;;
    4)
      enable_client
      ;;
    5)
      uninstall_client
      ;;
    0)
      return
      ;;
    *)
      echo "无效的选项，请重新输入"
      ;;
  esac
}

# 主菜单
while true; do
  echo "请选择操作:"
  echo "1. 安装面板端"
  echo "2. 安装监控端