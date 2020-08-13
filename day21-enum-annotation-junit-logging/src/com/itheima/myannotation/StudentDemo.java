package com.itheima.myannotation;

/**
 * @author csq
 * @date 2020/8/13 11:29
 */
public class StudentDemo {
    public static void main(String[] args) throws ClassNotFoundException {
        //获取到Student类的字节码文件对象
        Class clazz = Class.forName("com.itheima.myannotation.Student");

        //获取注解。
        boolean result = clazz.isAnnotationPresent(Anno2.class);
        System.out.println(result);
    }
}
