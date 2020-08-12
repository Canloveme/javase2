package com.itheima.threadmethoddemo.daemondemo;

/**
 * @author csq
 * @date 2020/8/6 14:54
 */
public class Test {
    public static void main(String[] args) {
        MyThread1 myThread1 = new MyThread1();
        MyThread2 myThread2 = new MyThread2();

        myThread1.setName("女神");
        myThread2.setName("备胎");

        //true 设置为备胎  守护线程
        myThread2.setDaemon(true);
        //被守护线程挂了，守护线程没有继续执行的必要了，会挣扎一下挂掉
        myThread1.start();
        myThread2.start();
    }
}
