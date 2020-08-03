package cn.csq.args;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author csq
 * @className 00
 * @date 2020/7/30 21:20
 */
public class ArgsTest02 {
    public static void main(String[] args) {

        //static <E> List<E> of(E..element) 创建一个具有指定元素的List集合对象
        //static <E> Set<E> of(E..element) 创建一个具有指定元素的Set集合对象
        //static <K,V> Map<K,v> of(E..element) 创建一个具有指定元素的Map集合对象

        //List<String> strings = List.of("a", "b", "c");
        //不可变的集合
        // strings.set(0, "d");
        //不能修改

        //集合的批量添加
        //首先是通过List.of方法来创建一个不可变的集合，of方法的形参就是一个可变参数
        //ListMethod();

        //SetMethod();

       //MapMethod();
        //在List、Set、Map接口中，都存在of方法，可以创建一个不可变的集合
        //这个集合不能添加、不能删除、不能修改
        //但是可以结合集合的带参构造、实现集合的批量添加
        //在Map接口中，还有一个ofEntries方法可以提高代码的阅读性
        //首先会把键值对封装成一个Entry对象，再把这个Entry对象添加到集合中
        // k,v -> entry   ->map
        Map<String, String> stringStringMap = Map.ofEntries(Map.entry("张三", "北京"),
                Map.entry("李四", "上海"),
                Map.entry("王五", "深圳"));
        System.out.println(stringStringMap);
    }

    private static void mapMethod() {
        Map<String, String> stringMap = Map.of("张三", "北京", "李四", "上海", "王五", "深圳");
        System.out.println(stringMap);
    }

    private static void setMethod() {
        //传递的参数当中不能存在重复的元素
        Set<String> stringSet = Set.of("a", "b", "c");
        Set<String> stringSet2 = Set.of("a", "b", "c", "c");
    }

    private static void listMethod() {
        //再创建一个ArrayList集合，并把这个不可变的集合中所有的数据，都添加到ArrayList中。
        List<String> a = new ArrayList<>(List.of("a", "c", "b", "d"));
        System.out.println(a);
        a.set(2, "aaaa");
        System.out.println(a);
    }


}
