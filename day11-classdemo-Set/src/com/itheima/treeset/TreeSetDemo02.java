package com.itheima.treeset;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * @author csq
 * @className Tr
 * @date 2020/7/30 15:47
 */
public class TreeSetDemo02 {
    public static void main(String[] args) {
        /*TreeSet<Teacher> teachers = new TreeSet<>(new Comparator<Teacher>() {
            @Override
            public int compare(Teacher o1, Teacher o2) {
                return o1.getAge() - o2.getAge();
            }
        });*/

        //TreeSet<Teacher> teachers = new TreeSet<>((o1, o2) -> o1.getAge() - o2.getAge());

        TreeSet<Teacher> teachers = new TreeSet<>(Comparator.comparingInt(Teacher::getAge));

        Teacher teacher1 = new Teacher("张三", 18);
        Teacher teacher2 = new Teacher("李四", 20);
        Teacher teacher3 = new Teacher("王五", 16);
        teachers.add(teacher1);
        teachers.add(teacher2);
        teachers.add(teacher3);
        for (Teacher teacher : teachers) {
            System.out.println(teacher);
        }
    }
}
