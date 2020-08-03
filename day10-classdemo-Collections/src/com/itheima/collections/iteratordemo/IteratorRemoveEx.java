package com.itheima.collections.iteratordemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @ClassName : IteratorRemoveEx
 * @Author : CSQ
 * @Date: 2020-07-28 11:33
 * 遍历一个集合，如果其中元素为“b“,将其删除
 */
public class IteratorRemoveEx {
    public static void main(String[] args) {
        //removeMethod();
        ArrayList<String> strings = new ArrayList<>();
        strings.add("a");
        strings.add("b");
        strings.add("b");
        strings.add("c");
        strings.add("b");
        strings.add("d");

        //forrMethod(strings);

        //foiiRemoveMethod(strings);

        //concurrentModificationExceptionMethod(strings);


    }

    private static void concurrentModificationExceptionMethod(ArrayList<String> strings) {
        //迭代器删除
        Iterator<String> iterator = strings.iterator();
        while (iterator.hasNext()) {
            String s = iterator.next();
            //java.util.ConcurrentModificationException
            //异常 并发修改异常
            //原因？ 通过迭代器Iterator遍历集合，遍历过程中，直接通过集合修改(添加/修改)
            //迭代器再遍历，又被集合进行修改，不能同时并发操作。
            //解决：迭代器遍历时，使用迭代器进行修改；不使用迭代器遍历。
            if ("b".equals(s)) {
                strings.remove(s);
            }
        }
        for (String string : strings) {
            System.out.println(string);
        }
    }

    private static void foiiRemoveMethod(ArrayList<String> strings) {
        // 解决方法二：倒序遍历删除，因为倒序遍历时，删除那个元素，空出空间，不会向前缩减，元素不会向前移动
        for (int i = strings.size() - 1; i >= 0; i--) {
            if ("b".equals(strings.get(i))) {
                strings.remove(i);
                //根据索引删除
            }
        }
        for (String string : strings) {
            System.out.println(string);
        }
    }

    private static void forrMethod(ArrayList<String> strings) {
        //使用ArrayList的遍历删除
        //forRemoveMethod(strings);

        //迭代器删除
        Iterator<String> iterator = strings.iterator();
        while (iterator.hasNext()) {
            String s = iterator.next();
            if ("b".equals(s)) {
                iterator.remove();
            }
        }
        for (String string : strings) {
            System.out.println(string);
        }
    }

    private static void forRemoveMethod(ArrayList<String> strings) {
        for (int i = 0; i < strings.size(); i++) {
            String s = strings.get(i);
            if ("b".equals(s)) {
                //删除等于"b"元素的对应索引
                strings.remove(i);
                //i--; 如果删除了元素，将索引减1，集合后面元素向前移动一个位置，判断的索引也对应向前移动一个位置
                //这样就不会漏掉一个元素了，因为元素移动的而漏掉的元素
            }
        }
        for (String string : strings) {
            System.out.println(string);
        }
        //不能删除所有的"b"，相邻元素的b没有被删除，删除掉一个元素时，根据ArrayList的特点
        //会将这个空间移除，后面的元素会向前移动一个位置，所以下一个会被跳过,索引是一直向前的就漏过了这个元素
    }

    private static void removeMethod() {
        Collection<String> strings = new ArrayList<>();
        strings.add("a");
        strings.add("b");
        strings.add("b");
        strings.add("c");
        strings.add("b");
        strings.add("d");
        Iterator<String> iterator = strings.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().equals("b")) {
                iterator.remove();
            }
        }
        for (String string : strings) {
            System.out.println(string);
        }
    }
}
