package cn.csq.homework;

import java.io.*;

/**
 * @author csq
 * @date 2020/8/3 18:36
 */
public class Ex02 {
    public static void main(String[] args) throws IOException {
        /**
         * ��ϰ��:�ֽ������д���ֽ���������
         * ����:�����ֽ������һ��дһ���ֽ�����ķ�ʽ��D�̵�
         * b.txt�ļ��������:"i love java"��
         */
        File file = new File("D:\\b.txt");
        OutputStream outputStream = new FileOutputStream(file);
        outputStream.write("i love java".getBytes());
        outputStream.close();
    }
}
