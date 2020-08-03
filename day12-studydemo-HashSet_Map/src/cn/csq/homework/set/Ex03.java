package cn.csq.homework.set;

import java.util.LinkedHashSet;
import java.util.Scanner;

/**
 * @author csq
 * @date 2020/7/31 21:31
 */
public class Ex03 {
    /**
     * 四、键盘录入一个字符串，去掉其中重复字符，
     * 打印出不同的那些字符，必须保证顺序。
     * 例如输入：aaaabbbcccddd，打印结果为：abcd。
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入一个字符串");
        String s = scanner.nextLine();
        char[] chars = s.toCharArray();
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        for (int i = 0; i < chars.length; i++) {
            set.add(chars[i]);
        }
        System.out.println(set.toString());
    }
}
