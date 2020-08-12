package cn.csq.homework;

/**
 * @author csq
 * @date 2020/8/6 19:14
 */
public class Ex06 {
    public static void main(String[] args) {
        /**
         * 练习六：多线程练习
         * 问题：
         * 编写程序，在主线程中，循环输出“主线程执行”；在一条新线程中，循环输出“子线
         * 程执行”
         * 答：
         */
        for (int i = 0; i < 10; i++) {
            System.out.println("主线程执行"+" "+i);
        }
        Thread thread = new Thread(new MyThread1Ex06());
        thread.setName("子线程执行");
        thread.start();
    }
}

class MyThread1Ex06 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+" "+i);
        }
    }
}
