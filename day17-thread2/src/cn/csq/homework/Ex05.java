package cn.csq.homework;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author csq
 * @date 2020/8/7 19:33
 */
public class Ex05 {
    public static void main(String[] args) throws InterruptedException {
        /**
         * 请用“等待唤醒”机制编写一个程序，要求：
         * 	第一个线程：遍历1--1000所有的数字，在遍历过程中，如果发现这个数字能同时被
         * 	2,3,5,7整除，立即wait()退出等待，让第二个线程进入。
         * 	第二个线程：运行后，将一个计数器 + 1，之后再唤醒等待的线程。
         * 	主线程中：休息2秒，让两个线程全部执行完毕，打印“计数器”的结果。
         * 	注意：第二个线程使用的计数器，要定义在线程外部。
         */

        AtomicInteger i = new AtomicInteger(1000);

        new Thread(() -> {
            synchronized (MyLock.lock) {
                for (i.set(0); i.get() <= 1000; i.getAndIncrement()) {
                    if (i.get() % 2 == 0 && i.get() % 3 == 0 && i.get() % 5 == 0 && i.get() % 7 == 0) {
                        try {
                            System.out.println(i + "=======> 进入等待状态");
                            //设置标记告诉另一个线程我需要唤醒，另一个线程如果通知就加1，否则不加
                            MyLock.needNofity = true;
                            //等待自己
                            MyLock.lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        //唤醒别人
                        MyLock.lock.notify();
                    }

                }
            }
        }).start();

        AtomicInteger count = new AtomicInteger();
        new Thread(()->{
            while (true) {
                synchronized (MyLock.lock) {
                    //判断是否需要唤醒
                    if (i.get() >= 1000) {
                        break;
                    }
                    if (MyLock.needNofity) {
                        //唤醒
                        MyLock.lock.notify();
                        //计数器加1
                        System.out.println("唤醒第" + (count.incrementAndGet()) + "次");
                        //将唤醒的标记设置为false
                        MyLock.needNofity = false;
                    }
                    try {
                        //自己等待
                        MyLock.lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();

    }
}
class MyLock {
    static final Lock lock = new ReentrantLock();
    //标记：是否需要唤醒
    static boolean needNofity = false;
}
