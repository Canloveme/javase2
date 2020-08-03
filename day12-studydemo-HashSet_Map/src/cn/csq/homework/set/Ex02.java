package cn.csq.homework.set;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/**
 * @author csq
 * @date 2020/7/31 21:29
 */
public class Ex02 {
    public static void main(String[] args) {
        /**
         * 三、使用LinkedHashSet存储以下元素：
         * "王昭君","王昭君","西施","杨玉环","貂蝉"。
         * 使用迭代器和增强for循环遍历LinkedHashSet。
         */
        LinkedHashSet<String> set = new LinkedHashSet<>(List.of("王昭君", "王昭君", "西施", "杨玉环", "貂蝉"));
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("====");
        for (String s : set) {
            System.out.println(s);
        }
    }
}
