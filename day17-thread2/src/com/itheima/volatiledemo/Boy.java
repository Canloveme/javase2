package com.itheima.volatiledemo;

/**
 * @author csq
 * @date 2020/8/7 15:31
 */
public class Boy extends Thread {
    @Override
    public void run() {
        try {
            Thread.sleep(1000);
            //修改金额
            Money.money = 90000;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
