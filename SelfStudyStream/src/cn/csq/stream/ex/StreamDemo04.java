package cn.csq.stream.ex;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author csq
 * @className SteamDemo04
 * @date 2020/7/30 22:29
 * <p>
 * Stream流中的常见中间操作方法
 */
public class StreamDemo04 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>(List.of("aaa", "ccc", "ggg", "ddd"));

        //获取list的stream流
        Stream<String> stringStream = list.stream();
//      stringStream.forEach(e-> System.out.println(e));
        //Stream <T> limit(long maxSize):截取 指定参数个数的数据
        //Stream <T> limit(long maxSize):截取 指定参数个数的数据
        //stringStream.limit(2).forEach(s -> System.out.println(s));
        //aaa ccc 截取了两个出来 保留前面的

        //Stream <T> sKip(long n):跳过 指定参数个数的数据
        //Stream <T> sKip(long n):跳过 指定参数个数的数据
        stringStream.skip(3).forEach(s -> System.out.println(s));
        //跳过前面的保留后面的

        //static <T> Stream <T> concat(Stream a,Stream b):合并 a和b两个流为一个流
        //concatStreamMethod(stringStream);

        //Stream <T> distinct():去除流中重复的元素。依赖(hasCode方法和equals方法)
       //distinctStreamMethod();

    }

    private static void distinctStreamMethod() {
        //Stream <T> distinct():去除流中重复的元素。依赖(hasCode方法和equals方法)
        ArrayList<String> list3 = new ArrayList<>(List.of("aaa", "ccc", "ggg", "ddd", "aaa", "aaa"));
        list3.stream().distinct().forEach(s-> System.out.println(s));
    }

    private static void concatStreamMethod(Stream<String> stringStream) {
        //static <T> Stream <T> concat(Stream a,Stream b):合并 a和b两个流为一个流
        ArrayList<String> list2 = new ArrayList<>(List.of("aaa", "ccc", "ggg", "ddd"));
        Stream<String> stream2 = list2.stream();
        Stream.concat(stringStream, stream2).forEach(s-> System.out.println(s));
        //Stream.concat(list.stream(), list2.stream()).forEach(s-> System.out.println(s));
        //合并了两个流
    }

}
