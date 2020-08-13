package cn.csq.test;

import java.util.ResourceBundle;

/**
 * @author csq
 * @date 2020/8/13 18:54
 */
public class Test {
    public static void main(String[] args) {
        ResourceBundle bundle = ResourceBundle.getBundle("cn.csq.test.prop1");
        String student = bundle.getString("student");
        System.out.println("student = " + student);
    }
}
