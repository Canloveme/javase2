package com.iteheima.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @ClassName : ListDemo02
 * @Author : CSQ
 * @Date: 2020-07-28 15:47
 */
public class ListDemo02 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

        for (String s : list) {
            System.out.println(s);
        }
        //void add(int index,E element)  在此集合中的指定位置插入指定的元素
        //addMethod(list);

        //E remove(int index)  删除指定索引位置的元素，返回被删除的元素
        //removeMethod(list);

        //E set(int index,E element)   修改指定索引处的元素，返回被修改的元素
        //setMethod(list);

        //E get(int index) 返回指定索引处的元素
        //getMethod(list);

    }

    private static void getMethod(List<String> list) {
        //E get(int index) 返回指定索引处的元素
        String result = list.get(2);
        System.out.println("result = " + result);
        //java.lang.IndexOutOfBoundsException 越界错误
        String s = list.get(5);
        System.out.println("s = " + s);
        //使用该方法配合循环遍历集合
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    private static void setMethod(List<String> list) {
        //E set(int index,E element)   修改指定索引处的元素，返回被修改的元素
        String result = list.set(1, "ddd");
        System.out.println("result = " + result);
        System.out.println(Arrays.toString(list.toArray()));
    }

    private static void removeMethod(List<String> list) {
        //E remove(int index)  删除指定索引位置的元素，返回被删除的元素
        //list中的方法 remove(int index)
        String s = list.remove(0);
        System.out.println("s = " + s);
        System.out.println(Arrays.toString(list.toArray()));
        //collection中的remove方法  remove(Object o)
        boolean b = list.remove("bbb");
        System.out.println("b = " + b);
        System.out.println(Arrays.toString(list.toArray()));
    }

    private static void addMethod(List<String> list) {
        //void add(int index,E element)  在此集合中的指定位置插入指定的元素
        list.add(0, "qqq");
        System.out.println(Arrays.toString(list.toArray()));
    }
}
