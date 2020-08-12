package cn.csq.homework;

import java.util.concurrent.*;

/**
 * @author csq
 * @date 2020/8/7 19:33
 */
public class Ex04 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        /**
         * 请按以下步骤编写程序：
         * 定义一个线程类，实现Callable接口。此线程可以计算1--100的所有数字的累加和。
         * 定义测试类，和main()方法，使用线程池启动线程，并获取计算结果，并将结果打印到控制台。
         */

        ExecutorService threadPool = Executors.newFixedThreadPool(10);
        System.out.println(threadPool.submit(() -> {
            int sum = 0;
            for (int i = 0; i <= 100; i++) {
                sum += i;
            }
            return sum;
        }).get());
        threadPool.shutdown();
    }
}
