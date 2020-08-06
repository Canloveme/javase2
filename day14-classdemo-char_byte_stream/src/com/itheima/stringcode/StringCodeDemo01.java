package com.itheima.stringcode;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/**
 * @author csq
 * @date 2020/8/3 16:30
 */
public class StringCodeDemo01 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        //byte[] getBytes()使用平台的默认字符集将该 String编码为一系列字节
        //byte[] getBytes(String charsetName)使用指定的字符集将该 String编码为一系列字节
        //String(byte[] bytes)使用平台的默认字符集解码指定的字节数组来创建字符串
        //String(byte[] bytes, String charsetName)通过指定的字符集解码指定的字节数组来创建字符串

        //定义一个字符串
        String s = "中国";
        byte[] bys = s.getBytes();
        //[-28, -72, -83, -27, -101, -67]

        //byte[] bys = s.getBytes("UTF-8");
        //[-28, -72, -83, -27, -101, -67]

        //byte[] bys = s.getBytes("GBK");
        //[63, -89, -37, 63]
        System.out.println(Arrays.toString(bys));


        //String ss = new String(bys);
        //String ss = new String(bys,"UTF-8");
        String ss = new String(bys, StandardCharsets.UTF_8);
        System.out.println(ss);
    }
}
