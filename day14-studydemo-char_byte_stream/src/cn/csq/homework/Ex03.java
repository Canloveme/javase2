package cn.csq.homework;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author csq
 * @date 2020/8/3 18:39
 */
public class Ex03 {
    public static void main(String[] args) throws IOException {
        /**
         * 练习三:文件的续写和换行输出
         * 描述:在D盘下，有一c.txt 文件中内容为：HelloWorld
         * 在c.txt文件原内容基础上，添加五句 I love java，
         * 而且要实现一句一行操作(注：原文不可覆盖)。
         * 利用字节输出流对象往C盘下c.txt文件输出5句：”i love java”
         */
        File file = new File("D:\\c.txt");
        FileOutputStream fileOutputStream = new FileOutputStream(file, true);
        fileOutputStream.write("HelloWorld".getBytes());
        for (int i = 0; i < 5; i++) {
            fileOutputStream.write(System.lineSeparator().getBytes());
            fileOutputStream.write("I love java".getBytes());
        }
    }
}
