package cn.csq.homework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Stream;

/**
 * @author csq
 * @date 2020/8/1 16:28
 */
public class Ex06 {
    public static void main(String[] args) {
        /**
         * 获取并发流
         * 问题：
         * 请分别写出获取并发流的两种方式。
         */
        Collection<String> coll = new ArrayList<>();
        Stream<String> parallelStream1 = coll.parallelStream();
        Stream<Integer> parallelStream2 = Stream.of(100, 200, 300, 400).parallel();
    }
}
