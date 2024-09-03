#!/bin/bash

# 提示用户输入Cloudflare API信息
read -p "请输入Cloudflare API Key: " CLOUDFLARE_API_KEY
read -p "请输入Cloudflare Email: " CLOUDFLARE_EMAIL
read -p "请输入根域名 (如 example.com): " DOMAIN
read -p "请输入子域名 (如 www，不需要子域名可留空): " SUBDOMAIN

# 获取当前IP地址
CURRENT_IP=$(curl -s http://ipv4.icanhazip.com)

# 获取Zone ID
ZONE_ID=$(curl -s -X GET "https://api.cloudflare.com/client/v4/zones?name=$DOMAIN" \
    -H "X-Auth-Email: $CLOUDFLARE_EMAIL" \
    -H "X-Auth-Key: $CLOUDFLARE_API_KEY" \
    -H "Content-Type: application/json" | jq -r .result[0].id)

# 获取Record ID
RECORD_NAME="$SUBDOMAIN.$DOMAIN"
if [ -z "$SUBDOMAIN" ]; then
    RECORD_NAME="$DOMAIN"
fi

RECORD_ID=$(curl -s -X GET "https://api.cloudflare.com/client/v4/zones/$ZONE_ID/dns_records?name=$RECORD_NAME" \
    -H "X-Auth-Email: $CLOUDFLARE_EMAIL" \
    -H "X-Auth-Key: $CLOUDFLARE_API_KEY" \
    -H "Content-Type: application/json" | jq -r .result[0].id)

# 检查当前记录的IP地址
DNS_IP=$(curl -s -X GET "https://api.cloudflare.com/client/v4/zones/$ZONE_ID/dns_records/$RECORD_ID" \
    -H "X-Auth-Email: $CLOUDFLARE_EMAIL" \
    -H "X-Auth-Key: $CLOUDFLARE_API_KEY" \
    -H "Content-Type: application/json" | jq -r .result.content)

# 如果IP地址没有变化，则退出脚本
if [ "$CURRENT_IP" == "$DNS_IP" ]; then
    echo "IP地址没有变化，退出脚本。"
    exit 0
fi

# 更新DNS记录
UPDATE_RESPONSE=$(curl -s -X PUT "https://api.cloudflare.com/client/v4/zones/$ZONE_ID/dns_records/$RECORD_ID" \
    -H "X-Auth-Email: $CLOUDFLARE_EMAIL" \
    -H "X-Auth-Key: $CLOUDFLARE_API_KEY" \
    -H "Content-Type: application/json" \
    --data "{\"type\":\"A\",\"name\":\"$RECORD_NAME\",\"content\":\"$CURRENT_IP\",\"ttl\":120,\"proxied\":false}")

# 输出更新结果
if [[ $UPDATE_RESPONSE == *"\"success\":true"* ]]; then
    echo "DNS记录更新成功：$CURRENT_IP"
else
    echo "DNS记录更新失败：$UPDATE_RESPONSE"
fi