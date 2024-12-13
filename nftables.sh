#!/bin/bash

# 检查是否以 root 权限运行
if [ "$EUID" -ne 0 ]; then
  echo "请使用 root 权限运行此脚本。"
  exit 1
fi

# 检查并启用内核 IP 转发
IP_FORWARD=$(sysctl net.ipv4.ip_forward | awk '{print $3}')
if [ "$IP_FORWARD" -eq 0 ]; then
  echo "IP 转发未启用，正在启用..."
  sysctl -w net.ipv4.ip_forward=1
  if ! grep -q "^net.ipv4.ip_forward=1" /etc/sysctl.conf; then
    echo "net.ipv4.ip_forward=1" >> /etc/sysctl.conf
  fi
  sysctl -p >/dev/null
else
  echo "IP 转发已启用。"
fi

# 主菜单
while true; do
  clear
  echo "======== 防火墙规则管理脚本 ========"
  echo "1. 配置转发规则"
  echo "2. 查看当前 nftables 规则"
  echo "3. 删除指定本地端口的规则"
  echo "4. 退出"
  echo "===================================="
  read -p "请选择操作: " choice

  case $choice in
    1)
      # 用户输入本地监听地址和端口、目标地址和端口
      read -p "请输入本地监听IP地址: " LOCAL_IP
      read -p "请输入本地监听端口: " LOCAL_PORT
      read -p "请输入目标IP地址: " TARGET_IP
      read -p "请输入目标端口: " TARGET_PORT

      # 设置 nftables 转发规则
      echo "配置 nftables 转发规则..."
      nft add table ip nat 2>/dev/null || true
      nft add chain ip nat PREROUTING { type nat hook prerouting priority dstnat \; } 2>/dev/null || true
      nft add chain ip nat POSTROUTING { type nat hook postrouting priority srcnat \; } 2>/dev/null || true

      nft add rule ip nat PREROUTING ip daddr $LOCAL_IP tcp dport $LOCAL_PORT dnat to $TARGET_IP:$TARGET_PORT
      nft add rule ip nat PREROUTING ip daddr $LOCAL_IP udp dport $LOCAL_PORT dnat to $TARGET_IP:$TARGET_PORT
      nft add rule ip nat POSTROUTING ip daddr $TARGET_IP tcp dport $TARGET_PORT masquerade
      nft add rule ip nat POSTROUTING ip daddr $TARGET_IP udp dport $TARGET_PORT masquerade

      echo "规则已添加："
      nft list ruleset

      # 保存规则到永久配置
      read -p "是否保存规则到永久配置？(y/n): " SAVE_RULES
      if [[ "$SAVE_RULES" == "y" || "$SAVE_RULES" == "Y" ]]; then
        nft list ruleset > /etc/nftables.conf
        echo "规则已保存到 /etc/nftables.conf"
      else
        echo "规则未保存为永久配置。重启后规则将丢失。"
      fi
      ;;
    2)
      # 查看当前的 nftables 规则并格式化输出
      echo "当前 nftables 转发规则："
      nft -a list ruleset | grep "dnat to" | while read -r line; do
        LOCAL_IP=$(echo "$line" | grep -oP "ip daddr \K[\d.]+")
        LOCAL_PORT=$(echo "$line" | grep -oP "dport \K\d+")
        TARGET=$(echo "$line" | grep -oP "dnat to \K[\d.]+:\d+")
        if [[ -n "$LOCAL_IP" && -n "$LOCAL_PORT" && -n "$TARGET" ]]; then
          echo "$LOCAL_IP:$LOCAL_PORT >>> $TARGET"
        fi
      done
      read -p "按 Enter 键返回菜单..."
      ;;
    3)
      # 删除指定本地端口的规则
      read -p "请输入要删除规则的本地监听端口 (例如 8881): " LOCAL_PORT
      echo "正在删除与本地端口 $LOCAL_PORT 相关的规则..."

      # 获取并删除匹配的规则
      nft -a list ruleset | grep "dport $LOCAL_PORT" | awk '{print $NF}' | while read -r HANDLE; do
        nft delete rule ip nat PREROUTING handle "$HANDLE"
      done

      nft -a list ruleset | grep "dport $LOCAL_PORT" | awk '{print $NF}' | while read -r HANDLE; do
        nft delete rule ip nat POSTROUTING handle "$HANDLE"
      done

      nft list ruleset > /etc/nftables.conf
      
      echo "规则已删除（若存在）。"
      read -p "按 Enter 键返回菜单..."
      ;;
    4)
      # 退出脚本
      echo "退出脚本。"
      exit 0
      ;;
    *)
      # 处理无效输入
      echo "无效选择，请重新输入。"
      read -p "按 Enter 键返回菜单..."
      ;;
  esac
done
