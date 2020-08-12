package cn.csq.homework.test03;

import cn.csq.homework.test02.ThreadSocket;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author csq
 * @date 2020/8/9 21:18
 * - 需求
 *
 *   使用多线程虽然可以让服务器同时处理多个客户端请求。但是资源消耗太大。
 *
 * - 解决方案
 *
 *   加入线程池
 *
 * - 代码实现
 * 服务器代码如下,线程任务类代码同上,此处不再给出
 */
public class ServerDemo {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(10000);
        ThreadPoolExecutor pool = new ThreadPoolExecutor(
                3,//核心线程数量
                10,   //线程池的总数量
                60,   //临时线程空闲时间
                TimeUnit.SECONDS, //临时线程空闲时间的单位
                new ArrayBlockingQueue<>(5),//阻塞队列
                Executors.defaultThreadFactory(),//创建线程的方式
                new ThreadPoolExecutor.AbortPolicy()//任务拒绝策略
        );

        while (true) {
            Socket accept = ss.accept();
            ThreadSocket ts = new ThreadSocket(accept);
            //new Thread(ts).start();
            pool.submit(ts);
        }
        //ss.close();
    }
}
