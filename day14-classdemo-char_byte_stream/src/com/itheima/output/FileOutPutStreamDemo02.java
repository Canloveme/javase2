package com.itheima.output;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author csq
 * @date 2020/8/3 11:10
 */
public class FileOutPutStreamDemo02 {
    public static void main(String[] args) throws IOException {
        //创建字节输出流
        FileOutputStream fileOutputStream = new FileOutputStream("day14-studydemo-char_byte_stream\\bbb.txt");

        //写入数据的三种方法
        //void  write(int b) 一次写一个字节数据   int的低8位的一个byte 将指定的字节写入此文件输出流
        fileOutputStream.write(98);
        //写入b

        //void write(byte []b) 一次写一个字节数组数据 将b.length字节从指定的字节数组写入此文件输出流
        byte[] bytes = {97, 98, 99, 100};
        fileOutputStream.write(bytes);
        //写入abcd

        //void write(byte []b,int off,int len) 一次写一个字节数组的部分数据
        //将len字节从指定的字节数组开始，从偏移量off开始写入此文件输出流
        //b 字节数组 off数组开始索引  len写入多长
        fileOutputStream.write(bytes, 1, 3);
        //写入bcd

        fileOutputStream.write("\r\n".getBytes());
        fileOutputStream.write("hello".getBytes());

        //关闭资源
        fileOutputStream.close();

    }
}
