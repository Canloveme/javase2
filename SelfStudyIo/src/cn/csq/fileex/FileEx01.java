package cn.csq.fileex;

import java.io.File;
import java.io.IOException;

/**
 * @author csq
 * @date 2020/8/1 14:14
 */
public class FileEx01 {
    public static void main(String[] args) throws IOException {
        /**
         * file练习
         * 在当前模板下的aaa文件夹中创建一个a.txt
         * 文件创建时，文件所在的文件夹必须要存在。
         */
        File selfStudyIo = new File("SelfStudyIo", "aaa");
        //如果文件夹不存在，就创建出来
        if (!selfStudyIo.exists()) {
            selfStudyIo.mkdir();
        }
        File file = new File(selfStudyIo, "a.txt");
        if (!file.exists()) {
                file.createNewFile();
        }

    }
}
