package com.itheima.input;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author csq
 * @date 2020/8/3 14:07
 */
public class FileInputStreamDemo01 {
    public static void main(String[] args) throws IOException {
        //�����ֽ��������Ķ���  InputStream�ľ�������FileInputStream
        InputStream inputStream = new FileInputStream("day14-studydemo-char_byte_stream\\bbb.txt");
        //����ļ����ڣ������ɹ�
        //InputStream inputStream = new FileInputStream("day14-studydemo-char_byte_stream\\a.txt");
        //����ļ������ڣ�����java.io.FileNotFoundException �ļ������ڶ�����
        //InputStream inputStream = new FileInputStream("day14-studydemo-char_byte_stream\\aaa.txt");

        //һ�ζ�ȡһ���ֽڣ�ʹ��int�洢������ֵ���Ǳ��ζ������Ǹ��ֽ�����
        //�������������-1
        //Ҳ�����ַ�������ж�Ӧ������int�����Ҫ�����ַ���ǿ��Ϊchar
        int read = inputStream.read();
        char c = (char) inputStream.read();

        System.out.println("read = " + read);

        //�ͷ���Դ
        inputStream.close();
    }
}
