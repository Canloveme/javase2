package com.itheima.input;

import java.io.*;

/**
 * @author csq
 * @date 2020/8/3 15:11
 */
public class FileInputStreamDemo04 {
    public static void main(String[] args) throws IOException {
        //提高拷贝速度的解决方案
        //为了解决速度问题，字节流通过创建字节数组，可以一次读写多个数据。

        //一次读一个字节数组的方法：
        //public int read(byte[] b]:从输入流读取最多b.length个字节的数据
        //返回的是读入缓冲区的总字节数，也就是实际的读取字节个数

        File file = new File("day14-studydemo-char_byte_stream/copy_static.png");
        InputStream inputStream = new FileInputStream(file);
        OutputStream OutputStream = new FileOutputStream("day14-studydemo-char_byte_stream/copy_static2.png");
        byte[] bytes = new byte[1024];
        int len;
        //len 表示本次读到的有效字节个数，  这次读取了几字节
        //作业相当于一个中间载体，先读取一部分出来，存入数组，然后将字节数组写进去
        while ((len = inputStream.read(bytes)) != -1) {
            //字节数组写入
            OutputStream.write(bytes, 0, len);
        }

        inputStream.close();
        OutputStream.close();
    }
}
