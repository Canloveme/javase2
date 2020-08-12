package com.itheima.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * @author csq
 * @date 2020/8/9 10:41
 */
public class ServerDemo {
    public static void main(String[] args) throws IOException {
        //1. 找码头
        DatagramSocket datagramSocket = new DatagramSocket(10000);
        //2. 创建一个新的箱子
        byte[] bytes = new byte[1024];
        DatagramPacket datagramPacket = new DatagramPacket(bytes, bytes.length);
        //3. 接受礼物，把礼物放到新的箱子中  阻塞
        System.out.println("开始接受");
        datagramSocket.receive(datagramPacket);
        System.out.println("接受到");
        //4. 从新的箱子里面获取礼物
        //byte[] data = datagramPacket.getData();
        int length = datagramPacket.getLength();
        //System.out.println(new String(data,0,length));
        System.out.println(new String(bytes,0,length));
        //5.拿完走🐏
        datagramSocket.close();
    }
}
