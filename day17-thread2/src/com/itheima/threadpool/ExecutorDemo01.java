package com.itheima.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author csq
 * @date 2020/8/7 11:33
 */
public class ExecutorDemo01 {
    public static void main(String[] args) throws InterruptedException {
        //1.创建线程池  这个cachedThreadPool 60秒不用自动销毁
        ExecutorService threadPool = Executors.newCachedThreadPool();

        //2.提交任务到池
        threadPool.submit(() -> System.out.println(Thread.currentThread().getName()+" 线程运行了"));

        //线程完成了，回到池中
        Thread.sleep(1000);
        //池中同一个线程运行 这个线程  不睡眠，两个任务，池中两个任务拿出两个线程
        threadPool.submit((() -> System.out.println(Thread.currentThread().getName()+" 线程运行啦")));

        threadPool.shutdown();
    }
}
