package cn.csq.homework.collectionex;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @ClassName : Ex04
 * @Author : CSQ
 * @Date: 2020-07-28 18:37
 * 练习五：Collection集合contains()方法使用
 * 五、定义一个方法listTest(ArrayList<String> al, String s),
 * 要求使用contains()方法判断al集合里面是否包含s。
 */
public class Ex04 {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("aaa");
        strings.add("bbb");
        strings.add("ccc");
        strings.add("ddd");
        System.out.println(listTest(strings, "aaa"));
        System.out.println(listTest(strings, "qqq"));
    }

    public static boolean listTest(ArrayList<String> al, String s) {
        return al.contains(s);
    }
}
