package cn.csq.args;

/**
 * @author csq
 * @className ArgsTest
 * @date 2020/7/30 21:15
 */
public class ArgsTest {
    public static void main(String[] args) {
        int sum = getSum(1, 2, 3, 4, 5, 6, 7);
        System.out.println("sum = " + sum);
    }

    public static int getSum(int a, int b) {
        return a + b;
    }

    public static int getSum(int a, int b, int c) {
        return a + b + c;
    }

    public static int getSum(int a, int... arr) {
        //可变参数
        for (int i : arr) {
            a += i;
        }
        return a;
    }
}
