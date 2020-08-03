package com.itheima.compareable;

/**
 * @author csq
 * @className Student
 * @date 2020/7/30 15:28
 */
public class Student implements Comparable{
    private String name;
    private int age;

    
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

    @Override
    public int compareTo(Object o) {
        Student student = (Student) o;
        //先比较年龄
        int num = this.getAge() - student.getAge();
        //基本类型直接减，引用类型就使用CompareTo
        //如果年龄相等，就按照首字母排序
       /* if (num == 0) {
            num = this.getName().charAt(0) - student.getName().charAt(0);
        }*/
        //如果年龄相等，比较姓名
       /* if (num == 0) {
            num = this.getName().compareTo(student.name);
        }*/

        //三元表达式写法
        num = num == 0 ? this.getName().compareTo(student.getName()) : num;
        return num;
    }
}
