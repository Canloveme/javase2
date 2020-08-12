package com.itheima.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @author csq
 * @date 2020/8/7 11:46
 */
public class MyTreadPoolDemo02 {
    public static void main(String[] args) {
        //创建线程池 参数为最大大小  固定数量的池 参数不是初始值而是最大值
        ExecutorService threadPool = Executors.newFixedThreadPool(10);
        ThreadPoolExecutor pool = (ThreadPoolExecutor) threadPool;
        System.out.println(pool.getPoolSize());

        threadPool.submit(() -> {
            for (int i = 0; i < 20; i++) {
                System.out.println(Thread.currentThread().getName() + " 执行了");
            }
        });
        System.out.println(pool.getPoolSize());
        threadPool.submit(() -> {
            for (int i = 0; i < 20; i++) {
                System.out.println(Thread.currentThread().getName() + " 执行了");
            }
        });
        System.out.println(pool.getPoolSize());

        /*for (int i = 0; i < 10; i++) {
            //池中没有可用线程，阻塞
           threadPool.submit(() -> {
                System.out.println(Thread.currentThread().getName() + "在执行了");
                        try {
                            Thread.sleep(100);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
            }

            );
        }*/
            System.out.println(pool.getPoolSize());

            pool.shutdown();
        }
    }