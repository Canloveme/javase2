package cn.csq.stream.ex;

import java.util.ArrayList;
import java.util.List;

/**
 * @author csq
 * @className StreamDemo01
 * @date 2020/7/30 21:40
 *
 * 创建一个集合，存储多个字符串元素
 * "张三丰","张无忌","张翠山","王二麻子","张良"，”蔡徐坤“
 *
 * 将"张"开头长度为3的的存储到一个集合中
 *
 */
public class StreamDemo01 {
    public static void main(String[] args) {
        //method1();
        ArrayList<String> strings = new ArrayList<>(List.of("张三丰", "张无忌", "王二麻子", "张良","蔡徐坤"));
        strings.stream()
                .filter(s -> s.startsWith("张"))
                .filter(s -> s.length() == 3)
                .forEach(s-> System.out.println(s));

    }

    private static void method1() {
        ArrayList<String> strings = new ArrayList<>(List.of("张三丰", "张无忌", "王二麻子", "张良","蔡徐坤"));
        for (String string : strings) {
            System.out.print(string+" ");
        }
        ArrayList<String> strings1 = new ArrayList<>();
        for (String string : strings) {
            if (string.startsWith("张")) {
                strings1.add(string);
            }
        }
        System.out.println();
        System.out.println("====");
        System.out.println();
        for (String s : strings1) {
            System.out.print(s+" ");
        }
        System.out.println();
        System.out.println("=======");
        ArrayList<String> strings2 = new ArrayList<>();
        for (String s : strings1) {
            if (s.length() == 3) {
                strings2.add(s);
            }
        }

        for (String s : strings2) {
            System.out.print(s+" ");
        }
    }
}
