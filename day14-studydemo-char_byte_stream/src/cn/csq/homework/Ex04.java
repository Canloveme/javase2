package cn.csq.homework;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author csq
 * @date 2020/8/3 18:44
 */
public class Ex04 {
    public static void main(String[] args) throws IOException {
        //��ϰ��:�ֽ�������һ�ζ�ȡһ���ֽ�����
        //����:�����ֽ���������ȡD���ļ�a.txt�����ݣ��ļ�����ȷ����Ϊ��ASCII�ַ�
        //ʹ��ѭ����ȡ��һ�ζ�ȡһ���ֽڣ�ֱ����ȡ���ļ�ĩβ������ȡ���ֽ����������̨

        File file = new File("D:\\a.txt");
        FileInputStream fileInputStream = new FileInputStream(file);
        int a;
        while ((a = fileInputStream.read() )!= -1) {
            System.out.print(a+" ");
        }
    }
}
