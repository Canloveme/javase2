package cn.csq.homework.collectionex;

import java.util.ArrayList;

/**
 * @ClassName : Ex05
 * @Author : CSQ
 * @Date: 2020-07-28 18:40
 *
 * 练习六：Collection集合isEmpty()方法的使用
 * 六、定义一个方法listTest(ArrayList<String> al),
 * 要求使用isEmpty()判断al里面是否有元素。
 */
public class Ex05 {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("aaa");
        strings.add("bbb");
        strings.add("ccc");
        strings.add("ddd");
        System.out.println(listTest(strings));
        strings.clear();
        System.out.println(listTest(strings));
    }

    private static boolean listTest(ArrayList<String> al) {
        return al.isEmpty();
    }
}
