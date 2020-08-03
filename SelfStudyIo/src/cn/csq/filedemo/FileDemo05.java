package cn.csq.filedemo;

import java.io.File;

/**
 * @author csq
 * @date 2020/8/1 11:24
 */
public class FileDemo05 {
    public static void main(String[] args) {
        //public boolean delete()   删除由此抽象路径名表示的文件或者目录
        //public boolean delete()   删除由此抽象路径名表示的文件或者目录
        //删除不走回收站的
        //如果删除的是文件，那么直接删除，如果删除的是文件夹，那么能删除空的没有内容的文件夹
        //如果删除的是一个有内容的文件夹，只能先进入到这个文件夹中，把里面的内容全部删除完毕，
        //才能再次删除这个文件

        //简单的说：只能删除文件和空的文件夹
        File file = new File("D:\\javaio\\test\\io.txt");
        boolean result = file.delete();
        System.out.println("result = " + result);
        File file1 = new File("D:\\javaio\\test\\mkdir1\\mkdir2\\mkdir3");
        boolean result2 = file1.delete();
        System.out.println("delete = " + result2);
        //删除多级目录 不可以
        File file2 = new File("D:\\javaio\\test\\mkdir1");
        boolean result3 = file2.delete();
        System.out.println("delete = " + result3);
    }
}
