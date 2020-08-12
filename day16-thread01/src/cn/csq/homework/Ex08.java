package cn.csq.homework;

/**
 * @author csq
 * @date 2020/8/6 19:18
 */
public class Ex08 {
    /**
     * 问题：
     * 编写一个Java程序，要求在同一个类中除main线程外，再开启一个线程，2个线程都循环执行20次。
     */
    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName()+" "+i);
        }

        new Thread(()-> {for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName()+" "+i);
        }}).start();
    }

}
