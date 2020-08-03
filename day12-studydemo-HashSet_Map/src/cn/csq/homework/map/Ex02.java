package cn.csq.homework.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/**
 * @author csq
 * @date 2020/7/31 20:14
 */
public class Ex02 {

    public static void main(String[] args) {
        /**
         * 四、往一个Map集合中添加若干元素。获取Map中的所有value，
         * 并使用增强for和迭代器遍历输出每个value。
         * //tips: 参阅Map接口中values()方法
         */
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("小红", 20);
        hashMap.put("小黑", 22);
        hashMap.put("小蓝", 24);
        for (Integer value : hashMap.values()) {
            System.out.println(value);
        }
        Collection<Integer> values = hashMap.values();
        Iterator<Integer> iterator = values.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        hashMap.forEach((String s, Integer i) -> System.out.println(s + " " + i));

    }
}
