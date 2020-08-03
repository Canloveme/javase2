package cn.csq.fileex;

/**
 * @author csq
 * @date 2020/8/1 15:20
 */
public class Test {
    public static void main(String[] args) {
        String s = "aaa.txt";
        System.out.println(s.indexOf("."));
        System.out.println(s.substring(s.indexOf(".")));
    }
}
