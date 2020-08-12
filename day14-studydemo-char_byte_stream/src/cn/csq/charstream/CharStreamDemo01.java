package cn.csq.charstream;

import java.io.*;

/**
 * @author csq
 * @date 2020/8/4 8:46
 */
public class CharStreamDemo01 {
    public static void main(String[] args) throws IOException {
        //使用数组进行传输
        OutputStream outputStream = new FileOutputStream("day14-studydemo-char_byte_stream/src/a.txt");
        outputStream.write("helloworld".getBytes());
        InputStream inputStream = new FileInputStream("day14-studydemo-char_byte_stream/src/a.txt");
        int len;
        byte[] bytes = new byte[1024];
        while ((len = inputStream.read(bytes)) != -1) {
            System.out.println(new String(bytes,0,len));
        }

    }
}
