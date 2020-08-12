package com.itheima.charstream;

import java.io.FileReader;
import java.io.IOException;

/**
 * @author csq
 * @date 2020/8/4 9:21
 */
public class CharStreamDemo01 {
    public static void main(String[] args) throws IOException {
        //Reader FileReader
        //FileWriter fileWriter = new FileWriter("day15-io\\a.txt");
        //fileWriter.write("HelloWorld,哈哈哈");
        FileReader fileReader = new FileReader("day15-io\\a.txt");
        int ch;
        while ((ch = fileReader.read()) != -1) {
            System.out.print((char) ch);
        }
        fileReader.close();
        //fileWriter.close();
    }
}
