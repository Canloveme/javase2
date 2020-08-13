package com.itheima.myenum;

/**
 * @author csq
 * @className EnumDemo
 * @date 2020/8/13 9:13
 */
public class EnumDemo {
    public static void main(String[] args) {
        //所有枚举类都是Enum的子类

        //我们可以通过"枚举类名.枚举项名称"去访问指定的枚举项
        System.out.println(Season.SPRING);
        System.out.println(Season.SUMMER);
        System.out.println(Season.AUTUMN);
        System.out.println(Season.WINTER);

        //每一个枚举项其实就是该枚举的一个对象
        Season spring = Season.SPRING;

        Season.SPRING.show();
    }}
