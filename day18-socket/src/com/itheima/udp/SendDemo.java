package com.itheima.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

/**
 * @author csq
 * @date 2020/8/9 13:55
 */
public class SendDemo {
    public static void main(String[] args) throws IOException {
        /**
         * UDP发送数据：
         *         数据来自于键盘录入，直到输入的数据是886，发送数据结束
         */
        DatagramSocket datagramSocket = new DatagramSocket();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String s = scanner.nextLine();
            if ("886".equals(s)) {
                break;
            }
            //创建数据，并把数据打包
            byte[] bys = s.getBytes();
            DatagramPacket dp = new DatagramPacket(bys, bys.length, InetAddress.getByName("192.168.1.66"), 12345);

            //调用DatagramSocket对象的方法发送数据
            datagramSocket.send(dp);
        }
        datagramSocket.close();
    }
}
