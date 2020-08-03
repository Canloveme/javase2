package com.itheima.collections.foreachdemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/**
 * @ClassName : ForeachDemo03
 * @Author : CSQ
 * @Date: 2020-07-28 15:10
 */
public class ForeachDemo03 {
    public static void main(String[] args) {
        Collection<Student> students = new ArrayList<>();
        //创建student的集合类
        Student student1 = new Student("小红", 18);
        Student student2 = new Student("小花", 16);
        Student student3 = new Student("小黑", 20);
        //添加student
        students.add(student1);
        students.add(student2);
        students.add(student3);

        Iterator<Student> studentIterator = students.iterator();
        while (studentIterator.hasNext()) {
            System.out.println(studentIterator.next());
        }
        System.out.println("============");
        for (Student student : students) {
            System.out.println(student);
        }
        System.out.println("============");
        //引用类型变量 修改名称
        for (Student student : students) {
            student.name = "小皮";
        }
        //所有学生的名称被修改
        for (Student student : students) {
            System.out.println(student);
        }
        System.out.println("=====");
        //toArray()
        System.out.println(Arrays.toString(students.toArray()));
    }
}

class Student{
    public String name;
    public int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
