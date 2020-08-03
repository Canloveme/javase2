package cn.csq.filedemo;

import java.io.File;
import java.io.IOException;

/**
 * @author csq
 * @date 2020/8/3 9:16
 */
public class FileDemo08 {
    public static void main(String[] args) throws IOException {
        File file = new File("SelfStudyIo\\a.txt");
        System.out.println(file.getName());
        System.out.println(file.getAbsoluteFile());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getCanonicalPath());
        System.out.println(file.length());
    }
}
