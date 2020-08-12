package com.itheima.volatiledemo2;

/**
 * @author csq
 * @date 2020/8/7 15:31
 */
public class Boy extends Thread {
    @Override
    public void run() {
        synchronized (Money.lock) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            Money.money = 90000;
        }

    }
}
