package com.itheima.charstream;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author csq
 * @date 2020/8/4 10:10
 */
public class BufferedWriterDemo02 {
    public static void main(String[] args) throws IOException {
        //特有方法
        //void newLine() 写一行行分隔符，行分割符有当前系统属性定义
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("day15-io\\c.txt"));
        //写数据
        for (int i = 0; i < 10; i++) {
            bufferedWriter.write("hello" + i);
            //bw.write("\r\n");
            bufferedWriter.newLine();
            bufferedWriter.flush();
        }
        bufferedWriter.close();
    }
}
