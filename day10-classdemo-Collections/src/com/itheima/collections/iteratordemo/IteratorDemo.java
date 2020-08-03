package com.itheima.collections.iteratordemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @ClassName : IteratorDemo
 * @Author : CSQ
 * @Date: 2020-07-28 11:10
 */
public class IteratorDemo {
    public static void main(String[] args) {
        Collection<String> strings = new ArrayList<>();
        strings.add("aaa");
        strings.add("bbb");
        strings.add("ccc");

        //创建集合的迭代器对象
        Iterator<String> stringIterator = strings.iterator();


       /* strings.forEach( s->{
            System.out.println(s);
        });

        strings.forEach(System.out::println);*/



        //判断当前索引位置是否有元素被取出 默认指向0索引
        while (stringIterator.hasNext()) {
            //1.取出当前迭代器指向的索引元素  2.迭代器对象向下移动一个索引位置
            System.out.println(stringIterator.next());
        }

        //Iterator<E> iterator()：返回集合中的迭代器对象，该迭代器对象默认指向当前集合的0索引
        //集合对象.iterator() 返回当前集合的迭代器

        //Iterator 迭代器的遍历方法
        //boolean hasNext(): 判断当前位置是否有元素可以被取出
        //iteratorHasNextMethod(strings, stringsIterator);

        //E next():获取当前位置的元素 将迭代器对象移动到下一个索引位置
        //iteratorNextMethod(stringsIterator);

        // 组合遍历 while
        //iteratorMethod(stringsIterator);

        //forr 增强for循环遍历
        //forrMethod(strings);

    }

    private static void forrMethod(Collection<String> strings) {
        //forr 增强for循环遍历
        for (String string : strings) {
            System.out.println(string);
        }
    }

    private static void iteratorMethod(Iterator<String> stringsIterator) {
        //hasNext()和next()方法组合 遍历取出集合元素

        //迭代器默认索引从0开始 ，hasNext()判断当前是否有元素可以取出
        while (stringsIterator.hasNext()) {
            System.out.print(stringsIterator.next()+" ");
            //next() 返回当前元素 索引后移一个位置
        }
    }

    private static void iteratorNextMethod(Iterator<String> stringsIterator) {
        //E next():获取当前位置的元素 将迭代器对象移动到下一个索引位置
        //默认索引为0，取出索引0元素，将对象移到下个索引位置
        String s1 = stringsIterator.next();
        System.out.println("next = " + s1);
        boolean b = stringsIterator.hasNext();
        //判断当前位置是否有元素取出
        String s2 = stringsIterator.next();
        //此时迭代器对象移到索引为1的位置，取出元素bbb，将索引后移一个位置
        System.out.println("s = " + s2);
    }

    private static void iteratorHasNextMethod(Collection<String> strings, Iterator<String> stringsIterator) {
        //boolean hasNext(): 判断当前位置是否有元素可以被取出
        System.out.println(strings);
        //该迭代器对象默认指向当前集合的0索引 true
        boolean b = stringsIterator.hasNext();
        System.out.println("b = " + b);
        strings.clear();
        System.out.println(strings);
        //此时集合为空
        //该迭代器对象默认指向当前集合的0索引
        Iterator<String> iterator = strings.iterator();
        boolean b1 = iterator.hasNext();
        //空集合的迭代器 默认指向0索引 当前位置没有元素可以被取出 false
        System.out.println("b1 = " + b1);
    }
}
