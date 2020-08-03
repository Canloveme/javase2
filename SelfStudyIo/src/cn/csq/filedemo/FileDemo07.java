package cn.csq.filedemo;

import java.io.File;
import java.util.Arrays;

/**
 * @author csq
 * @date 2020/8/1 11:48
 */
public class FileDemo07 {
    public static void main(String[] args) {

        //public File[] listFiles()
        //返回此抽象路径名表示的目录中的文件和目录的File对象数组

     /*   File file = new File("D:\\javaio");
        File[] files = file.listFiles();
        for (File file1 : files) {
            System.out.println(file1);
        }*/
        //进入文件夹，获取这个文件夹里面所有的文件和文件夹的File对象，
        //并把这些File对象都放在一个数组中返回
        //包括隐藏文件和隐藏文件夹都可以获取

        //注意：
        //当调用者不存在时，返回null
        //当调用者是一个文件时  返回是一个null  文件只能读写，不能得到文件列表
        //file1();
        //当调用者是一个空文件夹时，返回一个长度为0的数组
        //file2();
        //当调用者是一个有内容的文件夹时  进入这个文件夹 获取这个文件夹所有文件
        //将里面所有文件和文件夹的路径放在File数组中返回

        //当调用者是一个有隐藏文件的文件夹时
        //将里面所有文件和文件夹的路径放在File数组中返回，包含隐藏内容
        //file3();
        //当调用者是一个有权限才能进入的文件夹时 返回null

    }

    private static void file3() {
        //当调用者是一个有内容的文件夹时  进入这个文件夹 获取这个文件夹所有文件
        File file4 = new File("D:\\javaio\\test");
        File[] files4 = file4.listFiles();
        System.out.println(file4.length());
        for (File f : files4) {
            System.out.println(f);
        }
    }

    private static void file2() {
        //当调用者是一个空文件夹时
        File file3 = new File("D:\\javaio\\mkdir1");
        File[] listFiles = file3.listFiles();
        System.out.println(listFiles.length);
        for (File listFile : listFiles) {
            System.out.println(listFile);
        }
    }

    private static void file1() {
        //当调用者是一个文件时  返回是一个null  文件只能读写
        File file2 = new File("D:\\javaio\\a.txt");
        System.out.println("file2 = " + file2);
        File[] files1 = file2.listFiles();
        System.out.println(Arrays.toString(files1));
    }
}
