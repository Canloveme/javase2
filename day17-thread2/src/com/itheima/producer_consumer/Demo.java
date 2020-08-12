package com.itheima.producer_consumer;

import java.util.concurrent.ArrayBlockingQueue;

/**
 * @author csq
 * @date 2020/8/7 10:09
 */
public class Demo {
    public static void main(String[] args) {
        ArrayBlockingQueue<String> bd = new ArrayBlockingQueue<>(1);
        Cooker cooker = new Cooker(bd);
        Foodie foodie = new Foodie(bd);

        foodie.start();
        cooker.start();
    }
}
