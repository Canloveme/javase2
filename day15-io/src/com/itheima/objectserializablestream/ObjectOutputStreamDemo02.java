package com.itheima.objectserializablestream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * @author csq
 * @date 2020/8/4 14:49
 */
public class ObjectOutputStreamDemo02 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //反序列化：读取字节序列，返回一个对象
        //对象反序列化流： ObjectInputStream
        //- ObjectInputStream反序列化先前使用ObjectOutputStream编写的原始数据和对象
        // ObjectInputStream(InputStream in)
        // 创建从指定的InputStream读取的ObjectInputStream
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("day15-io/student.bin"));
        //Object readObject() 从ObjectInputStream读取一个对象
        User user = (User) objectInputStream.readObject();
        System.out.println(user);
        objectInputStream.close();
    }
}
