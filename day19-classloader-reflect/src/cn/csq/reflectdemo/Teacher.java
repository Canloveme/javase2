package cn.csq.reflectdemo;

/**
 * @author csq
 * @date 2020/8/10 16:17
 */
public class Teacher {
    private String name;
    private int age;

    public void teach() {
        System.out.println("teacher teach");
    }

    public Teacher() {
    }

    public Teacher(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
