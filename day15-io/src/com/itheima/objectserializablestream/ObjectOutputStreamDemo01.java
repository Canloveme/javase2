package com.itheima.objectserializablestream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * @author csq
 * @date 2020/8/4 14:34
 */
public class ObjectOutputStreamDemo01 {
    public static void main(String[] args) throws IOException {
        //对象序列化：将对象转为字节序列化(保存在磁盘中，或通过网络传输)
        //可以持久化保存对象状态
        //构造方法：
        //ObjectOutputStream(OutputStream out)
        // 创建一个写入指定的OutputStream的ObjectOutputStream  ->>字节序列
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("day15-io\\student.bin"));
        //创建对象
        User user = new User("张三", 20,"123456");
        //void writeObject(Object obj)将指定的对象写入ObjectOutputStream
        objectOutputStream.writeObject(user);
        objectOutputStream.close();
    }

}
