package cn.csq.stream.ex;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 * @author csq
 * @className StreamDemo05
 * @date 2020/7/30 23:10
 *
 * Stream流中的终结方法
 *
 * void forEach(Consumer action):对此流的每个元素执行操作
 *              Consumer接口中的方法      void  accept(T t):对给定的参数执行此操作
 * long count():返回此流中的元素树
 */
public class StreamDemo05 {
    public static void main(String[] args) {

        //  void forEach(Consumer action):对此流的每个元素执行操作
        //  Consumer接口中的方法      void  accept(T t):对给定的参数执行此操作
        //  long count():返回此流中的元素树

        ArrayList<String> strings = new ArrayList<>(List.of("aaa", "ggg", "ccc", "bbb"));

        //在forEach方法的底层会循环获取流中的每一个数据
        //并循环调用accept方法，并把每一个数据传递给accept方法
        //s就依次表示了流中的每一个数据，所以我们只要在accept方法中写上处理的业务逻辑就可以了
        strings.forEach(new Consumer<String>() {
            // s 表示每个对象
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        //strings.stream().forEach(s -> System.out.println(s));

        long count = strings.stream().count();
        System.out.println("count = " + count);

    }
}
