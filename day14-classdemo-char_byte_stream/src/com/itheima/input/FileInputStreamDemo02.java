package com.itheima.input;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author csq
 * @date 2020/8/3 14:31
 */
public class FileInputStreamDemo02 {
    public static void main(String[] args) throws IOException {
        //����
        InputStream fileInputStream = new FileInputStream("day14-studydemo-char_byte_stream/bbb.txt");

        int b;
        //�Ӹ���������ȡ���b.length���ֽڵ�����Ϊ�ֽ����顣 �˷�����������ֱ��ĳЩ������á�
        //���뻺���������ֽ������������û�и�������ݣ���Ϊ�ļ��Ľ�β�Ѿ���� -1 ��
        while ((b = fileInputStream.read()) != -1) {
            System.out.println((char) b);
        }

        fileInputStream.close();

    }
}
