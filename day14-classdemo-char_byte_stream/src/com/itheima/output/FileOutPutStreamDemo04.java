package com.itheima.output;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author csq
 * @date 2020/8/3 11:41
 */
public class FileOutPutStreamDemo04 {
    public static void main(String[] args) {
        //无论是否出现错误都释放资源

        FileOutputStream fileOutputStream = null;
        //创建字节输出流
        try {
            //如果第一行出现错误，fileOutputStream会是null，不被赋值，就不能close()关闭
            //System.out.println(2 / 0);
            fileOutputStream = new FileOutputStream("day14-studydemo-char_byte_stream\\ccc.txt");
            fileOutputStream.write(99);
            //System.exit(0);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //局部遍历，只在try有效
            //fileOutputStream.close();
            //finally语句里面的代码，有无出现异常一定会执行，除非系统退出关闭jvm
            System.out.println("finally");
            /*try {
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }*/
            //不能直接对fileOutputStream直接进行close()方法释放资源 try catch
            //因为不知道fileOutputStream是否为空，在赋值时出现错误fileOutputStream对象会为空，因此不能为空
            //所以先要对资源对象进行判断是否为空，如果不为空才释放资源，并对其try,catch
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
