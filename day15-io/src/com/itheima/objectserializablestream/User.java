package com.itheima.objectserializablestream;

import java.io.Serializable;

/**
 * @author csq
 * @date 2020/8/4 14:29
 */
//如果想要这个类的对象能够被序列化，那么这个类必须要实现一个接口，Serializable
//Serializable接口的意义：
    // 这个接口没有任何方法
    // 标记性接口

public class User implements Serializable {
    private static final long serialVersionUID = -1255022742831254596L;
    private String name;
    private int age;
    private  transient String password;

    public User(String name, int age, String password) {
        this.name = name;
        this.age = age;
        this.password = password;
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
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
