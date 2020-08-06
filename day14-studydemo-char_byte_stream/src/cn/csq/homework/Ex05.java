package cn.csq.homework;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author csq
 * @date 2020/8/3 18:44
 */
public class Ex05 {
    public static void main(String[] args) throws IOException {
        //练习五:字节输入流一次读取一个字节数组数据
        //描述:利用字节输入流读取D盘文件b.txt的内容，文件内容确定都为纯ASCII字符
        //使用循环读取，一次读取一个字节数组，直到读取到文件末尾，将读取到的字节数组转换成字符串输出到控制台。

        File file = new File("D:\\b.txt");
        FileInputStream fileInputStream = new FileInputStream(file);
        int len;
        byte[] bytes = new byte[1024];
        while ((len = fileInputStream.read(bytes))!= -1) {
            System.out.println(new String(bytes, 0, len));
        }
        fileInputStream.close();
    }



}
