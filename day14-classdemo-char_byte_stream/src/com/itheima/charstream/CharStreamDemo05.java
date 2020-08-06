package com.itheima.charstream;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @author csq
 * @date 2020/8/3 18:25
 */
public class CharStreamDemo05 {
    public static void main(String[] args) throws IOException {
         //字符流 写出数据
        //Writer: 用于写入字符流的抽象父类
        //FileWriter: 用于写入字符流的常用子类

        // FileWriter(File file)根据给定的 File对象构造一个 FileWriter 对象
        // FileWriter(File file, boolean append)根据给定的File 对象构造一个 FileWriter 对象
        // FileWriter(String fileName)根据给定的文件名构造一个 FileWriter对象
        // FileWriter(String fileName, boolean append)根据给定的文件名以及
        // 指示是否附加写入数据的boolean值来构造FileWriter对象

        //void  write(int c)写一个字符
        // void write(char[] cbuf)写入一个字符数组
        // void write(char[] cbuf, int off, int len)写入字符数组的一部分
        // void write(String str)写一个字符串
        // void write(String str, int off, int len)写一个字符串的一部分

        //创建字符输出流对象
                //如果文件不存在，就创建，但要保证父路径存在
                //如果文件存在就清空 或添加append参数 true追加
        //写数据
                //注意事项：写出int类型的整数，实际写出的是整数在码表上对应的字母
                //写出字符串数据，是把字符串本身原样写出
        //释放资源
                //注意事项，每次使用完流必须释放资源

        FileWriter fileWriter = new FileWriter("day14-classdemo-char_byte_stream\\write.txt");
        fileWriter.write(97);
        fileWriter.write("\n");
        fileWriter.write(98);
        fileWriter.write("\n");
        fileWriter.write(new char[]{97, 98, 99, 100});
        fileWriter.write("\n");
        fileWriter.write(new char[]{97, 98, 99, 100}, 0, 2);

        fileWriter.write("\n");
        fileWriter.write("哈哈哈哈写入一个字符串");
        fileWriter.write("\n");
        fileWriter.write("哈哈哈哈写入一个字符串", 2, 3);

        fileWriter.close();
    }
}
