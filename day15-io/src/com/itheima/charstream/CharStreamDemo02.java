package com.itheima.charstream;

import java.io.FileReader;
import java.io.IOException;

/**
 * @author csq
 * @date 2020/8/4 9:27
 */
public class CharStreamDemo02 {
    public static void main(String[] args) throws IOException {
        //一次读取多个字符
        FileReader fileReader = new FileReader("day15-io\\a.txt");
        int len;
        char[] chars=new char[1024];
        System.out.println(fileReader.getEncoding());
        //返回此流使用的字符编码名称
        //public int read (char[] cbuf,
        //                int offset,
        //                int length)
        //         throws IOException将字符读入数组的一部分。
        //Specified by:
        //read在 Reader
        //参数
        //cbuf - 目的缓冲区
        //offset - 开始存储字符的偏移量
        //length - 要读取的最大字符数
        //结果
        //读取的字符数，如果已经达到流的结尾，则为-1
        //int read(char[] chars): 一次读取一个字符数组，返回值是读取的字符长度
        while ((len = fileReader.read(chars)) != -1) {
            System.out.println(new String(chars, 0, len));
        }
        fileReader.close();
    }
}
