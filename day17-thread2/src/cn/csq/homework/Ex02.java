package cn.csq.homework;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;

/**
 * @author csq
 * @date 2020/8/7 19:06
 */
public class Ex02 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        /**
         *
         请使用CountDownLatch编写一个程序，实现以下效果：
         线程A打印：”开始计算”
         线程B：计算1--100所有数的累加和，并打印结果。
         线程A打印：”计算完毕”
         */
        CountDownLatch countDownLatch = new CountDownLatch(1);
        A a = new A(countDownLatch);
        a.start();
        B b = new B(countDownLatch);
        b.start();

    }
}
class A extends Thread{
    private CountDownLatch countDownLatch;

    public A(CountDownLatch countDownLatch) {
        this.countDownLatch = countDownLatch;
    }

    @Override
    public void run() {
        try {
            System.out.println("开始计算");
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("计算完成");
    }
}

class B extends Thread {
    private CountDownLatch countDownLatch;
    public B(CountDownLatch countDownLatch) {
        this.countDownLatch = countDownLatch;
    }
    int sum;

    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {
            sum += i;
        }
        countDownLatch.countDown();
        System.out.println(sum);
    }
}