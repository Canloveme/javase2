package com.itheima.reflectdemo.clazzdemo;

/**
 * @author csq
 * @date 2020/8/10 10:20
 * 获取Class对象
 */
public class GetClazzDemo {

    public static void main(String[] args) throws ClassNotFoundException {

        //源代码阶段 未加载内存阶段 使用Class类中的静态方法forName(String 全限定名 包名+类名)
        //将硬盘中的源代码读取到内存中然后获取Class对象
        Class<?> clazz1 = Class.forName("com.itheima.reflectdemo.clazzdemo.Student");
        System.out.println("clazz1 = " + clazz1);
        //源代码经过类加载器--->内存中的Class对象阶段  使用类名.class获取 Class对象

        Class<Student> studentClass = Student.class;
        System.out.println("studentClass = " + studentClass);

        //Runtime阶段  new Student()   -> 对象.getClass()获取Class对象
        Student student = new Student();
        Class<? extends Student> aClass = student.getClass();
        System.out.println("aClass = " + aClass);

        //class对象是唯一的
        System.out.println(clazz1 == studentClass);
        System.out.println(aClass == studentClass);
        /**
         * clazz1 = class com.itheima.reflectdemo.clazzdemo.Student
         * studentClass = class com.itheima.reflectdemo.clazzdemo.Student
         * aClass = class com.itheima.reflectdemo.clazzdemo.Student
         * true
         * true
         */
    }
}
