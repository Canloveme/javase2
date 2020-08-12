package com.itheima.lockdemo;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author csq
 * @date 2020/8/6 21:24
 */
public class Ticket implements Runnable {
    private int ticket = 1000;
    Lock lock = new ReentrantLock();

    @Override
    public void run() {
        while (ticket>0) {
            lock.lock();
                try {
                    System.out.println(Thread.currentThread().getName() + "正在卖" + ticket--);
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }finally {
                    lock.unlock();
                }
            }
    }
}
