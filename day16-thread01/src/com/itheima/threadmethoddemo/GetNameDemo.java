package com.itheima.threadmethoddemo;

/**
 * @author csq
 * @date 2020/8/6 13:46
 */
public class GetNameDemo {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        //Thread方法-设置获取名字

        //void    setName(String name)将此线程的名称更改为等于参数name
        //String  getName()返回此线程的名称
        //Thread  currentThread()返回对当前正在执行的线程对象的引用
        System.out.println(myThread.getName());
        myThread.start();

        MyThread myThread1 = new MyThread();
        myThread1.setName("线程二");
        myThread1.start();

        //构造方法设置名称
        MyThread myThread2 = new MyThread("线程三");
        myThread2.start();

        //静态方法 获取当前运行的线程对象 --> 名称
        //一般用于实现接口 Runnable中的线程run方法，
        //实现Runnable接口线程中不能使用Thread对象，只能使用Thread.currentThread()来获取当前运行线程
        Thread thread = Thread.currentThread();
        System.out.println(thread.getName());
    }
}

