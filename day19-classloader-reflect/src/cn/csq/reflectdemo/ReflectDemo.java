package cn.csq.reflectdemo;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @author csq
 * @date 2020/8/10 10:13
 */
public class ReflectDemo {
    private static Properties properties;
    public static void main(String[] args) throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        Student student = (Student) getBean("student");
        student.study();
        Teacher teacher = (Teacher) getBean("teacher");
        teacher.teach();
        Object student1 = getBean("student");
        System.out.println("student1 = " + student1);
    }

    private static Object getBean(String key) throws IOException, ClassNotFoundException, IllegalAccessException, InstantiationException {
        String className = (String) properties.get(key);
        return Class.forName(("cn.csq.reflectdemo." + className)).newInstance();
    }


    static {
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        InputStream resourceAsStream = systemClassLoader.getResourceAsStream("prop.properties");

         properties = new Properties();
        try {
            properties.load(resourceAsStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
