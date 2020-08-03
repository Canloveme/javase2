package cn.csq.stream.ex;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author csq
 * @className StreamDemo02
 * @date 2020/7/30 21:55
 *
 * 获取Stream流
 * 中间方法
 * 终极方法
 *
 * Stream流的获取
 * 单列对象：集合对象.stream();
 * 双列对象：间隔获取
 *          集合对象.keySet().stream; 集合对象.entrySet().stream;  得到单个set然后stream
 * 数组：Arrays.stream(数组名);
 * 同种数据类型：stream.of(数据1,数据2,数据3)
 */
public class StreamDemo02 {

    public static void main(String[] args) {
        //Stream流的使用场景
        //单列集合  双列集合  数组  同种数据类型的多个数据

        //单列集合 可以使用Collection接口中的默认方法stream()生成流
        //default  Stream<E> stream()

        //双列集合 间接的获取Stream流 可以通过KeySet或者entrySet获取一个Set集合，再获取Stream流

        //数组 可以使用数组的工具类Arrays的静态方法stream生成流

        //同种数据类型的多个数据 1，2，3，4，5，..... ； "aaa","bbb","ccc",....
        //                  使用Stream.of(T...values)生成流

        //单列集合
        //listStreamMethod();

        //双列集合
        //mapStreamMethod();

        //数组
        //arrStreamMethod();

        //同种数据类型的多个数据
        //同种数据类型的多个数据
        //使用stream流的of方法
        Stream<String> stream = Stream.of("aaa", "vvv", "ggg", "ssss");
        stream.forEach(s -> System.out.println(s));


    }

    private static void arrStreamMethod() {
        //数组
        int[] arr = new int[]{1, 2, 3, 4, 5};
        //数组使用Arrays工具类的静态方法stream方法得到stream流
        IntStream stream = Arrays.stream(arr);
        stream.forEach(s -> System.out.println(s));
    }

    private static void mapStreamMethod() {
        //双列集合
        HashMap<String, String> hashMap = new HashMap<>(Map.ofEntries(Map.entry("张三", "北京"),
                Map.entry("李四", "深圳"),
                Map.entry("王五", "上海")));
        //双列集合不能直接获取Stream流
        //KeySet
        //先获取到所有的键
        //再把这个Set集合中所有的键放到Stream流中
        Set<String> keySet = hashMap.keySet();
        keySet.stream().forEach(s -> System.out.println(s));
        //keySet.forEach(System.out::println);

        //entrySet
        //先获取到所有的键值对对象
        //再把这个Set集合中所有键值对对象放到Stream流中
        Set<Map.Entry<String, String>> entrySet = hashMap.entrySet();
        entrySet.stream().forEach(s -> System.out.println(s));
    }

    private static void listStreamMethod() {
        //单列集合
        ArrayList<String> strings = new ArrayList<>(List.of("aaa", "ccc", "bbb", "ddddd"));
        //直接通过对象.stream()方法，ArrayList是Collection接口下List接口下的一个实现类，使用.stream()方法获取stream流
        Stream<String> stream = strings.stream();
        stream.forEach(s -> System.out.println(s));
    }
}
