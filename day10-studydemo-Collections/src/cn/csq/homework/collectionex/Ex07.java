package cn.csq.homework.collectionex;

import java.util.*;

/**
 * @ClassName : Ex07
 * @Author : CSQ
 * @Date: 2020-07-28 18:47
 * 练习九：Collection集合练习
 * 八、(复杂，并不难)定义一个学生类Student，包含三个属性姓名、年龄、性别，
 * 创建三个学生对象存入ArrayList集合中。
 * A：遍历集合遍历输出。
 * B：求出年龄最大的学生，然后将该对象的姓名变为：小猪佩奇。
 */
public class Ex07 {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        Student student1 = new Student("小黑", 20, "男");
        Student student2 = new Student("小红", 18, "女");
        Student student3 = new Student("小蓝", 22, "男");
        students.add(student1);
        students.add(student2);
        students.add(student3);
        for (Student student : students) {
            System.out.println(student);
        }
        students.sort(new Comparator<Student>() {
            @Override
            public int compare(Student student, Student t1) {
                if (student.getAge() > t1.getAge()) {
                    return 1;
                } else if (student.getAge() < t1.getAge()) {
                    return -1;
                }
                return 0;
            }
        });
        students.get(students.size()-1).setName("小猪佩奇");
        System.out.println(Arrays.toString(students.toArray()));
    }

}
class Student{
    private String name;
    private int age;
    private String gender;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Student(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
}
