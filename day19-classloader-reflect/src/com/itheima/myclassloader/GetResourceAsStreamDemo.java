package com.itheima.myclassloader;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @author csq
 * @date 2020/8/10 9:42
 */
public class GetResourceAsStreamDemo {
    public static void main(String[] args) throws IOException {
        //static ClassLoader getSystemClassLoader() 获取系统类加载器
        //InputStream getResourceAsStream(String name) 加载某一个资源文件

        //获取系统类加载器
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();

        //利用类加载器加载资源文件
        InputStream resourceAsStream = systemClassLoader.getResourceAsStream("druid2.properties");

        Properties properties = new Properties();

        properties.load(resourceAsStream);

        System.out.println(properties);

        assert resourceAsStream != null;
        resourceAsStream.close();
    }
}
