package cn.csq.stream.collect.ex;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author csq
 * @className StreamCollectDemo01
 * @date 2020/7/31 8:38
 */
public class StreamCollectDemo01 {
   /**
    * 使用Stream流操作完成，把流中的数据保留起来
    * Stream流的收集方法
    *      R collect(Collector collector)
    *
    * 工具类Collectors提供了具体的收集方式
    *   public static <T> Collector toList():把元素收集到List集合中
    *   public static <T> Collector toSet():把元素收集到Set集合中
    *   public static Collector toMap(Function KeyMapper,Function valueMapper): 把元素收集到Map集合中
    * */
    public static void main(String[] args) {
        //collectToListMethod();

        //collectToSetMethod();


    }

    private static void collectToSetMethod() {
        ArrayList<Integer> integers = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            integers.add(i);
        }
        System.out.println("====");
        integers.add(2);
        integers.add(2);
        integers.add(2);
        integers.stream().forEach(i-> System.out.print(i+" "));
        System.out.println();
        //得到set集合
        Set<Integer> set = integers.stream().filter(i -> i % 2 == 0).collect(Collectors.toSet());
        System.out.println(set);
    }

    private static void collectToListMethod() {
        ArrayList<Integer> integers = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            integers.add(i);
        }
        integers.stream().filter(i -> i % 2 == 0).forEach(s -> System.out.print(s + " "));
        System.out.println();
        System.out.println("========");
        //filter 过滤数据
        //collect 负责收集数据
        //获取收集流中剩余的数据，但是他不负责创建容器，也不负责把数据添加到容器中
        List<Integer> list = integers.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.println(list);
        //负责收集数据的方法是Collectors工具类的toList()方法
    }
}
