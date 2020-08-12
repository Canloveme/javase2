package com.itheima.udp.demo03;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * @author csq
 * @date 2020/8/9 14:12
 * 组播
 */
public class ClientDemo {
    public static void main(String[] args) throws IOException {
        DatagramSocket datagramSocket = new DatagramSocket();

        String str = "hello group";

        byte[] bytes = str.getBytes();

        InetAddress inetAddress = InetAddress.getByName("224.0.0.1");

        int port = 10000;

        DatagramPacket datagramPacket = new DatagramPacket(bytes, bytes.length, inetAddress, port);
        datagramSocket.send(datagramPacket);
        datagramSocket.close();
    }
}
