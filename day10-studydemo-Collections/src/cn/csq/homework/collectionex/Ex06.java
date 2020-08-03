package cn.csq.homework.collectionex;

import java.util.ArrayList;

/**
 * @ClassName : Ex06
 * @Author : CSQ
 * @Date: 2020-07-28 18:42
 * Collection集合返回首次出现索引
 * 七、定义一个方法listTest(ArrayList<Integer> al, Integer s)，
 * 要求返回s在al里面第一次出现的索引，如果s没出现过返回-1。
 */
public class Ex06 {
    public static void main(String[] args) {
        ArrayList<Integer> Integers = new ArrayList<>();
        Integers.add(1);
        Integers.add(2);
        Integers.add(3);
        Integers.add(4);
        System.out.println(listTest(Integers,2));
        System.out.println(listTest(Integers, 9));
    }

    private static int listTest(ArrayList<Integer> al,Integer s) {
        //要求返回s在al里面第一次出现的索引，如果s没出现过返回-1。
        for (int i = 0; i < al.size(); i++) {
            if (al.get(i).equals(s)) {
                return i;
            }
        }
        return -1;
    }
}
