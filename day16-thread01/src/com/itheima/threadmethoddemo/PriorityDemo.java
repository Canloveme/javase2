package com.itheima.threadmethoddemo;

/**
 * @author csq
 * @date 2020/8/6 14:40
 */
public class PriorityDemo {
    public static void main(String[] args) {
        MyThread2 myThread = new MyThread2();

        Thread thread1 = new Thread(myThread);
        thread1.setName("一");
        Thread thread2 = new Thread(myThread);
        thread2.setName("二");
        //thread1.start();
        //thread2.start();

        System.out.println("===");
        //得到线程的优先级
        System.out.println(thread1.getPriority());
        System.out.println(thread2.getPriority());

        System.out.println("===");
        //设置优先级启动 1-10
        thread1.setPriority(10);
        thread2.setPriority(2);
        //优先级只是会提高cpu抢占的概率，不是一定的
        thread1.start();
        thread2.start();
    }
}

class MyThread2 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }

}