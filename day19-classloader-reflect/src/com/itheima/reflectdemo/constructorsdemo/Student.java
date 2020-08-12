package com.itheima.reflectdemo.constructorsdemo;

/**
 * @author csq
 * @date 2020/8/10 10:42
 */
public class Student {
    private String name;
    private int age;

    //私有的有参 String 构造方法
    private Student(String name) {
        this.name = name;
    }

    //公有的无参 构造
    public Student() {
    }

    //公有的全参 构造
    /*public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }*/


    protected Student (String name, int age) {
        this.name = name;
        this.age = age;
    }
}

