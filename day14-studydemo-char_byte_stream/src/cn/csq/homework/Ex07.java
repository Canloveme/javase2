package cn.csq.homework;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author csq
 * @date 2020/8/3 19:16
 */
public class Ex07 {
    public static void main(String[] args)throws IOException {

        File file = new File("D:\\test.txt");
        countChar(file, 'a');
    }

    private static void countChar(File file,char c) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(file);
        int a;
        int count = 0;
        while ((a = fileInputStream.read()) != -1) {
            if (a == c) {
                count++;
            }
        }
        System.out.println(c + " ����" + count + " ��");
    }
}
