package com.itheima.collections.foreachdemo;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @ClassName : ForeachDemo02
 * @Author : CSQ
 * @Date: 2020-07-28 14:41
 */
public class ForeachDemo02 {

    public static void main(String[] args) {
        //foreach 修改元素

        Collection<String> strings = new ArrayList<>();
        strings.add("aaa");
        strings.add("bbb");
        strings.add("ccc");
        strings.add("eee");

        for (String string : strings) {
            string = "qqq";
            System.out.println(string);
        }
        for (String string : strings) {
            System.out.println(string);
        }
        //string只是一个临时变量，第三方变量，用于打印集合元素
        //修改第三方集合的值不会影响原来集合的值
        //修改string 毫无意义

       /* for (int i = 0; i < strings.size(); i++) {
            String string = strings.get(i);
            //collection 是没有get索引方法的
            System.out.println(string);
        }*/
    }
}
