package cn.csq.homework;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * @author csq
 * @date 2020/8/3 18:34
 */
public class Ex01 {
    public static void main(String[] args) throws IOException {
        /**
         * ��ϰһ:�ֽ������д���ֽ�����
         * ����:�����ֽ������һ��дһ���ֽڵķ�ʽ����D�̵�a.txt�ļ�����ַ���a����
         */
        File file = new File("D:\\a.txt");
        OutputStream outputStream = new FileOutputStream(file);
        outputStream.write('a');
        outputStream.close();
    }
}
