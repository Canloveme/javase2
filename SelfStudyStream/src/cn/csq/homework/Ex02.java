package cn.csq.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author csq
 * @date 2020/8/1 16:15
 */
public class Ex02 {
    /**
     * 过滤：filter、结果收集(数组)
     * 问题：
     * 有如下7个元素黄药师，
     * 冯蘅，郭靖，黄蓉，郭芙，郭襄，郭破虏，
     * 使用Stream将以郭字开头的元素存入新数组
     */
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(List.of("冯蘅", "郭靖", "黄蓉", "郭芙", "郭襄", "郭破虏"));
        Object[] stringList = list.stream().filter(s -> s.startsWith("郭")).collect(Collectors.toList()).toArray();
        System.out.println(Arrays.toString(stringList));
    }
}
