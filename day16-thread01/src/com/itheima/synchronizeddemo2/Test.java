package com.itheima.synchronizeddemo2;

/**
 * @author csq
 * @date 2020/8/6 21:10
 */
public class Test {
    public static void main(String[] args) {
        Thread thread1 = new Ticket();
        thread1.setName("1");
        thread1.start();
        Thread thread2 = new Ticket();
        thread2.setName("2");
        thread2.start();
        Thread thread3 = new Ticket();
        thread3.setName("3");
        thread3.start();

    }
}
