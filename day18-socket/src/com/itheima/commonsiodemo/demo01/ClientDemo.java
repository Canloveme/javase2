package com.itheima.commonsiodemo.demo01;

import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.net.Socket;
import java.util.List;

/**
 * @author csq
 * @date 2020/8/9 18:02
 */
public class ClientDemo {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1", 10000);

        String s = "hello 你好";
        /*OutputStream outputStream = socket.getOutputStream();

        outputStream.write(s.getBytes());*/
        IOUtils.write(s, socket.getOutputStream(), "utf-8");

        socket.shutdownOutput();
        List<String> strings = IOUtils.readLines(socket.getInputStream());
        for (String string : strings) {
            System.out.println(string);
        }
//        outputStream.close();
        socket.close();

    }
}
