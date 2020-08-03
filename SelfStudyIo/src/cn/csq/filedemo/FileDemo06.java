package cn.csq.filedemo;

import java.io.File;

/**
 * @author csq
 * @date 2020/8/1 11:37
 */
public class FileDemo06 {
    public static void main(String[] args) {

        //public boolean isDirectory()  测试此抽象路径名表示的File是否为目录
        //public boolean isFile()  测试此抽象路径名表示的File是否为文件
        //public boolean exists()  测试此抽象路径名表示的File是否存在
        //public String getName()  返回由此抽象路径名表示的文件或者目录的名称

        //文件夹
        File file1 = new File("D:\\javaio\\test");
        //文件
        File file2 = new File("D:\\javaio\\test\\a.txt");
        //isDirectory()
        boolean file1Directory = file1.isDirectory();
        boolean file2Directory = file2.isDirectory();
        System.out.println("file1Directory = " + file1Directory);
        System.out.println("file2Directory = " + file2Directory);

        //isFile()
        boolean file1File = file1.isFile();
        System.out.println("file1File = " + file1File);
        boolean file2File = file2.isFile();
        System.out.println("file2File = " + file2File);

        //exists
        boolean file1exists = file1.exists();
        System.out.println("file1exists = " + file1exists);
        boolean file2exists = file2.exists();
        System.out.println("file2exists = " + file2exists);

        //getName() 文件获取文件名+后缀名   文件夹获取文件夹名
        String file1Name = file1.getName();
        System.out.println("file1Name = " + file1Name);

        String file2Name = file2.getName();
        System.out.println("file2Name = " + file2Name);


    }
}
