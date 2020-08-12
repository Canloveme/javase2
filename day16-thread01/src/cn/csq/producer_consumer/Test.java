package cn.csq.producer_consumer;

/**
 * @author csq
 * @date 2020/8/6 20:36
 */
public class Test {
    public static void main(String[] args) {
        new Cooker().start();
        new Foodie().start();
    }
}
