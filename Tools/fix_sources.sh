#!/bin/bash

# 备份当前的 sources.list 文件
cp /etc/apt/sources.list /etc/apt/sources.list.bak

# 注释掉所有的 CD/DVD 安装源
sed -i.bak '/^deb cdrom:/s/^/#/' /etc/apt/sources.list

# 添加网络源，如果不存在的话
if ! grep -q "deb http://deb.debian.org/debian/ bookworm main" /etc/apt/sources.list; then
  echo "deb http://deb.debian.org/debian/ bookworm main" >> /etc/apt/sources.list
fi

if ! grep -q "deb http://security.debian.org/debian-security bookworm-security main" /etc/apt/sources.list; then
  echo "deb http://security.debian.org/debian-security bookworm-security main" >> /etc/apt/sources.list
fi

if ! grep -q "deb http://deb.debian.org/debian/ bookworm-updates main" /etc/apt/sources.list; then
  echo "deb http://deb.debian.org/debian/ bookworm-updates main" >> /etc/apt/sources.list
fi

# 更新软件包列表
apt update

echo "sources.list 已更新并且软件包列表已更新。"
