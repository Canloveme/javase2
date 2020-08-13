package com.itheima.myenum;

/**
 * @author csq
 * @date 2020/8/13 9:40
 */
public class EnumEx {
    public static void main(String[] args) {

        switch (Season.SPRING) {
            case SPRING:
                System.out.println("春天");
                break;
            case SUMMER:
                System.out.println("夏天");
                break;
            case AUTUMN:
                System.out.println("秋天");
                break;
            case WINTER:
                System.out.println("冬天");
                break;
        }
    }
}
