package com.itheima.charstream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author csq
 * @date 2020/8/4 10:10
 */
public class BufferedReaderDemo02 {
    public static void main(String[] args)throws IOException {
        //String readLine()
        // 读一行文字。 结果包含行的内容的字符串，
        // 不包括任何行终止字符如果流的结尾已经到达，则为null
        BufferedReader bufferedReader = new BufferedReader(new FileReader("day15-io\\c.txt"));
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            //line不包括换行
            System.out.println(line);
        }
    }
}
