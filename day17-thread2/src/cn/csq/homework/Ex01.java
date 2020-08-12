package cn.csq.homework;

import java.util.concurrent.Semaphore;

/**
 * @author csq
 * @date 2020/8/7 19:06
 */
public class Ex01 {
    public static void main(String[] args) {
        /**
         * 请使用Semaphore编写一个程序，实现以下效果：
         * 有10名游客要参观展览室，而“展览室”同时只允许最多“三个游客”参观，每个游客参观时间2秒。
         */

        MyRunnable myRunnable = new MyRunnable();
        for (int i = 0; i < 10; i++) {
            new Thread(myRunnable).start();
        }
    }
}

class MyRunnable implements Runnable {
    private Semaphore semaphore = new Semaphore(3);
    @Override
    public void run() {
        try {
            semaphore.acquire();
            System.out.println("开始参观");
            Thread.sleep(2000);
            System.out.println("参观完了");
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
