package com.itheima.charstream;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @author csq
 * @date 2020/8/3 19:57
 */
public class CharStreamDemo06 {
    public static void main(String[] args)throws IOException {
        /**
         * flush()方法和close()方法
         * close(): 1.先刷新流,再关闭 , 关闭后流不能再使用
         * flush(): 刷新流 ,流还可以继续使用
         */
        FileWriter fileWriter = new FileWriter("day14-classdemo-char_byte_stream\\a.txt",true);
        fileWriter.write("嘿嘿嘿");
        fileWriter.flush();
        fileWriter.write("哈哈哈");
        fileWriter.close();
//        fileWriter.write("啧啧啧");

    }
}
