package com.itheima.charstream;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/**
 * @author csq
 * @date 2020/8/3 18:20
 */
public class CharSteamDemo03 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String s = "程山清";
        System.out.println(Arrays.toString(s.getBytes()));
        System.out.println(Arrays.toString(s.getBytes(StandardCharsets.UTF_8)));
    }
}
