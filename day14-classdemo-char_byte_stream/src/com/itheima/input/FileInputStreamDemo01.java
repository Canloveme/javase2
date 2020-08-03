package com.itheima.input;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author csq
 * @date 2020/8/3 14:07
 */
public class FileInputStreamDemo01 {
    public static void main(String[] args) throws IOException {
        //创建字节输入流的对象  InputStream的具体子类FileInputStream
        InputStream inputStream = new FileInputStream("day14-studydemo-char_byte_stream\\bbb.txt");
        //如果文件存在，创建成功
        //InputStream inputStream = new FileInputStream("day14-studydemo-char_byte_stream\\a.txt");
        //如果文件不存在，报错java.io.FileNotFoundException 文件不存在读不到
        //InputStream inputStream = new FileInputStream("day14-studydemo-char_byte_stream\\aaa.txt");

        //一次读取一个字节，使用int存储，返回值就是本次读到的那个字节数据
        //如果读不到返回-1
        //也就是字符在码表中对应的数字int，如果要返回字符，强制为char
        int read = inputStream.read();
        char c = (char) inputStream.read();

        System.out.println("read = " + read);

        //释放资源
        inputStream.close();
    }
}
