package com.itheima.test;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;

/**
 * @author csq
 * @date 2020/8/3 15:27
 */
public class Test {
    public static void main(String[] args) throws UnsupportedEncodingException {
        byte[] bytes = {1, 2, 3, 4};
        String s = new String(bytes, StandardCharsets.UTF_8);
        System.out.println(s);
    }
}
