package com.itheima.synchronizeddemo2;

/**
 * @author csq
 * @date 2020/8/6 21:08
 */
public class Ticket extends Thread{
    //共享
    private static int ticket = 1000;
    @Override
    public void run() {
        //使用同步代码块解决多线程数据共享线程安全问题
        while (true) {
                if (sellTicket()) {
                    break;
                }
            }
    }


    private synchronized boolean sellTicket() {
        if (ticket <= 0) {
            return true;
        }else {
            System.out.println(Thread.currentThread().getName() + "在卖票，还有" + ticket + "张");
            /*try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }*/
            ticket--;
        }
        return false;
    }
}
