package com.itheima.output;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author csq
 * @date 2020/8/3 11:24
 */
public class FileOutPutStreamDemo03 {
    public static void main(String[] args) throws IOException {
        /**
         * 字节输出流如果实现换行
         *  window: \r\n
         *  unix : \n
         *  mac: \r
         * 字节流写数据如何实现追加写入
         * public FileOutPutStream(String name,boolean append)
         * 创建文件输出流以指定的名称写入文件。如果第二个参数为ture,不会清空文件里面的内容
         */
        //创建字节输出流
        FileOutputStream fileOutputStream = new FileOutputStream("day14-studydemo-char_byte_stream\\ccc.txt");

        //返回当前系统的换行符  一般使用这个
        String s = System.lineSeparator();
        System.out.println("a"+s+"b");

        fileOutputStream.write(97);
        fileOutputStream.write("\r\n".getBytes());
        fileOutputStream.write(99);
        fileOutputStream.write(s.getBytes());

        //FileOutputStream(File file, boolean append)
        // 创建文件输出流以写入由指定的 File对象表示的文件。
        /**
         * 创建文件输出流以写入由指定的File对象表示的文件。
         * 如果第二个参数为true ，则字节将写入文件的末尾而不是开头。
         * 将创建一个新的FileDescriptor对象来表示此文件连接。
         * 首先，如果有一个安全管理器，它的checkWrite方法被调用，由file参数表示的路径作为其参数。
         *
         * 如果文件存在但是是一个目录而不是常规文件，则不存在但不能创建，
         * 或者由于任何其他原因无法打开，因此抛出一个FileNotFoundException 。
         *
         * 参数
         * file - 要打开的文件进行写入。
         * append - 如果是 true ，则字节将写入文件的末尾而不是开头
         */
        FileOutputStream fileOutputStream1 = new FileOutputStream("day14-studydemo-char_byte_stream\\ccc.txt", true);
        fileOutputStream.write("新添加的数据".getBytes());

        fileOutputStream.close();
    }
}
