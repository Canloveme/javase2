package com.itheima.threaddemo;

/**
 * @author csq
 * @date 2020/8/6 10:38
 */
public class MyThread02Test {
    public static void main(String[] args) {
        //3.创建子类对象
        MyThread02 myThread02 = new MyThread02();

        //4.创建线程对象，传入实现Runnable接口的实现类对象
        Thread thread1 = new Thread(myThread02);
        Thread thread2 = new Thread(myThread02);

        //5.start()启动线程
        thread1.start();
        thread2.start();
    }
}
