package cn.csq.producer_consumer;

/**
 * @author csq
 * @date 2020/8/6 19:59
 * 厨师
 */
public class Cooker extends Thread {
    //    生产者步骤：
//            1，判断桌子上是否有汉堡包
//    如果有就等待，如果没有才生产。
//            2，把汉堡包放在桌子上。
//            3，叫醒等待的消费者开吃。


    @Override
    public void run() {
        while (true) {
            synchronized (Desk.lock) {
                if (Desk.count == 0) {
                    break;
                }else {
                    if (!Desk.flag) {
                        //生产
                        System.out.println("厨师生产汉堡包");
                        Desk.flag = true;
                        //通知来吃  一定是锁对象调用唤醒方法
                        Desk.lock.notifyAll();
                    }else {
                        //有汉堡
                        //厨师等待，吃货来吃
                        try {
                            Desk.lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
    }
}
