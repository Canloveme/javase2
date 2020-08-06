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
        //练习四:字节输入流一次读取一个字节数据
        //描述:利用字节输入流读取D盘文件a.txt的内容，文件内容确定都为纯ASCII字符
        //使用循环读取，一次读取一个字节，直到读取到文件末尾。将读取的字节输出到控制台

        File file = new File("D:\\a.txt");
        FileInputStream fileInputStream = new FileInputStream(file);
        int a;
        while ((a = fileInputStream.read() )!= -1) {
            System.out.print(a+" ");
        }
    }
}
