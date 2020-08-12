package com.itheima.threaddemo;

/**
 * @author csq
 * @date 2020/8/6 10:37
 */
//1.创建一个类实现Runable接口
public class MyThread02 implements Runnable {

    //2.重写run方法
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}
