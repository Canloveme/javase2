package com.itheima.myenum;

/**
 * 为了间接的表示一些固定的值，Java就给我们提供了枚举
 * 是指将变量的值一一列出来,变量的值只限于列举出来的值的范围内
 * 格式：
 * public enum s {
 * 枚举项1,枚举项2,枚举项3;
 * }
 * 注意: 定义枚举类要用关键字enum
 * 定义一个枚举类，用来表示春，夏，秋，冬这四个固定值
 */
public enum Season {
    //枚举类的第一行上必须是枚举项，最后一个枚举项后的分号是可以省略的，
    // 但是如果枚举类有其他的东西，这个分号就不能省略。建议不要省略


    //枚举类也可以有抽象方法，但是枚举项必须重写该方法
    SPRING("春天", "春暖花开"){
        @Override
        public void show() {
            System.out.println(this.name);
        }
    },
    SUMMER("夏天","夏日炎炎") {
        @Override
        public void show() {

        }
    },
    AUTUMN("秋天","秋高气爽") {
        @Override
        public void show() {

        }
    },
    WINTER("冬","冰天雪地") {
        @Override
        public void show() {

        }
    };

    public String name;
    public String title;

    //枚举类可以有构造器，但必须是private的，它默认的也是private的。
    //枚举项的用法比较特殊：枚举("");

    //枚举类也可以有抽象方法，但是枚举项必须重写该方法
    public abstract void show();
    //普通方法
    public void show2() {
        System.out.println("休，春天来了");
    }

    Season(String name, String title) {
        this.name = name;
        this.title = title;
    }
}
