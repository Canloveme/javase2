package cn.csq.homework.linkedlistex;

import javax.print.DocFlavor;
import java.util.Arrays;
import java.util.LinkedList;

/**
 * @ClassName : Ex02
 * @Author : CSQ
 * @Date: 2020-07-28 19:24
 * List集合元素替换
 * 四、向list集合添加姓名{张三,李四,王五,二丫,钱六,孙七},
 * 将二丫替换为王小丫。
 */
public class Ex02 {
    public static void main(String[] args) {
        LinkedList<String> strings = new LinkedList<>();
        strings.add("张三");
        strings.add("李四");
        strings.add("王五");
        strings.add("二丫");
        strings.add("钱六");
        strings.add("孙七");
        for (int i = 0; i < strings.size(); i++) {
            if ("二丫".equals(strings.get(i))) {
                strings.set(i, "王小丫");
            }
        }

        System.out.println(Arrays.toString(strings.toArray()));
    }
}
