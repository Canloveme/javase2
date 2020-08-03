package cn.csq.homework.map;

import java.util.HashMap;
import java.util.Set;

/**
 * @author csq
 * @date 2020/7/31 20:11
 */
public class Ex01 {
    //请使用Map集合的方法完成添加元素，根据键删除，以及根据键获取值操作

    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("小红", 20);
        hashMap.put("小黑", 22);
        hashMap.put("小蓝", 24);
        Integer integer = hashMap.remove("小黑");
        System.out.println("integer = " + integer);

        Set<String> keySet = hashMap.keySet();
        for (String s : keySet) {
            System.out.println(s + " " + hashMap.get(s));
        }
    }
}
