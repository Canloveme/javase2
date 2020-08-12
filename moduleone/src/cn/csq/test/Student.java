package cn.csq.test;

/**
 * @author csq
 * @date 2020/8/10 21:51
 */
public class Student {
    private String name;

    public void study() {
        System.out.println(this.name+" 好好学习天天向上");
    }
    public Student() {
    }

    public Student(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}
