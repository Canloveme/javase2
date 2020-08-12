package com.itheima.threaddemo;

import java.util.concurrent.Callable;

/**
 * @author csq
 * @date 2020/8/6 11:03
 */
//1.定义一个类MyCallable实现Callable接口，泛型为返回值类型
public class MyCallable implements Callable<String> {

//2.重写call方法
    @Override
    public String call() throws Exception {
        for (int i = 0; i < 100; i++) {
            System.out.println("第"+i+"次表白");
        }
        //返回值就表示线程运行完毕之后的结果
        return "球球你答应了吧";
    }
}
