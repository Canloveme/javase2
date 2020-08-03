package com.itheima.filedemo;

import java.io.File;
import java.io.IOException;

/**
 * @author csq
 * @date 2020/8/3 10:03
 */
public class FileDemo03 {
    public static void main(String[] args) throws IOException {
        //file

        File file = new File("day14-studydemo-char_byte_stream\\a.txt");
        if (file.exists()) {
            file.createNewFile();
        }
        long l = file.lastModified();

    }
}
