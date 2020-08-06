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
         * 练习一:字节输出流写出字节数据
         * 描述:利用字节输出流一次写一个字节的方式，向D盘的a.txt文件输出字符‘a’。
         */
        File file = new File("D:\\a.txt");
        OutputStream outputStream = new FileOutputStream(file);
        outputStream.write('a');
        outputStream.close();
    }
}
