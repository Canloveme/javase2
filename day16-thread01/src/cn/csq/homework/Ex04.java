package cn.csq.homework;

/**
 * @author csq
 * @date 2020/8/6 19:11
 */
public class Ex04 {
    public static void main(String[] args) {
        new Thread(new MyThread1Ex04()).start();
        /**
         * 练习四：实现Runnable接口的优势
         * 问题：
         * 请描述实现Runnable接口比继承Thread类所具有的优势：
         * 答：
         * 实现接口完成多线程的同时，还可以继承别的类，
         * 因为实现runnable接口传入给多个线程完成多线程的特性，
         * 类中的数据可以共享，可以代码复用，多个线程只需一个实现类创建多个Thread对象即可，
         * 而Thread类的中普通成员无法共享，多个线程完成同样的任务，还是需要创建多个类，代码使用率低。
         */
    }
}

class MyThread1Ex04 extends Object implements Runnable {

    private int number = 100;
    @Override
    public void run() {
        System.out.println("start");
    }
}