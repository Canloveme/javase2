package com.itheima.synchronizeddemo;

/**
 * @author csq
 * @date 2020/8/6 16:36
 */
public class Ticket2 extends Thread {
    //共享数据
    private static int ticket = 500;
    @Override
    public void run() {
        //使用同步代码块解决多线程数据共享线程安全问题  此时多个线程this是不同对象，锁唯一，使用一个对象例如一个固定的Object.class
        //对象
        while (true) {
        synchronized (Ticket2.class) {
                if (ticket <= 0) {
                    System.out.println("票卖完了");
                    break;
                }else {
                    System.out.println(Thread.currentThread().getName() + "在卖票，还有" + ticket + "张");
                    /*try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }*/
                    ticket--;
                }
            }
        }
    }
}
