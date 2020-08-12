package com.itheima.threaddemo;

/**
 * @author csq
 * @date 2020/8/6 10:12
 */
//1.创建一个类继承Thread类
public class MyThread01 extends Thread {
    public MyThread01() {
    }


    public MyThread01(String name) {
        super(name);
    }

    //2.重写Thread类的run方法
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(this.getName()+" "+i);
        }
    }
}
