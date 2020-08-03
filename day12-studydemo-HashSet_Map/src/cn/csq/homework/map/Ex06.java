package cn.csq.homework.map;

import java.util.ArrayList;
import java.util.HashMap;


/**
 * @author csq
 * @date 2020/7/31 20:51
 */
public class Ex06 {
    public static void main(String[] args) {
        /**
         * 八、定义一个泛型为String类型的List集合，
         * 统计该集合中每个字符（注意，不是字符串）出现的次数。
         * 例如：集合中有”abc”、”bcd”两个元素，
         * 程序最终输出结果为：“a = 1,b = 2,c = 2,d = 1”。
         */
        ArrayList<String> list = new ArrayList<>();
        list.add("abd");
        list.add("cdd");
        list.add("abc");
        HashMap<Character, Integer> map = new HashMap<>();
        for (String s : list) {
            getNumberMethod(map, s);
        }
        map.forEach((Character c, Integer i) -> System.out.println(c + "=" + i));

    }

    private static void getNumberMethod( HashMap<Character,Integer> map,String s) {
        char[] chars = s.toCharArray();
        for (char aChar : chars) {
            if (map.containsKey(aChar)) {
                int num = map.get(aChar);
                map.put(aChar, num + 1);
            } else {
                map.put(aChar, 1);
            }
        }
    }
}
