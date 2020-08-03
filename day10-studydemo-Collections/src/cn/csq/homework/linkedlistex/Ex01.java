package cn.csq.homework.linkedlistex;
import java.util.Arrays;
import java.util.LinkedList;

/**
 * @ClassName : Ex01
 * @Author : CSQ
 * @Date: 2020-07-28 18:56
 * 三、根据要求练习LinkedList方法：
 * （1）基本方法：add, set, get, remove, clear, size等方法；
 * （2）特有方法：addFirst, addLast, getFirst, getLast,
 * removeFirst,removeLast, push, pop, clear等方法。
 */
public class Ex01 {
    public static void main(String[] args) {
        LinkedList<String> strings = new LinkedList<>();
       /* add(strings);
        set(strings);
        get(strings);
        removeSize(strings);*/
    }

    private static void removeSize(LinkedList<String> strings) {
        strings.remove(1);
        System.out.println(Arrays.toString(strings.toArray()));
        System.out.println(strings.size());
        strings.clear();
        System.out.println(Arrays.toString(strings.toArray()));
        System.out.println(strings.size());
    }

    private static void get(LinkedList<String> strings) {
        System.out.println(Arrays.toString(strings.toArray()));
        System.out.println(strings.get(2));
    }

    private static void set(LinkedList<String> strings) {
        String s = strings.set(2, "ddd");
        System.out.println(Arrays.toString(strings.toArray()));
    }

    private static void add(LinkedList<String> strings) {
        strings.add("aaa");
        strings.add("bbb");
        strings.add("ccc");
        System.out.println(Arrays.toString(strings.toArray()));
    }

    public static void addFirst(LinkedList<String> strings) {
        strings.addFirst("000");
        System.out.println(Arrays.toString(strings.toArray()));
    }

    public static void addLast(LinkedList<String> strings) {
        strings.addLast("xxx");
        System.out.println(Arrays.toString(strings.toArray()));
    }

    public static void getFirst(LinkedList<String> strings) {
        System.out.println(Arrays.toString(strings.toArray()));
        System.out.println(strings.getFirst());
    }

    public static void getLast(LinkedList<String> strings) {
        System.out.println(Arrays.toString(strings.toArray()));
        System.out.println(strings.getLast());
    }

    public static void removeFirst(LinkedList<String> strings) {
        System.out.println(Arrays.toString(strings.toArray()));
        System.out.println(strings.removeFirst());
        System.out.println(Arrays.toString(strings.toArray()));
    }

    public static void removeLast(LinkedList<String> strings) {
        System.out.println(Arrays.toString(strings.toArray()));
        System.out.println(strings.removeLast());
        System.out.println(Arrays.toString(strings.toArray()));
    }

    public static void push(LinkedList<String> strings) {
        System.out.println(Arrays.toString(strings.toArray()));
        strings.push("哈哈哈");
        strings.push("嘿嘿嘿");
        strings.push("噢噢噢");
        System.out.println(Arrays.toString(strings.toArray()));
    }

    public static void pop(LinkedList<String> strings) {
        System.out.println(Arrays.toString(strings.toArray()));
        strings.pop();
        strings.pop();
        strings.pop();
        System.out.println(Arrays.toString(strings.toArray()));
    }

    public static void clear(LinkedList<String> strings) {
        System.out.println(Arrays.toString(strings.toArray()));
        strings.clear();
        System.out.println(Arrays.toString(strings.toArray()));

    }
}
