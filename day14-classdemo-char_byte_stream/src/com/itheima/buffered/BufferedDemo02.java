package com.itheima.buffered;

import java.io.*;

/**
 * @author csq
 * @date 2020/8/3 16:19
 */
public class BufferedDemo02 {
    public static void main(String[] args) throws IOException {

        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream("day14-studydemo-char_byte_stream/copy_static2.png"));
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream("day14-studydemo-char_byte_stream/copy_buffer_static4.png"));
        byte[] bytes = new byte[1024];
        int len;
        while ((len = bufferedInputStream.read(bytes)) != -1) {
            bufferedOutputStream.write(bytes, 0, len);
        }
        bufferedInputStream.close();;
        bufferedOutputStream.close();

    }
}
