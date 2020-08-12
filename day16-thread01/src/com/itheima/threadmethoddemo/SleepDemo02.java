package com.itheima.threadmethoddemo;

/**
 * @author csq
 * @date 2020/8/6 14:25
 */
public class SleepDemo02 {
    public static void main(String[] args) {
        //模拟秒表
        for (int i = 59; i >=0; i--) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //使用Thread类的sleep方法让程序睡眠1秒

    }
}
