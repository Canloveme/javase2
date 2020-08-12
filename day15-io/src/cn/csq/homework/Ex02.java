package cn.csq.homework;

import java.io.*;

/**
 * @author csq
 * @date 2020/8/4 18:44
 */
public class Ex02 {
    public static void main(String[] args)throws IOException {
        /**
         * 2. 写4个方法,分别用普通字节流,高效字节流,一次复制一个字节,
         * 一次复制一个字节数组复制同一个视频文件做测试.
         */
        File srcFile = new File("day15-io\\b.txt");
        File copyFile1 = new File("day15-io\\b_copy1.txt");
        File copyFile2 = new File("day15-io\\b_copy2.txt");
        File copyFile3 = new File("day15-io\\b_copy3.txt");
        File copyFile4 = new File("day15-io\\b_copy4.txt");
        copy1Method(srcFile, copyFile1);
        copy2Method(srcFile, copyFile2);
        copy3Method(srcFile, copyFile3);
        copy4Method(srcFile, copyFile4);


    }

    private static void copy1Method(File srcFile, File copyFile) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(srcFile);
        FileOutputStream fileOutputStream = new FileOutputStream(copyFile);
        int a;
        while ((a = fileInputStream.read()) != -1) {
            fileOutputStream.write(a);
        }
        fileInputStream.close();
        fileOutputStream.close();
    }

    private static void copy2Method(File srcFile, File copyFile) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(srcFile);
        FileOutputStream fileOutputStream = new FileOutputStream(copyFile);
        byte[] bytes=new byte[1024];
        int len;
        while ((len = fileInputStream.read(bytes)) != -1) {
            fileOutputStream.write(bytes,0,len);
        }
        fileInputStream.close();
        fileOutputStream.close();
    }

    private static void copy3Method(File srcFile, File copyFile) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(srcFile);
        FileOutputStream fileOutputStream = new FileOutputStream(copyFile);
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
        int a;
        while ((a = bufferedInputStream.read()) != -1) {
            bufferedOutputStream.write(a);
        }
        bufferedInputStream.close();
        bufferedOutputStream.close();
    }

    private static void copy4Method(File srcFile, File copyFile) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(srcFile);
        FileOutputStream fileOutputStream = new FileOutputStream(copyFile);
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
        byte[] bytes=new byte[1024];
        int len;
        while ((len = bufferedInputStream.read(bytes)) != -1) {
            bufferedOutputStream.write(bytes,0,len);
        }
        bufferedInputStream.close();
        bufferedOutputStream.close();
    }
}
