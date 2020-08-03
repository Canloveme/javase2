package cn.csq.filedemo;

import java.io.File;
import java.io.IOException;

/**
 * @author csq
 * @date 2020/8/1 10:56
 */
public class FileDemo04 {
    public static void main(String[] args) throws IOException {
        //public boolean creatNewFile()   创建一个新的空的文件
        //creatNewFileMethod();

        //public boolean mkdir() 创建一个单级文件夹
        //mkdirCreatMethod();

        //public boolean mkdirs() 创建一个多级文件夹
        mkdirsMethod();
    }

    private static void mkdirsMethod() {
        //public boolean mkdirs() 创建一个多级文件夹
        //可以创建单级文件夹，也可以创建多级文件夹
        //不管调用者有没有后缀名，只能创建文件夹
        File file = new File("D:\\javaio\\test\\mkdir1\\mkdir2\\mkdir3");
        boolean mkdirs = file.mkdirs();
        System.out.println("mkdirs = " + mkdirs);
    }

    private static void mkdirCreatMethod() {
        //public boolean mkdir() 创建一个单级文件夹
        //只能创建单级文件夹，不能创建多级文件夹
        //不管调用者有没有后缀名，只能创建单级文件夹
        File file1 = new File("D:\\javaio\\mkdir1");
        boolean mkdir = file1.mkdir();
        //返回文件夹是否创建完成，创建true
        System.out.println("mkdir = " + mkdir);
        boolean mkdir1 = file1.mkdir();
        //文件夹已经存在，返回false
        System.out.println("mkdir1 = " + mkdir1);
        //只能创建一个单级文件夹
        File mkdirFile = new File("D:\\javaio\\mkdir1\\mkdir2\\mkdir3");
        boolean mkdir2 = mkdirFile.mkdir();
        System.out.println(mkdirFile+" "+ mkdir2);
    }

    private static void creatNewFileMethod() throws IOException {
        //public boolean creatNewFile()   创建一个新的空的文件
        //如果文件已经存在，那么创建失败，返回false
        //如果文件不存在，那么创建成功，返回true
        //createNewFile()不管文件是否有后缀名,只负责创建对应的文件
        File file = new File("D:\\javaio\\a.txt");
        boolean result = file.createNewFile();
        System.out.println("result = " + result);
        boolean newFile = file.createNewFile();
        System.out.println("newFile = " + newFile);
        //createNewFile()不管文件是否有后缀名,只负责创建对应的文件
        File aaaFile = new File("D:\\javaio\\aaa");
        System.out.println("aaaFile = " + aaaFile);
    }
}
