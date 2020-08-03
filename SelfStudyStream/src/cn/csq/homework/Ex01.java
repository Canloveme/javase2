package cn.csq.homework;

import java.util.*;
import java.util.stream.Stream;

/**
 * @author csq
 * @date 2020/8/1 16:01
 */
public class Ex01 {
    /**
     * 问题：
     * 简述单列集合： 集合的stream方法
     * 双列集合： 间接的获取
     * 数组：Stream的静态方法Stream方法
     * 分别如何获取Stream流对象，并进行演示
     */
    public static void main(String[] args) {
        //1.单列集合 集合的stream方法
        HashSet<String> hashSet = new HashSet<>(List.of("aaa", "ccc", "vvv", "ddd", "aaa"));
        Stream<String> stream = hashSet.stream();
        stream.forEach(e -> System.out.println(e));
        //2.双列集合  间接的获取
        HashMap<String, Integer> hashMap = new HashMap<String, Integer>(Map.ofEntries(Map.entry("张三", 20), Map.entry("李四", 22), Map.entry("王五", 24)));
        //所有键
        Stream<String> keyStream = hashMap.keySet().stream();
        keyStream.forEach(s -> System.out.println(s));
        //所有的value
        hashMap.entrySet().stream().forEach(s -> System.out.println(s));
        //3.数组
        int[] arr = {1, 2, 3, 4, 5};
        Arrays.stream(arr).forEach(i-> System.out.println(i));
    }
}
