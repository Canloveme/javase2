package cn.csq.filedemo;

import java.io.File;

/**
 * @author csq
 * @date 2020/8/1 10:29
 */
public class FileDemo03 {
    public static void main(String[] args) {
        /**
         * 绝对路径和相对路径
         * 绝对路径：从盘符开始
         *          File file1 = new File("D:\\javaio\\test\\io.txt");
         * 相对路径：相对当前项目下的路径
         *          File file2 = new File("a.txt");
         *          File file3 = new File("模块名\\a.txt");
         */

        //这个路径固定不变了
        File file1 = new File("D:\\javaio\\test\\io.txt");
        //当前项目下的a.txt
        File file2 = new File("a.txt");
        File file3 = new File("SelfStudyIo\\a.txt");
    }
}
