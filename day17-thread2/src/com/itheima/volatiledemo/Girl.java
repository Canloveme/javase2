package com.itheima.volatiledemo;

/**
 * @author csq
 * @date 2020/8/7 15:32
 */
public class Girl extends Thread {
    @Override
    public void run() {
        while (Money.money == 100000) {
        }
        System.out.println("钱不对了，我擦，你个狗男人,分手！！！！！");
    }
}
