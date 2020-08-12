package com.itheima.udp.demo03;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

/**
 * @author csq
 * @date 2020/8/9 14:15
 */
public class ServerDemo {
    public static void main(String[] args) throws IOException {
        MulticastSocket multicastSocket = new MulticastSocket(10000);
        //组播的ip地址  必须在  224.0.0.1 --- > 239.255.255.255
        InetAddress inetAddress = InetAddress.getByName("224.0.0.1");
        multicastSocket.joinGroup(inetAddress);
        byte[] bytes = new byte[1024];
        DatagramPacket datagramPacket = new DatagramPacket(bytes, bytes.length);
        multicastSocket.receive(datagramPacket);
        byte[] data = datagramPacket.getData();
        System.out.println(new String(data));
    }
}
