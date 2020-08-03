package cn.csq.test;

/**
 * @ClassName : FailFastDemo
 * @Author : CSQ
 * @Date: 2020-07-28 20:05
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * 集合的fail-fast机制
 * ConcurrentModificationException
 * 在系统设计中，快速失效系统一种可以立即报告任何可能表明故障的情况的系统。
 * 快速失效系统通常设计用于停止正常操作，而不是试图继续可能存在缺陷的过程。
 * 这种设计通常会在操作中的多个点检查系统的状态，因此可以及早检测到任何故障。
 * 快速失败模块的职责是检测错误，然后让系统的下一个最高级别处理错误。
 *
 * @author csq
 */
public class FailFastDemo {
    public static void main(String[] args) {
        new ThreadOne().start();
        new ThreadTwo().start();
        new ThreadThree().start();
    }

    private static List<String> list = new ArrayList<>();

    //private static final List<String> list =new CopyOnWriteArrayList<>();
    //private static final ConcurrentLinkedQueue<String> list =  new ConcurrentLinkedQueue<>();

    private static void show() {
        for (String s : list) {
            System.out.println(s);
        }
    }

    /**
     * 线程一：向List中添加数据，然后show()输出
     */
    private static class ThreadOne extends Thread {
        @Override
        public void run() {
            for (int i = 0; i < 5; i++) {
                list.add(String.valueOf("线程一：java xxx" + i));
                show();
            }
        }
    }

    /**
     * 对list进行同样的操作
     */
    private static class ThreadTwo extends Thread {
        @Override
        public void run() {
            for (int i = 0; i < 5; i++) {
                list.add(String.valueOf("线程二：spring ======== " + i));
                show();
            }
        }
    }
    private static class ThreadThree extends Thread {
        @Override
        public void run() {
            list.set(2, "xxxxxxxx");
        }
    }


}


