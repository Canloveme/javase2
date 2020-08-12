package cn.csq.reflectdemo;

/**
 * @author csq
 * @date 2020/8/10 10:14
 */
public class Student {
    private String name;
    private int age;

    public void study() {
        System.out.println("Student study");
    }
    public Student() {
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
