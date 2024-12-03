#!/bin/bash

# 显示菜单
echo "请选择操作:"
echo "1. 安装监控面板"
echo "2. 启动监控面板"
echo "3. 重启监控面板"
echo "4. 停止监控面板"
echo "5. 设置监控面板开机自启"
echo "0. 退出"

# 读取用户输入
read -p "请输入操作编号: " choice

# 安装监控面板
install_monitor() {
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
  echo "配置文件已下载，接下来请修改以下项："
  
  # 修改 auth_secret
  read -p "请输入 auth_secret (当前值为 'auth_secret'): " auth_secret
  sed -i "s/\"auth_secret\": \"auth_secret\"/\"auth_secret\": \"$auth_secret\"/g" /etc/ak_monitor/config.json

  # 修改 listen
  read -p "请输入监听地址 (当前值为 ':3000'): " listen
  sed -i "s/\"listen\": \":3000\"/\"listen\": \"$listen\"/g" /etc/ak_monitor/config.json

  # 修改 tg_token
  read -p "请输入 Telegram bot token (当前值为 'your_telegram_bot_token'): " tg_token
  sed -i "s/\"tg_token\": \"your_telegram_bot_token\"/\"tg_token\": \"$tg_token\"/g" /etc/ak_monitor/config.json

  echo "配置文件已更新，请检查 /etc/ak_monitor/config.json 是否符合要求。"
}

# 启动监控面板
start_monitor() {
  systemctl start ak_monitor.service
  echo "AkileCloud Monitor 已启动！"
}

# 重启监控面板
restart_monitor() {
  systemctl restart ak_monitor.service
  echo "AkileCloud Monitor 已重启！"
}

# 停止监控面板
stop_monitor() {
  systemctl stop ak_monitor.service
  echo "AkileCloud Monitor 已停止！"
}

# 设置监控面板开机自启
enable_monitor() {
  systemctl enable ak_monitor.service
  echo "AkileCloud Monitor 已设置为开机自启！"
}

# 根据用户选择执行相应操作
case $choice in
  1)
    install_monitor
    ;;
  2)
    start_monitor
    ;;
  3)
    restart_monitor
    ;;
  4)
    stop_monitor
    ;;
  5)
    enable_monitor
    ;;
  0)
    echo "退出程序"
    exit 0
    ;;
  *)
    echo "无效的选项，请重新输入"
    ;;
esac