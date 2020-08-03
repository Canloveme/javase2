package com.itheima.filedemo;

import java.io.File;

/**
 * @author csq
 * @date 2020/8/3 9:41
 */
public class FileDemo02 {
    public static void main(String[] args) {
        /**
         * 遍历打印整个文件夹
         */

        File file = new File("C:\\");
        printDir(file);
    }

    //打印文件夹内容名称
    public static void printDir(File dir) {

        File[] files = dir.listFiles();
        if (files!=null) {
            for (File file : files) {
                if (file.isFile()) {
                    System.out.println(file.getAbsoluteFile());
                } else {
                    printDir(file);
                }
            }
        }
        System.out.println(dir.getName());
    }
}
