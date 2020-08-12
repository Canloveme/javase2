package cn.csq.homework;

/**
 * @author csq
 * @date 2020/8/6 17:57
 */
public class Ex01 {
    public static void main(String[] args) {
        MyThread01 myThread01 = new MyThread01();
        //myThread01.run();
        myThread01.start();
        System.out.println("当前正在运行的线程是： "+Thread.currentThread().getName());


        MyThread01 myThread02 = new MyThread01();
        //myThread02.run();
        myThread02.start();
        System.out.println("当前正在运行的线程是： "+Thread.currentThread().getName());

        /**
         * run方法只是简单的调用了run方法，完成run方法内容。
         * Start方法是启动这个线程，，自动调用run方法，可以多个线程同时执行达到多线程运行的目的。
         */
    }
}

class MyThread01 extends Thread {
    private static int ticket = 10;
    @Override
    public void run() {
        while (true) {
            if (scillTicket()) {
                break;
            }
        }

    }

    private boolean scillTicket() {
        if (ticket <= 0) {
            return true;
        }else {
            System.out.println(Thread.currentThread().getName() + "正在买票，还剩" + ticket + "张票");
            ticket--;
        }
        return false;
    }
}