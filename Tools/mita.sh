#!/bin/bash

# 获取最新版本号
latest_version=$(curl -s https://api.github.com/repos/enfein/mieru/releases/latest | grep -oP '"tag_name": "\K(.*)(?=")')

# 提示用户输入用户名和密码
read -p "请输入用户名: " username
read -sp "请输入密码: " password
echo

# 下载最新版本的 deb 文件
url="https://github.com/enfein/mieru/releases/download/$latest_version/mita_${latest_version#v}_amd64.deb"
echo "正在下载 $url ..."
wget $url -O "mita_${latest_version#v}_amd64.deb"

# 检查下载是否成功
if [ ! -f "mita_${latest_version#v}_amd64.deb" ]; then
    echo "下载失败，请检查网络或URL。"
    exit 1
fi

# 安装包
sudo dpkg -i "mita_${latest_version#v}_amd64.deb"

# 添加用户权限
sudo usermod -a -G mita $USER

# 生成配置文件
cat > server_config.json << EOF
{
    "portBindings": [
        {
            "port": 23333,
            "protocol": "TCP"
        }
    ],
    "users": [
        {
            "name": "$username",
            "password": "$password"
        }
    ],
    "loggingLevel": "INFO",
    "mtu": 1400
}
EOF

# 应用配置
mita apply config server_config.json

# 启动服务
sudo systemctl restart mita

echo "服务器已配置完成，请使用端口23333连接。"