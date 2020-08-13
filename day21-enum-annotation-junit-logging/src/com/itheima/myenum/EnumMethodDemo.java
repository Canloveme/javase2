package com.itheima.myenum;

import java.util.Arrays;

/**
 * @author csq
 * @className EnumMethodDemo
 * @date 2020/8/13 9:25
 */
public class EnumMethodDemo {
    public static void main(String[] args) {
        //String name()获取枚举项的名称
        // int ordinal()返回枚举项在枚举类中的索引值
        // int compareTo(E  o)比较两个枚举项，返回的是索引值的差值
        // String toString()返回枚举常量的名称
        // static <T> T  valueOf(Class<T> type,String  name)获取指定枚举类中的指定名称的枚举值
        // values()获得所有的枚举项
        String  summer = Season.SUMMER.name;
        System.out.println("summer = " + summer);
        int ordinal = Season.SPRING.ordinal();
        System.out.println("ordinal = " + ordinal);
        int i = Season.SUMMER.compareTo(Season.WINTER);
        System.out.println("i = " + i);
        String s = Season.SUMMER.toString();
        System.out.println("s = " + s);
        Season spring = Season.valueOf(Season.class, "SPRING");
        System.out.println("spring = " + spring);
        Season[] values = Season.values();
        System.out.println(Arrays.toString(values));
    }
}
