package com.itheima.volatiledemo2;

/**
 * @author csq
 * @date 2020/8/7 15:31
 */
public class Money {
   // public static  int money = 100000;
    //原子性  使用锁方式
   public static Object lock = new Object();
    public static  int money = 100000;
}
