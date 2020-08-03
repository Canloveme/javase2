package com.itheima.input;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author csq
 * @date 2020/8/3 14:31
 */
public class FileInputStreamDemo02 {
    public static void main(String[] args) throws IOException {
        //多行
        InputStream fileInputStream = new FileInputStream("day14-studydemo-char_byte_stream/bbb.txt");

        int b;
        //从该输入流读取最多b.length个字节的数据为字节数组。 此方法将阻塞，直到某些输入可用。
        //读入缓冲区的总字节数，或者如果没有更多的数据，因为文件的结尾已经到达， -1 。
        while ((b = fileInputStream.read()) != -1) {
            System.out.println((char) b);
        }

        fileInputStream.close();

    }
}
