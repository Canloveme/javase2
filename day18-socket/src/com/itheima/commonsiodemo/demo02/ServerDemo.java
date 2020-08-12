package com.itheima.commonsiodemo.demo02;

import com.itheima.utils.FileNameUtil;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;

import java.io.File;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author csq
 * @date 2020/8/9 18:22
 */
public class ServerDemo {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(10000);
        Socket socket = serverSocket.accept();
        //byte[] bytes = IOUtils.toByteArray(socket.getInputStream());
        File file = new File(FileNameUtil.changeFileName()+".jpg");
        File parentFile = new File("day18-socket\\io\\copy");
        //FileUtils.copyFile(new File(), socket.getOutputStream());
        //InputStream inputStream = socket.getInputStream();
        byte[] bytes1 = IOUtils.toByteArray(socket.getInputStream());
        FileUtils.writeByteArrayToFile(new File(parentFile, String.valueOf(file)),bytes1);
        IOUtils.write("拷贝成功", socket.getOutputStream(), "utf-8");
        socket.close();
        serverSocket.close();
    }
}
