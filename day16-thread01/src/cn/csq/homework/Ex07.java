package cn.csq.homework;

/**
 * @author csq
 * @date 2020/8/6 19:17
 */
public class Ex07 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            /**
             * 编写程序，创建两个线程对象，
             * 一根线程循环输出“播放背景音乐”，另一根线程循环输出“显示画面”，
             * 要求线程实现Runnable接口，且使用匿名内部类实现
             */
            new Thread(() -> System.out.println("播放背景音乐")).start();
            new Thread(() -> System.out.println("显示画面")).start();

        }
    }
}
