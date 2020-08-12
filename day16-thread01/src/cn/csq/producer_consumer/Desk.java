package cn.csq.producer_consumer;

/**
 * @author csq
 * @date 2020/8/6 20:00
 * 桌子
 */
public class Desk {
    //标记桌子上是否有汉堡包

    public static boolean flag = false;

    //吃的汉堡数
    public static int count = 10;

    //锁
    public static final Object lock = new Object();

}
