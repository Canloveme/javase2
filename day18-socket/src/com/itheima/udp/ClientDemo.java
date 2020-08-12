package com.itheima.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * @author csq
 * @date 2020/8/9 10:29
 */
public class ClientDemo {
    public static void main(String[] args) throws IOException {
        while (true) {
            for (int i = 0; i < 200; i++) {
                String str = "广播了广播了";
                byte[] bytes = str.getBytes();
                String ip = "192.168.81.";
                ip = ip + i;

                for (int port = 10000; port <= 12345; port++) {
                    try {
                        InetAddress name = InetAddress.getByName(ip);
                        System.out.println("向" + ip+" "+port + "发送数据");
                        DatagramPacket datagramPacket = new DatagramPacket(bytes, bytes.length, name, port);
                        DatagramSocket datagramSocket = new DatagramSocket();
                        datagramSocket.send(datagramPacket);
                        datagramSocket.close();
                    } catch (IOException e) {

                    }
                }
                for (int port = 20000; port <= 21000; port++) {
                    try {
                        InetAddress name = InetAddress.getByName(ip);
                        System.out.println("向" + ip+" "+port + "发送数据");
                        DatagramPacket datagramPacket = new DatagramPacket(bytes, bytes.length, name, port);
                        DatagramSocket datagramSocket = new DatagramSocket();
                        datagramSocket.send(datagramPacket);
                        datagramSocket.close();
                    } catch (IOException e) {

                    }

                }
            }
        }
    }
}
