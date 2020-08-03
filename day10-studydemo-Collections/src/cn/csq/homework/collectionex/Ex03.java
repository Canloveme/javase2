package cn.csq.homework.collectionex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/**
 * @ClassName : Ex03
 * @Author : CSQ
 * @Date: 2020-07-28 18:32
 * 练习四：Collection集合集合转数组
 * 四、定义一个集合，并把集合(集合里面的元素是Integer)转成存有相同元素的数组，
 * 并将结果输出在控制台。（可以使用Object[]数组类型接收转换的数组）
 */
public class Ex03 {
    public static void main(String[] args) {
        Collection<Integer> integers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            integers.add(i);
        }
        System.out.println(Arrays.toString(integers.toArray()));

    }
}
