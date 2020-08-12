package com.itheima.synchronizeddemo2;

/**
 * @author csq
 * @date 2020/8/6 21:16
 */
public class Test2 {
    public static void main(String[] args) {
        Ticket2 ticket2 = new Ticket2();
        Thread thread = new Thread(ticket2);
        thread.setName("1");
        thread.start();

        Thread thread2 = new Thread(ticket2);
        thread2.setName("2");
        thread2.start();

        Thread thread3 = new Thread(ticket2);
        thread3.setName("3");
        thread3.start();
    }
}
