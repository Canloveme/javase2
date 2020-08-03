package cn.csq.homework;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author csq
 * @date 2020/8/1 16:26
 */
public class Ex05 {
    public static void main(String[] args) {
        /**
         * 练习七：组合：concat、结果收集(list)
         * 问题：
         * 已知数组arr1中有如下元素{郭靖，杨康}
         * ，arr2中有如下元素{黄蓉，穆念慈}，使用Stream将二者合并到List集合
         */
        String [] arr1 ={"郭靖", "杨康"};
        String [] arr2 ={"黄蓉", "穆念慈"};
        List<String> list = Stream.concat(Arrays.stream(arr1), Arrays.stream(arr2)).collect(Collectors.toList());
        list.forEach(System.out::println);
    }
}
