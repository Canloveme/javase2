package com.iteheima.list;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName : ListDemo01
 * @Author : CSQ
 * @Date: 2020-07-28 15:38
 */
public class ListDemo01 {
    public static void main(String[] args) {
        //有序  可重复  有索引
        List<String> list = new ArrayList<>();
        list.add("曹操");
        list.add("赵子龙");
        list.add("张飞");
        list.add("张飞");
        list.add("诸葛亮");

        for (String s : list) {
            System.out.println(s);
        }
    }
}
