package cn.csq.homework;

import java.util.ArrayList;
import java.util.List;

/**
 * @author csq
 * @date 2020/8/1 16:17
 */
public class Ex03 {
    public static void main(String[] args) {
        /**
         * 练习五：取用前几个：limit、跳过前几个：skip
         * 问题：
         * 已知ArrayList集合中有如下元素
         * {陈玄风、梅超风、陆乘风、曲灵风、武眠风、冯默风、罗玉风}，
         * 使用Stream
         * 1、取出前2个元素并在控制台打印输出。
         * 2、取出后2个元素并在控制台打印输出。
         */
        ArrayList<String> list = new ArrayList<>(List.of("陈玄风", "梅超风", "陆乘风", "曲灵风", "武眠风", "冯默风", "罗玉风"));
        list.stream().limit(2).forEach(System.out::println);
        System.out.println("====");
        list.stream().skip(list.size()-2).forEach(System.out::println);
    }
}
