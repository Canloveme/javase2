package cn.csq.homework;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @author csq
 * @date 2020/8/6 19:20
 */
public class Ex09 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        /**
         * 问题：
         * 	请按要求编写多线程应用程序，模拟多个人通过一个山洞：
         * 		1.这个山洞每次只能通过一个人，每个人通过山洞的时间为5秒；
         *      2.随机生成10个人，同时准备过此山洞，并且定义一个变量用于记录通过隧道的人数。
         *      显示每次通过山洞人的姓名，和通过顺序；
         */
        MyThread09 myThread09 = new MyThread09();
        FutureTask<Integer> futureTask = new FutureTask<Integer>(myThread09);
        new Thread(futureTask).start();
        FutureTask<Integer> futureTask1 = new FutureTask<>(myThread09);
        new Thread(futureTask1).start();
        System.out.println("一共通过了"+futureTask.get()+"个人");
    }
}

class MyThread09 implements Callable<Integer> {

     static int count = 0;
     static Random random = new Random();


    @Override
    public Integer call() throws InterruptedException {
        while (true) {

            synchronized (MyThread09.class) {
                if (count >= 10) {
                    break;
                }
                int i = random.nextInt(20);
                System.out.println(i+"进入山洞了");
                System.out.println("呜呜呜....");
                Thread.sleep(5000);
                System.out.println(i + "通过山洞了,通过顺序为" + (count + 1));
                count++;
            }
        }
        return count;
    }
}
