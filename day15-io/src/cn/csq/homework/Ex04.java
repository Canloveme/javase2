package cn.csq.homework;

import java.io.*;

/**
 * @author csq
 * @date 2020/8/4 19:09
 */
public class Ex04 {
    public static void main(String[] args) throws IOException {
        /**
         * 4. 使用字符的便捷流(FileReader,FileWriter)复制文本文件,一次一个字符,
         * 一个一个字符数组分别实现.
         */
        method1();

        method2();
    }

    private static void method2() throws IOException {
        File srcFile = new File("day15-io\\ex04.txt");
        File copyFile = new File("day15-io\\ex04_copy2.txt");
        FileReader fileReader = new FileReader(srcFile);
        FileWriter fileWriter = new FileWriter(copyFile);

        char[] chs = new char[1024];
        int len;
        while ((len = fileReader.read(chs)) != -1) {
            fileWriter.write(new String(chs, 0, len));
        }
        fileReader.close();
        fileWriter.close();
    }

    private static void method1() throws IOException {
        File srcFile = new File("day15-io\\ex04.txt");
        File copyFile = new File("day15-io\\ex04_copy.txt");
        FileReader fileReader = new FileReader(srcFile);
        FileWriter fileWriter = new FileWriter(copyFile);

        int ch;
        while ((ch=fileReader.read())!=-1) {
           fileWriter.write(ch);
        }
        fileReader.close();
        fileWriter.close();
    }
}
