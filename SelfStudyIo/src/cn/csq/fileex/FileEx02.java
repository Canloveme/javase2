package cn.csq.fileex;

import java.io.File;

/**
 * @author csq
 * @date 2020/8/1 14:26
 */
public class FileEx02 {
    public static void main(String[] args) {
        /**
         * 练习二：删除一个多级文件夹
         * delete方法
         * 只能删除文件和空文件夹
         * 如果现在要删除一个有内容的文件夹？
         * 先删除这个文件夹里面所有的内容
         * 最后再删除这个文件夹
         */
        File file = new File("D:\\javaio\\test");
        File[] files = file.listFiles();
        if (files != null) {
            System.out.println(files.length);
            for (File f : files) {
                System.out.println(f);
            }
        }
        deleteDir(file);
        System.out.println("====");
        File[] files2 = file.listFiles();
        if (files2 != null) {
            System.out.println(files2.length);
            for (File f : files2) {
                System.out.println(f);
            }
        }
    }

    public static void deleteDir(File dir) {
        //先删除这个文件夹里面的所有内容
        //递归 方法在方法体里面自己调用自己
        //注意：可以解决所有文件夹和递归相关结合的题目
        //1.进入文件夹  ---  得到文件夹里面所有内容的file对象
        File[] files = dir.listFiles();
        //2.遍历  --- 得到文件夹下的每一个文件和文件夹的File对象
        for (File file: files) {
            //3.判断 如果是文件直接删除
            if (file.isFile()) {
                file.delete();
            }else {
                //4.判断 递归删除
                //如果不是文件，则递归 参数为文件夹里面的file对象
                deleteDir(file);
            }
        }
        //5.最后删除这个文件夹
        dir.delete();
    }
}
