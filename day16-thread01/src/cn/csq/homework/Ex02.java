package cn.csq.homework;

/**
 * @author csq
 * @date 2020/8/6 18:20
 */
public class Ex02 {
    public static void main(String[] args) {
        //请描述创建线程的两种方式。

        //1 继承thread类
        MyThread1EX02 myThread1EX02one = new MyThread1EX02();
        MyThread1EX02 myThread1EX02two = new MyThread1EX02();
        myThread1EX02one.start();
        myThread1EX02one.setPriority(8);


        myThread1EX02two.start();

        System.out.println("===");

        //2 实现runnable接口
        MyThread1EX02 myThread1EX02 = new MyThread1EX02();
        new Thread(myThread1EX02).start();
        new Thread(myThread1EX02).start();
    }

}

class MyThread1EX02 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(this.getName()+" "+i);
        }
    }
}

class MyThread2Ex02 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+" "+i);
        }
    }
}
