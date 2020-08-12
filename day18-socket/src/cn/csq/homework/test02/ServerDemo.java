package cn.csq.homework.test02;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author csq
 * @date 2020/8/9 20:52
 */
public class ServerDemo {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(10000);

        while (true) {
            Socket accept = ss.accept();
            ThreadSocket ts = new ThreadSocket(accept);
            new Thread(ts).start();
        }
    }
}
