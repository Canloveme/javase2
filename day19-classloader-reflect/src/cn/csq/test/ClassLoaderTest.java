package cn.csq.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @author csq
 * @date 2020/8/10 8:27
 */
public class ClassLoaderTest {
    public static void main(String[] args) throws IOException {

        //static ClassLoader getSystemClassLoader() 获取系统类加载器
        //InputStream getResourceAsStream(String name)  加载某一个资源文件

        //获取系统类加载器
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();

        //利用加载器去加载一个指定的文件
        //参数：文件的路径（放在src的根目录下，默认去那里加载）
        //返回值：字节流
        InputStream resourceAsStream = ClassLoaderTest.class.getClassLoader().getResourceAsStream("druid2.properties");
        //InputStream resourceAsStream = ClassLoaderTest.class.getClassLoader().getResourceAsStream("day19-classloader-reflect/druid.properties");

        Properties properties = new Properties();
        properties.load(resourceAsStream);
        System.out.println(properties);
        resourceAsStream.close();
    }
}
