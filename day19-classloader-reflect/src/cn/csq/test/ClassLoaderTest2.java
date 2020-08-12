package cn.csq.test;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @author csq
 * @date 2020/8/10 8:27
 */
public class ClassLoaderTest2 {

    @Test
    public void test1() throws IOException {
        //InputStream resourceAsStream = ClassLoaderTest2.class.getClassLoader().getResourceAsStream("druid.properties");
        InputStream resourceAsStream = ClassLoaderTest.class.getClassLoader().getResourceAsStream("druid2.properties");
        Properties properties = new Properties();
        properties.load(resourceAsStream);
        System.out.println(properties.get("username"));
        System.out.println(properties.get("password"));

    }
    @Test
    public void test2() throws IOException {
      /*  InputStream resourceAsStream = ThreadLocal.class.getClassLoader().getResourceAsStream("druid2.properties");
        Properties properties = new Properties();
        properties.load(resourceAsStream);
        System.out.println(properties);*/
    }
    @Test
    public void test3() throws IOException {
        FileInputStream fileInputStream = new FileInputStream("druid1.properties");
        Properties properties = new Properties();
        properties.load(fileInputStream);
        System.out.println(properties);
    }
    //servlet.ServletContext.getResourceAsStream
}
