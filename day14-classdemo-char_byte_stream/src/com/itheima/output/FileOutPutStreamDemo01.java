package com.itheima.output;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author csq
 * @date 2020/8/3 10:29
 *
 * fileOutPutStream
 * 文件输出流是用于将数据写入File或FileDescriptor的输出流。
 * 文件是否可用或可能被创建取决于底层平台。
 * 特别是某些平台允许一次只能打开一个文件来写入一个FileOutputStream （或其他文件写入对象）。
 * 在这种情况下，如果所涉及的文件已经打开，则此类中的构造函数将失败。
 * FileOutputStream用于写入诸如图像数据的原始字节流。要编写字符流，请考虑使用FileWriter 。
 */
public class FileOutPutStreamDemo01 {
    public static void main(String[] args) throws IOException {

        //创建文件
        File file = new File("day14-studydemo-char_byte_stream\\a.txt");
        if (file.exists()) {
            file.createNewFile();
        }

        //1.根据文件file创建文件字节输出流
        FileOutputStream fileOutputStream = new FileOutputStream(file);

        //1.创建字节输出流--->>>告诉jvm我要往哪个文件中写入数据
        //注意：如果文件不存在，会创建文件，但是如果文件的父文件夹都不存在则报错 FileNotFoundException
        //FileOutputStream fileOutputStream = new FileOutputStream("D:\\javaio\\不存在的文件.txt");


        //如果文件已经存在，且有内容  文件会从头覆盖
        //FileOutputStream fileOutputStream = new FileOutputStream(file);


        //不能传入一个文件夹，文件夹怎么写入数据
        //Exception in thread "main" java.io.FileNotFoundException: D:\javaio (拒绝访问。)
        //at java.base/java.io.FileOutputStream.open0(Native Method)
        //FileOutputStream fileOutputStream = new FileOutputStream("D:\\javaio");

        //2.写数据
        fileOutputStream.write(98);
        //public abstract void write(int b)
        //                    throws IOException将指定的字节写入此输出流。
        //                    write的一般合同是将一个字节写入输出流。
        //                    要写入的字节是参数b的八个低位。 忽略了b的24个高位。
        // 一个int [8位][8位][8位][低位8位字节byte] 写入最右边的8个低位byte 忽略左边24位
        fileOutputStream.write(99);

        System.out.println(fileOutputStream.getFD());

        //3.释放资源
        fileOutputStream.close();
    }
}
