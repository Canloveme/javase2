package cn.csq.homework.test01;

import com.itheima.utils.FileNameUtil;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author csq
 * @date 2020/8/9 20:12
 * 服务器只能处理一个客户端请求，接收完一个图片之后，服务器就关闭了。
 * 使用循环实现循环接受
 */
public class ServerDemo {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(10000);
        while (true) {
            Socket socket = serverSocket.accept();
            BufferedInputStream bufferedInputStream = new BufferedInputStream(socket.getInputStream());
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("day18-socket\\io\\copy\\" + FileNameUtil.changeFileName() + ".jpg"));

            //读一个写一个
            int b;
            while ((b = bufferedInputStream.read()) != -1) {
                bos.write(b);
            }
            //回传信息
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            bw.write("上传成功");
            bw.newLine();
            bw.flush();

            bos.close();
            socket.close();
            //serverSocket.close();
        }

       //
    }

}

