package cn.csq.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author csq
 * @date 2020/8/1 16:29
 */
public class Ex07 {
    public static void main(String[] args) {
        /**
         * 扩展题
         * 练习九：Stream综合练习
         * 问题：
         * 现在有两个 ArrayList 集合存储队伍当中的多个成员姓名，要求使用Stream方式进行以
         * 下若干操作步骤：
         * 1. 第一个队伍只要名字为3个字的成员姓名；
         * 2. 第一个队伍筛选之后只要前6个人；
         * 3. 第二个队伍只要姓张的成员姓名；
         * 4. 第二个队伍筛选之后不要前1个人；
         * 5. 将两个队伍合并为一个队伍；
         * 6. 根据姓名创建Student对象；
         * 7. 打印整个队伍的Student对象信息。
         */
        List<String> one = new ArrayList<>();
        one.add("陈玄风");
        one.add("梅超风");
        one.add("陆乘风");
        one.add("曲灵风");
        one.add("武眠风");
        one.add("冯默风");
        one.add("罗玉风");
        List<String> two = new ArrayList<>();
        two.add("宋远桥");
        two.add("俞莲舟");
        two.add("俞岱岩");
        two.add("张松溪");
        two.add("张翠山");
        two.add("殷梨亭");
        two.add("莫声谷");

        //第一个队伍只要名字为3个字的成员姓名；
        //第一个队伍筛选之后只要前6个人；
        Stream<String> stream1 = one.stream().filter(s -> s.length() == 3).limit(6);

        // 第二个队伍只要姓张的成员姓名；
        // 第二个队伍筛选之后不要前1个人；
        Stream<String> stream2 = two.stream().filter(s -> s.startsWith("张")).skip(1);

        Stream<String> stream = Stream.concat(stream1, stream2);
        stream.forEach(s -> System.out.println(new Student(s).toString()));
    }
}
/**
 * 根据姓名创建Student对象；
 * 打印整个队伍的Student对象信息。
 */
class Student{
    private String name;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student(String name) {
        this.name = name;
    }
}
