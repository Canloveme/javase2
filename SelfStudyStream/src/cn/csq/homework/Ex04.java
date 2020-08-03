package cn.csq.homework;

import java.util.HashSet;
import java.util.List;

/**
 * @author csq
 * @date 2020/8/1 16:21
 */
public class Ex04 {
    public static void main(String[] args) {
        /**
         * 映射：map、逐一消费：forEach
         * 问题：
         * 有如下整数1，-2，-3，4，-5
         * 使用Stream取元素绝对值并打印
         */
        HashSet<Integer> integers = new HashSet<>(List.of(1, -2, -3, 4, -5));
        integers.forEach(e-> System.out.println(Math.abs(e)));
    }
}
