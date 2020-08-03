package cn.csq.homework.collectionex;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @ClassName : Ex02
 * @Author : CSQ
 * @Date: 2020-07-28 18:24
 *
 * 练习三：Collection集合数组转集合
 * 三、定义一个方法，要求此方法把int数组转成存有相同元素的集合(集合里面的元素是Integer)，并返回。
 */
public class Ex02 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Collection<Integer> integers = toListMethod(arr);
        for (Integer integer : integers) {
            System.out.println(integer);
        }
    }

    private static Collection<Integer> toListMethod(int[] arr) {
        Collection<Integer> integers = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++) {
            integers.add(arr[i]);
        }
        return integers;
    }
}
