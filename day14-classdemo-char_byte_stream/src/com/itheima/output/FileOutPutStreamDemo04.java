package com.itheima.output;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author csq
 * @date 2020/8/3 11:41
 */
public class FileOutPutStreamDemo04 {
    public static void main(String[] args) {
        //�����Ƿ���ִ����ͷ���Դ

        FileOutputStream fileOutputStream = null;
        //�����ֽ������
        try {
            //�����һ�г��ִ���fileOutputStream����null��������ֵ���Ͳ���close()�ر�
            //System.out.println(2 / 0);
            fileOutputStream = new FileOutputStream("day14-studydemo-char_byte_stream\\ccc.txt");
            fileOutputStream.write(99);
            //System.exit(0);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //�ֲ�������ֻ��try��Ч
            //fileOutputStream.close();
            //finally�������Ĵ��룬���޳����쳣һ����ִ�У�����ϵͳ�˳��ر�jvm
            System.out.println("finally");
            /*try {
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }*/
            //����ֱ�Ӷ�fileOutputStreamֱ�ӽ���close()�����ͷ���Դ try catch
            //��Ϊ��֪��fileOutputStream�Ƿ�Ϊ�գ��ڸ�ֵʱ���ִ���fileOutputStream�����Ϊ�գ���˲���Ϊ��
            //������Ҫ����Դ��������ж��Ƿ�Ϊ�գ������Ϊ�ղ��ͷ���Դ��������try,catch
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }
}
