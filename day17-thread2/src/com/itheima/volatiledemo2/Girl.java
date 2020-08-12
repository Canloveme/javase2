package com.itheima.volatiledemo2;

/**
 * @author csq
 * @date 2020/8/7 15:32
 */
public class Girl extends Thread {
    @Override
    public void run() {
        while(true){
            synchronized (Money.lock) {
                //不要再同步代码块中些循环，会进入死循环，释放不了锁
                if (Money.money != 100000) {
                    System.out.println("结婚基金已经不是十万了");
                    break;
                }
            }
        }
    }
}
