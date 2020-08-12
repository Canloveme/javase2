package com.itheima.threadmethoddemo;

/**
 * @author csq
 * @date 2020/8/6 13:47
 */
public class MyThread extends Thread {

    //构造方法设置名称

    public MyThread() {
    }

    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(this.getName()+ "run");
    }
}
