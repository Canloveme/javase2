package cn.csq.homework.collectionex;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @ClassName : Ex08
 * @Author : CSQ
 * @Date: 2020-07-28 18:52
 * 练习十：Collection集合练习
 * 九、产生10个1-100的随机数，并放到一个数组中，
 * 把数组中大于等于10的数字放到一个list集合中，并打印到控制台。
 */
public class Ex08 {
    public static void main(String[] args) {
        int[] ints = new int[10];
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            ints[i] = random.nextInt(100) + 1;
        }
        List<Integer> integers = new ArrayList<>();
        for (int anInt : ints) {
            if (anInt >= 10) {
                integers.add(anInt);
            }
        }

        for (Integer integer : integers) {
            System.out.println(integer);
        }

    }
}
