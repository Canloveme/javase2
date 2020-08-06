package com.itheima.charstream;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author csq
 * @date 2020/8/3 16:34
 */
public class CharStreamDemo01 {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("day14-studydemo-char_byte_stream/charstring.txt");
        //字节流中国解析有问题
        int b;
        while ((b=fileInputStream.read()) != -1) {
            System.out.println((char)b);
        }
        //编码 解码
        //编码 --->> 字符转为编号
        //解码 --->> 把编号转为字符
        //编码表：字符和编码之间的对应的关系表
        //字符集：字符的集合

    }
}
