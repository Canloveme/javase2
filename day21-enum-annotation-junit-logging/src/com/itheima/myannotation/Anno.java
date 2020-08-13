package com.itheima.myannotation;

/**
 * @author csq
 * @date 2020/8/13 10:44
 */
public @interface Anno {
    //可以定义 8种基本数据类型 +string class字节码对象 枚举 及其以上类型的枚举
    //  数据默认public修饰
    //int age = 10;

    // 默认值10
    int age() default 10;

    String name();


    String[] town() default {"东城区", "西城区"};

}
