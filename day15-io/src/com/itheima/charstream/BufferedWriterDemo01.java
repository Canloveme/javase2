package com.itheima.charstream;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author csq
 * @date 2020/8/4 10:09
 */
public class BufferedWriterDemo01 {
    public static void main(String[] args)throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("day15-io\\c.txt"));

        bufferedWriter.write("test哈哈哈");
        bufferedWriter.close();

    }
}
