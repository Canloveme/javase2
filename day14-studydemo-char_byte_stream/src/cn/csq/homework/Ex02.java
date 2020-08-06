package cn.csq.homework;

import java.io.*;

/**
 * @author csq
 * @date 2020/8/3 18:36
 */
public class Ex02 {
    public static void main(String[] args) throws IOException {
        /**
         * 练习二:字节输出流写出字节数组数据
         * 描述:利用字节输出流一次写一个字节数组的方式向D盘的
         * b.txt文件输出内容:"i love java"。
         */
        File file = new File("D:\\b.txt");
        OutputStream outputStream = new FileOutputStream(file);
        outputStream.write("i love java".getBytes());
        outputStream.close();
    }
}
