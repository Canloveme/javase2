package cn.csq.homework;

import java.io.*;

/**
 * @author csq
 * @date 2020/8/3 18:44
 */
public class Ex06 {
    public static void main(String[] args) throws IOException {
        File file = new File("E:\\a.png");
        InputStream inputStream = new FileInputStream(file);
        OutputStream outputStream = new FileOutputStream("D:\\a.png");
        int len;
        while ((len = inputStream.read()) != -1) {
            outputStream.write(len);
        }

        inputStream.close();
        outputStream.close();
    }
}
