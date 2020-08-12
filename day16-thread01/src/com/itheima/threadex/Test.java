package com.itheima.threadex;

/**
 * @author csq
 * @date 2020/8/6 15:16
 */
public class Test {
    public static void main(String[] args) {
        //出现重复票和负数票的本质原因:
        //
        //\1. 多线程环境
        //
        //\2. 访问共享资源
        //
        //\3. 多条语句访问共享资源(多条语句是一个逻辑整体)
        Ticket ticket = new Ticket();
        Thread thread1 = new Thread(ticket);
        Thread thread2 = new Thread(ticket);
        Thread thread3 = new Thread(ticket);
        thread1.setName("窗口一");
        thread2.setName("窗口二");
        thread3.setName("窗口三");
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
