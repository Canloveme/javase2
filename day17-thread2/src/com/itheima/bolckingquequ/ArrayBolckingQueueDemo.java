package com.itheima.bolckingquequ;

import java.util.concurrent.ArrayBlockingQueue;

/**
 * @author csq
 * @date 2020/8/7 10:02
 */
public class ArrayBolckingQueueDemo {
    public static void main(String[] args) throws InterruptedException {
        /**
         * + 常见BlockingQueue:
         *   ArrayBlockingQueue: 底层是数组,有界
         *   LinkedBlockingQueue: 底层是链表,无界.但不是真正的无界,最大为int的最大值
         * + BlockingQueue的核心方法:
         *   put(anObject): 将参数放入队列,如果放不进去会阻塞
         *   take(): 取出第一个数据,取不到会阻塞
         */
        //创建阻塞队列的对象，容量为1
        ArrayBlockingQueue<String> arrayBlockingQueue = new ArrayBlockingQueue<String>(1);

        //存储元素
        arrayBlockingQueue.put("汉堡包");

        //取元素
        System.out.println(arrayBlockingQueue.take());
        System.out.println(arrayBlockingQueue.take());

        System.out.println("程序结束了");

    }
}
