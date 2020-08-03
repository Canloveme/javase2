package com.itheima.myhashset;

/**
 * @author csq
 * @className Student
 * @date 2020/7/31 14:20
 */
public class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;

        Student student = (Student) o;

        if (getAge() != student.getAge()) return false;
        return getName().equals(student.getName());
    }


    //我们可以对Object类中的hashCode方法进行重写
    //在重写之后，就一般是根据对象的属性值来计算哈希值
    //此时跟对象的地址值就没有任何关系了。
    @Override
    public int hashCode() {
        int result = getName().hashCode();
        result = 31 * result + getAge();
        return result;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
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
}
