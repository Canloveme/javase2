package com.itheima.collections.collectiondemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Predicate;

/**
 * @ClassName : demo01
 * @Author : CSQ
 * @Date: 2020-07-28 10:35
 */
public class Demo01 {
    public static void main(String[] args) {
        Collection<String> strings = new ArrayList<>();
        //public boolean add(E e) 添加元素
        strings.add("aaa");
        strings.add("bbb");
        strings.add("ccc");
        strings.add("dddd");

        //boolean remove(Object o)  从集合中移除指定的元素
        //removeMethod(strings);

        //boolean removeif(Object o) 根据条件进行删除
        //removeIfMethod(strings);

        //void clear()  清空集合
        //clearMethod(strings);

        //boolean contains(Object o) 判断集合中是否存在指定元素
        //containsMethod(strings);

        //boolean isEmpty()  判断是否为空
        //isEmptyMethod(strings);

        //int size() 集合的长度，也就是集合中元素的个数
        //sizeMethod(strings);
    }

    private static void sizeMethod(Collection<String> strings) {
        //int size() 集合的长度，也就是集合中元素的个数
        int size = strings.size();
        System.out.println("size = " + size);
        System.out.println(strings);
        boolean aaa = strings.remove("aaa");
        System.out.println("size = "+strings.size());
        System.out.println(strings);
    }

    private static void isEmptyMethod(Collection<String> strings) {
        //boolean isEmpty()  判断是否为空
        boolean isEmpty = strings.isEmpty();
        System.out.println("isEmpty = " + isEmpty);
        System.out.println(strings);
        strings.clear();
        boolean empty = strings.isEmpty();
        System.out.println("empty = " + empty);
        System.out.println(strings);
    }

    private static void containsMethod(Collection<String> strings) {
        //boolean contains(Object o) 判断集合中是否存在指定元素
        boolean result = strings.contains("bbb");
        System.out.println("result = " + result);
        boolean ggg = strings.contains("ggg");
        System.out.println("ggg = " + ggg);
        System.out.println(strings);
    }

    private static void clearMethod(Collection<String> strings) {
        //void clear()  清空集合
        strings.clear();
        System.out.println(strings);
    }

    private static void removeIfMethod(Collection<String> strings) {
        //boolean removeif(Object o) 根据条件进行删除 传入一个filter
        boolean result = strings.removeIf(
                //删除长度为3的字符串
               /* (String s) -> {
                    return s.length() == 3;
                }*/
                new Predicate<String>() {
                    @Override
                    public boolean test(String s) {
                        return s.length() == 3;
                    }
                }
                );
        System.out.println("result = " + result);
        //只剩下dddd
        System.out.println(strings);
    }

    private static void removeMethod(Collection<String> strings) {
        //boolean remove(Object o)  从集合中移除指定的元素
        //Collection父类没有remove索引的方法，只能删除指定的元素
        boolean result = strings.remove("aaa");
        System.out.println("result = " + result);
        System.out.println(strings);
    }
}
