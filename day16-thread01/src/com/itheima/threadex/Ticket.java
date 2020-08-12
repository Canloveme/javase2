package com.itheima.threadex;

/**
 * @author csq
 * @date 2020/8/6 15:13
 */
public class Ticket implements Runnable {
    //线程安全问题
    //票的数量
    private int ticket = 100;

    @Override
    public void run() {
        while (true) {
            if (ticket <= 0) {
                //卖完了
                break;
            }else {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + " 卖票,还剩下 " + ticket);
                ticket--;
            }
        }
    }
}
