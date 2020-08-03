package com.itheima.myhashset;

/**
 * @author csq
 * @className HashDemo01
 * @date 2020/7/31 14:41
 */
public class HashDemo01 {

    public static void main(String[] args) {
        //哈希冲突
        //String类重写hashcode方法
        //内容相同，hashcode一定相同
        //内容不同，hashcode不一定不同

        String s1 = new String("hello");
        String s2 = new String("hello");

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

        System.out.println("通话".hashCode());
        //1179395
        System.out.println("重地".hashCode());
        //1179395
        //所以在比较hashcode方法的同时，还要检测内容用equal()方法
        //先比hashcode 在比equal
    }
}
