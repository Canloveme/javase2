package cn.csq.homework.ex01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @author csq
 * @date 2020/8/9 19:36
 * 独立完成数据回写案例
 */
public class ClientDemo {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1", 9999);
        OutputStream outputStream = socket.getOutputStream();

        outputStream.write("hello你好呀".getBytes());
        //标记
        socket.shutdownOutput();
        //解决中文乱码问题
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String line;
        while((line = br.readLine())!=null){
            System.out.println(line);
        }
        br.close();
        outputStream.close();
        socket.close();
    }
}
