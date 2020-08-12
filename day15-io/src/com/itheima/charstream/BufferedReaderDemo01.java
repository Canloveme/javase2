package com.itheima.charstream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author csq
 * @date 2020/8/4 9:45
 */
public class BufferedReaderDemo01 {
    public static void main(String[] args) throws IOException {
        //装饰者设计模式  传入一个Reader对象
        BufferedReader bufferedReader = new BufferedReader(new FileReader("day15-io\\a.txt"));
   /*     int c;
        while ((c = bufferedReader.read()) != -1) {
            System.out.print((char) c);
        }
        */
        int len;
        char[]chars=new char[1024];
        while ((len = bufferedReader.read(chars)) != -1) {
            System.out.println(new String(chars, 0, len));
        }

    }
}
