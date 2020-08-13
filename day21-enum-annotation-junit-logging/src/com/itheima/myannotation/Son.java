package com.itheima.myannotation;

/**
 * @author csq
 * @date 2020/8/13 10:28
 */
public class Son extends Father{

    //Override 标识是重写了父类的show方法，如果不一致报错
    @Override
    public void show() {
        super.show();
        System.out.println("son show");
    }

}
