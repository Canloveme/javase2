package com.itheima.threaddemo;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @author csq
 * @date 2020/8/6 11:05
 */
public class MyThread03Test {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //线程开启之后需要执行里面的call方法
        //3.创建MyCallable类的对象
        MyCallable myThread03 = new MyCallable();
        //4.创建Future的实现类FutureTask对象，把MyCallable对象作为构造方法的参数
        FutureTask<String> stringFutureTask = new FutureTask<>(myThread03);

        //5.创建Thread类的对象，将Future对象作为构造方法的参数
        Thread thread = new Thread(stringFutureTask);
        //6.启动线程
        thread.start();

        //获取线程运作之后的结果   如果线程还没运行结束，那么get方法会在这里死等 该方法会阻塞
        String s = stringFutureTask.get();
        System.out.println(s);

    }
}
