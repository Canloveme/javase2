package com.itheima.buffered;

import java.io.*;

/**
 * @author csq
 * @date 2020/8/3 15:40
 */
public class BufferedDemo01 {
    public static void main(String[] args) throws IOException {
        //缓冲流  =  基本字节流 + 缓冲区  效率高

        //底层的copy还是字节流完成
        //利用缓冲流去拷贝文件
        //创建一个字节缓冲输入流
        File file = new File("day14-studydemo-char_byte_stream/copy_static2.png");
        //1. 创建对象
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));

        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream("day14-studydemo-char_byte_stream/copy_buffered_static3.png"));


        //2. 读写数据
        int b;
        while((b = bufferedInputStream.read())!=-1){
            bufferedOutputStream.write(b);
        }
        //3. 释放资源
        bufferedInputStream.close();
        bufferedOutputStream.close();
    }
}
