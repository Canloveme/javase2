package cn.csq.homework;

import java.io.*;
import java.nio.charset.StandardCharsets;

/**
 * @author csq
 * @date 2020/8/4 18:53
 */
public class Ex03 {
    /**
     * 3. 使用转换流(InputStreamReader,OutputStreamWriter)复制文本文件,
     * 一次一个字符,一个一个字符数组分别实现.
     */
    public static void main(String[] args) throws IOException {
        File srcFile = new File("day15-io\\ex03.txt");
        File copyFile1 = new File("day15-io\\ex03_copy1.txt");
        File copyFile2 = new File("day15-io\\ex03_copy2.txt");
        method1(srcFile, copyFile1);
        method2(srcFile, copyFile2);
    }

    private static void method2(File srcFile, File copyFile2) throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(srcFile));
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(copyFile2));
        int len;
        char[] chars = new char[1024];
        while ((len = inputStreamReader.read(chars))!= -1) {
            outputStreamWriter.write(chars,0,len);
        }
        inputStreamReader.close();
        outputStreamWriter.close();
    }


    private static void method1(File srcFile, File copyFile1) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(srcFile);
        FileOutputStream fileOutputStream = new FileOutputStream(copyFile1);
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, StandardCharsets.UTF_8);
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream, StandardCharsets.UTF_8);
        int a;
        while ((a = inputStreamReader.read()) != -1) {
            outputStreamWriter.write((char) a);
        }
        inputStreamReader.close();
        outputStreamWriter.close();
    }


}
