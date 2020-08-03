package com.itheima.input;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author csq
 * @date 2020/8/3 14:34
 */
public class FileInputStreamDemo03 {
    public static void main(String[] args) throws IOException {
        //复制文件
        File file = new File("C:\\Users\\MSI-PC\\Desktop\\static.png");
        System.out.println(file.getName());
        System.out.println(file.getPath());
        //输入进来
        FileInputStream fileInputStream = new FileInputStream(file);
        //输出 丢出去
        FileOutputStream fileOutputStream = new FileOutputStream("day14-studydemo-char_byte_stream\\copy_static.png");
        int a;
        while ((a = fileInputStream.read()) != -1) {
            fileOutputStream.write(a);
        }
        fileInputStream.close();
        fileOutputStream.close();
    }
}
