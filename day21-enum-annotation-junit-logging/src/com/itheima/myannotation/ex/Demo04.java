package com.itheima.myannotation.ex;

/**
 * @author csq
 * @date 2020/8/13 11:20
 * 自定义一个注解@XXX,用于指定类的方法上,如果某一个类的方法上使用了该注解,就执行该方法
 */
public class Demo04 {
    public void method01() {
        System.out.println("111");
    }

    @Goto
    public void method2() {
        System.out.println("222");
    }

    @Goto
    public void method3() {
        System.out.println("333");
    }
}
