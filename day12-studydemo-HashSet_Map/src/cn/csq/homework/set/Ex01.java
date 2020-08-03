package cn.csq.homework.set;

import java.util.HashSet;

/**
 * @author csq
 * @date 2020/7/31 21:25
 */
public class Ex01 {
    public static void main(String[] args) {
        /**
         * HashSet存储自定义类型
         * 二、定义人类，包含姓名和年龄属性。创建4个人存储到HashSet中，
         * 姓名和年龄相同的人看做同一人不存储。
         */
        HashSet<Person> hashSet = new HashSet<>();
        Person person1 = new Person("张三", 20);
        Person person2 = new Person("李四", 20);
        Person person3 = new Person("王五", 22);
        Person person4 = new Person("张三", 20);
        hashSet.add(person1);
        hashSet.add(person2);
        hashSet.add(person3);
        hashSet.add(person4);
        for (Person person : hashSet) {
            System.out.println(person);
        }

    }
}
class Person{
    private String name;
    private int age;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;

        Person person = (Person) o;

        if (getAge() != person.getAge()) return false;
        return getName() != null ? getName().equals(person.getName()) : person.getName() == null;
    }

    @Override
    public int hashCode() {
        int result = getName() != null ? getName().hashCode() : 0;
        result = 31 * result + getAge();
        return result;
    }

    @Override
    public String toString() {
        return "Person{" +
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

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}