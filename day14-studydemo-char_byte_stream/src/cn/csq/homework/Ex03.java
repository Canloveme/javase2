package cn.csq.homework;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author csq
 * @date 2020/8/3 18:39
 */
public class Ex03 {
    public static void main(String[] args) throws IOException {
        /**
         * ��ϰ��:�ļ�����д�ͻ������
         * ����:��D���£���һc.txt �ļ�������Ϊ��HelloWorld
         * ��c.txt�ļ�ԭ���ݻ����ϣ������� I love java��
         * ����Ҫʵ��һ��һ�в���(ע��ԭ�Ĳ��ɸ���)��
         * �����ֽ������������C����c.txt�ļ����5�䣺��i love java��
         */
        File file = new File("D:\\c.txt");
        FileOutputStream fileOutputStream = new FileOutputStream(file, true);
        fileOutputStream.write("HelloWorld".getBytes());
        for (int i = 0; i < 5; i++) {
            fileOutputStream.write(System.lineSeparator().getBytes());
            fileOutputStream.write("I love java".getBytes());
        }
    }
}
