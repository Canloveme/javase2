package com.itheima.collections.foreachdemo;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @ClassName : ForeachDemo01
 * @Author : CSQ
 * @Date: 2020-07-28 14:24
 */
public class ForeachDemo01 {
    public static void main(String[] args) {
        //增强for循环  foreach 简化集合和数组的遍历
        //内部原理也是一个iterator迭代器
        // 只有实现了Iterable接口的类才可以使用迭代器和增强for
        //快捷键 集合.iter  集合.for


        Collection<String> strings = new ArrayList<>();
        strings.add("aaa");
        strings.add("bbb");
        strings.add("ccc");
        strings.add("eee");

        //格式： for(集合中的变量类型 变量名称: 集合(数组)名称){
        //              打印 变量名称  }
        //1.数据类型一定是集合或者数组中元素的类型
        //2.s 仅仅是一个变量名而已，在循环的过程中，依次表示集合或者数组中的每一个元素
        //3. strings就是要遍历的集合或者数组
        for (String s : strings) {
            System.out.println(s);
            //ConcurrentModificationException
            //strings.remove(s);
        }
    }
}
