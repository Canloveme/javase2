package com.itheima.myannotation.ex;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @author csq
 * @date 2020/8/13 11:20
 */
//表示这个注解的存活时间
@Retention(value = RetentionPolicy.RUNTIME)
public @interface Goto {
}
