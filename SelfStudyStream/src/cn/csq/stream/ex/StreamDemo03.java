package cn.csq.stream.ex;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * @author csq
 * @className StreamDemo03
 * @date 2020/7/30 22:20
 *
 * filter()方法
 */
public class StreamDemo03 {
    public static void main(String[] args) {
        //Steam<T> filter(Predicate predicate):过滤
        //                Predicate接口中的方法  boolean test(T t):对给定的参数进行判断，返回一个布尔值
        ArrayList<String> strings = new ArrayList<>(List.of("张三丰", "张无忌", "张翠山", "王二麻子", "张良", "蔡徐坤"));

        //filter方法 获取流中的每一个数据，
        //而test方法中的 参数 s 表示的就是流中的每一个数据
        //我们只要在test方法中对s进行判断就可以了
        //如果判断的结果为true,则当前的数据留下 如果判断的结果为false,则当前的数据就不要。
        strings.stream().filter(
                new Predicate<String>() {
                    @Override
                    public boolean test(String s) {
                        boolean result = s.startsWith("张");
                        return result;
                    }
                }
        ).forEach(s-> System.out.println(s));

        //因为Predicate接口中只有一个抽象方法test，所有也可以使用Lambda表达式简化
        strings.stream().filter(s -> s.startsWith("张")).forEach(s -> System.out.println(s));

    }

}
