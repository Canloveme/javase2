package com.itheima.myhashset;

import java.util.HashSet;

/**
 * @author csq
 * @className HashDemo02
 * @date 2020/7/31 15:35
 */
public class HaseDemo02 {
    public static void main(String[] args) {
        //set判断对象唯一性的方法： 使用hashcode方法比较哈希值 ，然后使用equals方法比较对象内容
        HashSet<Student2> hashSet = new HashSet<>();
        Student2 student1 = new Student2("xiaohua", 22);
        Student2 student2 = new Student2("xiaohua", 22);
        Student2 student3 = new Student2("xiaohei", 23);
        hashSet.add(student1);
        hashSet.add(student2);
        hashSet.add(student3);
        //存贮了三个对象
        //student2并没有重写hashcode，使用的object类的hashcode方法
        // 是根据地址值得到的hashcode，所有新创建的student1和student2
        //地址值都不一样，hashcode一样，所以不是重复的对象，set都存储进去了

        //如果hashSet要存储自定义的对象，对象必须重写hashcode方法和equals方法
        for (Student2 student : hashSet) {
            System.out.println(student);
        }
        //方法：重写hashcode()和equal方法
    }

}

class Student2{
    private String name;
    private int age;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Student2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}