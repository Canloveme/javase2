package com.itheima.myhashmap;

import java.util.HashMap;

/**
 * @author csq
 * @className Mapdemo01
 * @date 2020/7/31 16:33
 */
public class Mapdemo01 {
    public static void main(String[] args) {

        HashMap<String, Integer> hashMap = new HashMap<>();
        //v put(K key,V value) 添加元素 /替换元素
        Integer integer = hashMap.put("小红", 20);
        //put的返回值是 被替换的value
        System.out.println("integer = " + integer);
        Integer put = hashMap.put("小红", 24);
        System.out.println("put = " + put);
        hashMap.put("小黑", 23);
        //v remove(Object key) 根据键删除键值对元素
        Integer remove = hashMap.remove("小红");
        System.out.println("remove = " + remove);
        //返回值为移除的键值对的值value

        //void clear()  移除所有的键值对的元素
        //boolean containsKey(Object key) 判断集合是否包含指定的键
        //boolean containValue(Object value) 判断集合是否包含指定的值
        //boolean isEmpty()  判断集合是否为空
        //int size()   集合的长度，也就是集合中键值对的个数
        System.out.println(hashMap.size());
        System.out.println(hashMap);
    }
}
