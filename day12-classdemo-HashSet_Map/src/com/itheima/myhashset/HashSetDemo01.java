package com.itheima.myhashset;

/**
 * @author csq
 * @className HashSetDemo01
 * @date 2020/7/31 14:20
 */
public class HashSetDemo01 {

    /**计算哈希值*/
    public static void main(String[] args) {
        Student student1 = new Student("小美", 23);
        Student student2 = new Student("小蓝", 22);

        //因为在Object类中，是根据对象的地址值计算出的哈希值
        //相同对象的哈希值一样
        System.out.println(student1.hashCode());
        System.out.println(student1.hashCode());
        //不一样对象，地址值不一样，哈希值不一样
        System.out.println(student2.hashCode());
        /**
         * 1239731077
         * 1239731077
         * 557041912
         */
    }
}
