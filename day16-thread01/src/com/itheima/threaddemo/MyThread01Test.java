package com.itheima.threaddemo;

/**
 * @author csq
 * @date 2020/8/6 10:13
 */
public class MyThread01Test {
    public static void main(String[] args) {
        //3.创建子类对象
        MyThread01 thread1 = new MyThread01();

        //4.开启线程 启动线程，调用run方法
        thread1.start();
        //只能start一次，不能start两次
        //普通方法调用，不是启动线程
        thread1.run();



        //开启第二个线程
        MyThread01 thread2 = new MyThread01();
        thread2.start();

        MyThread01 thread3 = new MyThread01("大娃");
        thread3.start();
    }
}
