package com.itheima.charstream;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/**
 * @author csq
 * @date 2020/8/3 17:59
 */
public class CharStreamDemo02 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        //字符流  =  字节 + 编码集

        //编码
        //byte[] getBytes()使用平台的默认字符集将该String编码为一系列字节，将结果存储到新的字节数组中
        //byte[] getBytes(String charsetName)使用指定的字符集将该String编码为一系列字节，将结果存储到新的字节数组中


        //解码
        //String(byte[] bytes)使用平台的默认字符集解码指定的字节数组来创建字符串String
        //String(byte[] bytes, String charsetName)通过指定的字符集解码指定的字节数组来创建字符串String


        //编码
        String s = "中国";
        //idea的编码-28, -72, -83, -27, -101, -67
        byte[] bytes1 = s.getBytes();
        System.out.println("bytes = " + Arrays.toString(bytes1));
        //指定编码
        byte[] bytes2 = s.getBytes(StandardCharsets.UTF_8);
        System.out.println("bytes1 = " + Arrays.toString(bytes2));


        byte[] bytes3 = {-42, -48, -71, -6};
        //idea默认解码
        String s1 = new String(bytes3);
        System.out.println("s1 = " + s1);
        byte[] bytes4 = {-28, -72, -83, -27, -101, -67};
        //指定格式解码
        String s2 = new String(bytes4, StandardCharsets.UTF_8);
        System.out.println("s2 = " + s2);


    }
}
