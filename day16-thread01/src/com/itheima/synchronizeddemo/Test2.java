package com.itheima.synchronizeddemo;

/**
 * @author csq
 * @date 2020/8/6 16:37
 */
public class Test2 {
    public static void main(String[] args) {
        Ticket2 thread1 = new Ticket2();
        Ticket2 thread2 = new Ticket2();
        thread1.setName("窗口一");

        thread1.start();
        thread2.setName("窗口二");
        thread2.start();
    }
}
