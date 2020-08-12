package com.itheima.synchronizeddemo;

/**
 * @author csq
 * @date 2020/8/6 16:26
 *  * 实现Runnable接口的多线程安全解决问题
 */
public class Ticket implements Runnable {
    private int ticket = 100;
    @Override
    public void run() {
        //使用同步代码块解决多线程数据共享线程安全问题  一个对象使用this作为锁即可，this是唯一的
        while (true) {
        synchronized (this) {

                if (ticket <= 0) {
                    System.out.println("票卖完了");
                    break;
                }else {
                    System.out.println(Thread.currentThread().getName() + "在卖票，还有" + ticket + "张");
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    ticket--;
                }
            }
        }
    }
}
