package cn.csq.homework;

/**
 * @author csq
 * @date 2020/8/6 19:08
 */
public class Ex03 {
    public static void main(String[] args) {
        /**
         * 请编写程序，分别打印主线程的名称和子线程的名称。
         * 		要求使用两种方式实现：
         * 			第一种方式：继承Thread类。
         * 			第二种方法：实现Runnable接口。
         */
        MyThread1Ex03 myThread1Ex03 = new MyThread1Ex03();
        myThread1Ex03.start();
        MyThread2Ex03 myThread2Ex03 = new MyThread2Ex03();
        new Thread(myThread2Ex03).start();
    }
}

class MyThread1Ex03 extends Thread {
    @Override
    public void run() {
        System.out.println(this.getName());
    }
}
class MyThread2Ex03 implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}
