package cn.csq.stream.ex;

import java.util.ArrayList;
import java.util.List;

/**
 * @author csq
 * @className StreamDemo06
 * @date 2020/7/31 8:28
 */
public class StreamDemo06 {

    /**
     * Stream流的收集方法
     * 练习：定义一个集合，并添加一些整数1,2,3,4,5,6,7,8,9,10
     * 将集合中的奇数删除，只保留偶数
     * 遍历集合得到2,4,6,8，10
     */
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        integers.stream().filter(i -> Integer.valueOf(i) % 2 == 0).forEach(i -> System.out.print(i+" "));
        System.out.println();
        System.out.println("=====");
        //stream流无法直接修改集合，数组中的数据源中的数据，只能根据需求得到数据
        integers.stream().forEach(i -> System.out.print(i+" "));
    }

}
