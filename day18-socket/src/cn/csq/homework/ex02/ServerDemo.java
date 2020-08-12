package cn.csq.homework.ex02;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author csq
 * @date 2020/8/9 19:34
 */
public class ServerDemo {
    /**
     * 2.独立完成文件上传与数据回写案例
     */
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(9998);
        Socket socket = serverSocket.accept();
        BufferedInputStream bis = new BufferedInputStream(socket.getInputStream());
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("day18-socket\\io\\a_copy.jpg"));
        int b;
        while((b = bis.read()) !=-1){
            bos.write(b);
        }
        socket.shutdownInput();
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        bufferedWriter.write("文件已经上传");
        bufferedWriter.newLine();
        bufferedWriter.flush();

        bufferedWriter.close();
        serverSocket.close();
        socket.close();
    }
}
