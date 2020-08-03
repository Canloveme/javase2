package com.itheima.output;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author csq
 * @date 2020/8/3 11:10
 */
public class FileOutPutStreamDemo02 {
    public static void main(String[] args) throws IOException {
        //�����ֽ������
        FileOutputStream fileOutputStream = new FileOutputStream("day14-studydemo-char_byte_stream\\bbb.txt");

        //д�����ݵ����ַ���
        //void  write(int b) һ��дһ���ֽ�����   int�ĵ�8λ��һ��byte ��ָ�����ֽ�д����ļ������
        fileOutputStream.write(98);
        //д��b

        //void write(byte []b) һ��дһ���ֽ��������� ��b.length�ֽڴ�ָ�����ֽ�����д����ļ������
        byte[] bytes = {97, 98, 99, 100};
        fileOutputStream.write(bytes);
        //д��abcd

        //void write(byte []b,int off,int len) һ��дһ���ֽ�����Ĳ�������
        //��len�ֽڴ�ָ�����ֽ����鿪ʼ����ƫ����off��ʼд����ļ������
        //b �ֽ����� off���鿪ʼ����  lenд��೤
        fileOutputStream.write(bytes, 1, 3);
        //д��bcd

        fileOutputStream.write("\r\n".getBytes());
        fileOutputStream.write("hello".getBytes());

        //�ر���Դ
        fileOutputStream.close();

    }
}
