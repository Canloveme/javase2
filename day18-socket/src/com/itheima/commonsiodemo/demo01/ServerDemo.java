package com.itheima.commonsiodemo.demo01;

import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.List;

/**
 * @author csq
 * @date 2020/8/9 18:02
 */
public class ServerDemo {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(10000);

        Socket accept = serverSocket.accept();
        List<String> list = IOUtils.readLines(accept.getInputStream());
        for (String s : list) {
            System.out.println(s);
        }

        //回写数据到客户端
        IOUtils.write("收到", accept.getOutputStream(), "utf-8");


        accept.close();
        serverSocket.close();

    }
}
