package cn.csq.stream.collect.ex;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author csq
 * @className StreamCollectDemo02
 * @date 2020/7/31 8:54
 */
public class StreamCollectDemo02 {

    /**
     * Stream流的收集方法
     * 创建一个ArrayList集合，并添加以下字符串，字符串中前面是姓名，后面是年龄
     *  “张三，23”
     *  “李四，24”
     * “王五，25”
     * 保留年龄大于等于24岁的人，并将结果收集到Map集合中，姓名为键，年龄为值
     * Collect Collector.toMap()
     * */
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(List.of("张三,23","李四,24","王五,25"));
        Map<String, Integer> map = list.stream().filter((String s) -> {
            //分割数组
            String[] strings = s.split(",");
            //得到年龄
            int age = Integer.parseInt(strings[1]);
            //判断条件
            return age >= 24;
            //collect 方法只能获取到流中剩余的每一个数据
            //在底层不能创建容器，也不能把数据添加到容器中

            //Collectors.toMap 创建一个map集合并将数据添加到集合中
            // s表示流中每一个数据

            //第一个lambda表达式就是如何获取map值键
            //第二个lambda表达式就是如何获取map值值
        }).collect(Collectors.toMap(
                //键 姓名
                 s -> s.split(",")[0],
                //值 年龄
                s -> Integer.parseInt(s.split(",")[1])
        ));
        System.out.println(map);
    }
}
