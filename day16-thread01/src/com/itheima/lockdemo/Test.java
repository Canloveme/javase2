package com.itheima.lockdemo;

/**
 * @author csq
 * @date 2020/8/6 21:29
 */
public class Test {
    public static void main(String[] args) {
        Ticket ticket = new Ticket();
        Thread thread = new Thread(ticket);
        thread.setName("1");
        thread.start();
        Thread thread2 = new Thread(ticket);
        thread2.setName("2");
        thread2.start();
        Thread thread3 = new Thread(ticket);
        thread3.setName("3");
        thread3.start();
    }
}
