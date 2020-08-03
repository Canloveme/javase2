package cn.csq.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author csq
 * @className Ex01
 * @date 2020/7/31 9:22
 */
public class Ex01 {
    /**
     * 现在有两个ArrayList集合，分别存储6名男演员和6名女演员，要求完成如下操作
     *
     *  男演员只要姓名为3个字的前两人
     *  女演员只要姓 杨的，并且不要第一个
     *  把过滤的男演员姓名和女演员姓名合并到一起
     *  把上一步操作后的元素作为构造方法的参数创建演员对象，遍历数据
     *          演员类Actor，里面有一个成员变量，一个带参构造，以及成员变量对象的getter、setter方法
     */
    public static void main(String[] args) {
        //男演员
        ArrayList<String> manList = new ArrayList<>();
        manList.add("张国立");
        manList.add("张晋");
        manList.add("刘烨");
        manList.add("郑伊健");
        manList.add("徐峥");
        manList.add("王宝强");
        //女演员
        ArrayList<String> womanList = new ArrayList<>();
        womanList.add("郑爽");
        womanList.add("杨紫");
        womanList.add("关晓彤");
        womanList.add("张天爱");
        womanList.add("杨幂");
        womanList.add("赵丽颖");

        //男演员只要姓名为3个字的前两人
        List<String> list1 = manList.stream().filter(s -> s.length() == 3).limit(2).collect(Collectors.toList());
        System.out.println(list1);

        //女演员只要姓 杨的，并且不要第一个
        List<String> list2 = womanList.stream().filter(s -> s.startsWith("杨")).skip(1).collect(Collectors.toList());
        System.out.println(list2);

        //把过滤的男演员姓名和女演员姓名合并到一起
        Stream.concat(list1.stream(), list2.stream()).forEach(s -> System.out.println(new Actor(s)));
    }
}

/**
 * 演员类Actor，里面有一个成员变量，一个带参构造，
 * 以及成员变量对象的getter、setter方法
 */

class Actor{
    private String name;

    public Actor(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Actor{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
