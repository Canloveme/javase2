package com.itheima.myannotation;

import java.lang.annotation.*;

/**
 * @author csq
 * @date 2020/8/13 11:27
 * 元注解就是描述注解的注解
 *
 */
//@Target指定了注解能在哪里使用
//@Retention可以理解为保留时间(生命周期)
//@Inherited表示修饰的自定义注解可以被子类继承
//@Documented表示该自定义注解，会出现在API文档里面。
@Target({ElementType.FIELD,ElementType.TYPE,ElementType.METHOD})  //指定注解使用的位置（成员变量，类，方法）
@Retention(RetentionPolicy.RUNTIME) //指定该注解的存活时间
@Inherited //指定该注解可以被继承
public @interface Anno2 {

}
