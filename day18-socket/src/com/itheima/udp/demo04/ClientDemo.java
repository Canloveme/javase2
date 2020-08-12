package com.itheima.udp.demo04;

import java.io.IOException;
import java.net.*;

/**
 * @author csq
 * @date 2020/8/9 14:30
 */
public class ClientDemo {
    public static void main(String[] args) throws IOException {
        while (true) {
            // 1. 创建发送端Socket对象(DatagramSocket)
            DatagramSocket ds = new DatagramSocket();
            // 2. 创建存储数据的箱子,将广播地址封装进去
            String s = "大家好，我是联系时长两年半的个人练习生蔡徐坤，喜欢唱、跳、rap、打篮球、music 起";
            byte[] bytes = s.getBytes();
            InetAddress address = InetAddress.getByName("255.255.255.255");
            int port = 10000;
            DatagramPacket dp = new DatagramPacket(bytes,bytes.length,address,port);
            // 3. 发送数据
            ds.send(dp);
            // 4. 释放资源
            ds.close();
        }
    }
}
