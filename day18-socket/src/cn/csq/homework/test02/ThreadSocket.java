package cn.csq.homework.test02;

import java.io.*;
import java.net.Socket;
import java.util.UUID;

/**
 * @author MSI-PC
 */
public class ThreadSocket implements Runnable {
    private Socket acceptSocket;

    public ThreadSocket(Socket acceptSocket) {
        this.acceptSocket = acceptSocket;
    }

    @Override
    public void run() {
        BufferedOutputStream bos = null;
        try {
            //网络中得流，从客户端读取数据得
            BufferedInputStream bis = new BufferedInputStream(acceptSocket.getInputStream());
            //本地的IO流,把数据写到本地中,实现永久化存储
            bos = new BufferedOutputStream(new FileOutputStream("day18-socket\\io\\copy\\" + UUID.randomUUID().toString() + ".jpg"));
            int b;
            while((b = bis.read()) !=-1){
                bos.write(b);
            }
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(acceptSocket.getOutputStream()));
            bw.write("上传成功");
            bw.newLine();
            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(bos != null){
                try {
                    bos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (acceptSocket != null){
                try {
                    acceptSocket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }


}
