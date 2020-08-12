package com.itheima.threadmethoddemo.daemondemo;

/**
 * @author csq
 * @date 2020/8/6 14:53
 */
public class MyThread1 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(this.getName() + " "+i);
        }
    }
}
