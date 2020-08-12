package cn.csq.homework;

import java.io.*;

/**
 * @author csq
 * @date 2020/8/4 19:20
 */
public class Ex05 {
    public static void main(String[] args) throws IOException {
        //使用字符缓冲流(BufferedReader,BufferedWriter)复制文本文件,一次复制一行.

        method1();
        method2();
    }
        private static void method2 () throws IOException {
            File srcFile = new File("day15-io\\ex05.txt");
            File copyFile = new File("day15-io\\ex05_copy2.txt");
            BufferedReader bufferedReader = new BufferedReader(new FileReader(srcFile));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(copyFile));
            char[] chs = new char[1024];
            int len;
            while ((len = bufferedReader.read(chs)) != -1) {
                bufferedWriter.write(new String(chs, 0, len));
            }
            bufferedReader.close();
            bufferedWriter.close();
        }


        private static void method1() throws IOException {
            File srcFile = new File("day15-io\\ex05.txt");
            File copyFile = new File("day15-io\\ex05_copy1.txt");
            BufferedReader bufferedReader = new BufferedReader(new FileReader(srcFile));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(copyFile));
            int ch;
            while ((ch=bufferedReader.read())!=-1) {
                bufferedWriter.write(ch);
            }
            bufferedReader.close();
            bufferedWriter.close();
        }

}
