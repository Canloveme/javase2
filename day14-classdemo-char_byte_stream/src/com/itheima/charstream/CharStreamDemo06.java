package com.itheima.charstream;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @author csq
 * @date 2020/8/3 19:57
 */
public class CharStreamDemo06 {
    public static void main(String[] args)throws IOException {
        /**
         * flush()������close()����
         * close(): 1.��ˢ����,�ٹر� , �رպ���������ʹ��
         * flush(): ˢ���� ,�������Լ���ʹ��
         */
        FileWriter fileWriter = new FileWriter("day14-classdemo-char_byte_stream\\a.txt",true);
        fileWriter.write("�ٺٺ�");
        fileWriter.flush();
        fileWriter.write("������");
        fileWriter.close();
//        fileWriter.write("������");

    }
}
