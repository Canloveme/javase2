package com.itheima.synchronizeddemo2;

/**
 * @author csq
 * @date 2020/8/6 21:08
 */
public class Ticket2 implements Runnable{
    //共享
    private  int ticket = 1000;
    @Override
    public void run() {
        while (true) {
            if (sellTicket()) {
                break;
            }
        }
    }


    private synchronized boolean sellTicket() {
            if (ticket <= 0) {
                System.out.println("票卖完了");
                return true;
            } else {
                System.out.println(Thread.currentThread().getName() + "在卖票，还有" + ticket + "张");
           /* try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }*/
                ticket--;
                return false;
            }
        }
}
