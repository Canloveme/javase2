package cn.csq.filedemo;

import java.io.File;

/**
 * @author csq
 * @date 2020/8/1 10:14
 */
public class FileDemo02 {
    public static void main(String[] args) {
        //file:是文件和目录路径名的抽象表示
        //文件和目录可以通过file封装成对象
        //file封装的对象仅仅是一个路径名。它是可以存在的，也是可以不存在的

        //File(String pathname)  通过将给定的路径名字的字符串转化为抽象路径名
        //来创建新的file实例   字符串 ---->> 抽象路径名----->file实例
        newMethod1();

        //File(String parent,String child)从父路径名称字符串和子路径名称字符串创建新的File实例
        newMethod2();

        //File(File parent,String child)从父抽象路径名和子路径名称字符串创建新的File实例
        newMethod3();


    }

    private static void newMethod3() {
        File parent = new File("D:\\javaio\\test");
        String child = "io.txt";
        File file2 = new File(parent,child);
    }

    private static void newMethod2() {
        String parent = "D:\\javaio\\test";
        String child = "io.txt";
        File file1 = new File(parent,child);
    }

    private static void newMethod1() {
        //File(String pathname)  通过将给定的路径名字的字符串转化为抽象路径名
        //来创建新的file实例   字符串 ---->> 抽象路径名----->file实例
        String path = "D:\\javaio";
        File file = new File(path);
    }
}
