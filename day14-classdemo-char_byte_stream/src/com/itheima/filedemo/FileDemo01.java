package com.itheima.filedemo;

import java.io.File;
import java.io.IOException;

/**
 * @author csq
 * @date 2020/8/3 9:27
 */
public class FileDemo01 {
    public static void main(String[] args) throws IOException {
        /**
         * 删除带内容的文件夹
         */
        //创建文件
        //creatFileMethod();

        //删除文件夹
        deleteDir(new File("day14-studydemo-char_byte_stream\\aaa"));
    }

    //删除带内容的文件夹
    public static void deleteDir(File dir) {
        //1.遍历文件夹
        File[] files = dir.listFiles();

        if (files!=null) {
            //2.删除子文件
            for (File file : files) {
                //3.如果是文件，就删除
                if (file.isFile()) {
                    file.delete();
                }
                //4.如果是文件夹
                else {
                    deleteDir(file);
                }
            }
        }
        //5.删除文件夹
        dir.delete();
    }


    private static void creatFileMethod() throws IOException {
        //创建文件
        File file = new File("day14-studydemo-char_byte_stream\\aaa", "a.txt");
        if (!file.getParentFile().exists()) {
            file.getParentFile().mkdir();
        }
        if (!file.exists()){
            file.createNewFile();
        }
    }
}
