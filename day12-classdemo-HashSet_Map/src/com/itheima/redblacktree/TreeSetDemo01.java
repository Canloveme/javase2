package com.itheima.redblacktree;

import java.util.TreeSet;

/**
 * @author csq
 * @className TreeSet
 * @date 2020/7/31 10:52
 */
public class TreeSetDemo01 {
    public static void main(String[] args) {
        TreeSet<Student> students = new TreeSet<>((s1, s2) -> {
            int num1 = s1.getChinese() + s1.getEnglish() + s1.getMath();
            int num2 = s2.getChinese() + s2.getEnglish() + s2.getMath();
            if (num1 == num2) {
                return s1.getName().compareTo(s2.getName());
            }
            return num1 - num2;
        });
        Student student1 = new Student("张三", 89, 67, 56);
        Student student2 = new Student("李四", 90, 37, 90);
        Student student3 = new Student("王五", 76, 67, 56);
        Student student4 = new Student("李五", 89, 67, 56);
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        for (Student student : students) {
            System.out.println(student);
        }
    }

}


class Student{
    private String name;
    private int chinese;
    private int math;
    private int english;

    public Student(String name, int chinese, int math, int english) {
        this.name = name;
        this.chinese = chinese;
        this.math = math;
        this.english = english;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", chinese=" + chinese +
                ", math=" + math +
                ", english=" + english +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getChinese() {
        return chinese;
    }

    public void setChinese(int chinese) {
        this.chinese = chinese;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getEnglish() {
        return english;
    }

    public void setEnglish(int english) {
        this.english = english;
    }
}