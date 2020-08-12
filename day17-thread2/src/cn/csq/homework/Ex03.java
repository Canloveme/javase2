package cn.csq.homework;

import java.util.concurrent.ConcurrentHashMap;

/**
 * @author csq
 * @date 2020/8/7 19:07
 */
public class Ex03 {
    public static void main(String[] args) {
        /**
         * 请使用ConcurrentHashMap定义一个线程安全的Map，使用两个线程访问它：
         * 	第一个线程：向集合中添加键、值都是：1--10000的数字；
         * 	第二个线程：向集合中添加键、值都是：10001--20000的数字；
         * 	确保两个线程全部操作集合完毕，然后打印集合的每个元素，测试期准确性。
         */
        ConcurrentHashMap<Integer, Integer> hashMap = new ConcurrentHashMap<>();
        new Thread(()->{
            for (int i = 0; i <= 10000; i++) {
                hashMap.put(i, i);
            }
        }).start();
        new Thread(()->{
            for (int i = 10001; i <= 20000; i++) {
                hashMap.put(i, i);
            }
        }).start();
        System.out.println(hashMap);
        for (Integer i : hashMap.keySet()) {
            if (!i.equals(hashMap.get(i))) {
                System.out.println("出错了");
            }
        }
    }
}
