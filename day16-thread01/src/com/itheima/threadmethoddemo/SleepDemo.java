package com.itheima.threadmethoddemo;

/**
 * @author csq
 * @date 2020/8/6 14:18
 */
public class SleepDemo {
    public static void main(String[] args) throws InterruptedException {
       /* System.out.println("睡觉前");
        Thread.sleep(3000);
        System.out.println("睡醒了");*/
        MyRunnable myRunnable = new MyRunnable();
        Thread thread1 = new Thread(myRunnable);
        thread1.start();
        Thread thread2 = new Thread(myRunnable);
        thread2.start();
    }
}

class MyRunnable implements Runnable {


    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            try {
                System.out.println(Thread.currentThread().getName()+"---"+i);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


