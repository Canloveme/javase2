package cn.csq.singletondemo;

import cn.csq.reflectdemo.Student;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Properties;
import java.util.Set;

/**
 * @author csq
 * @date 2020/8/10 17:30
 * 读取到配置文件中所有的键值对
 * 根据值生成对应的类
 * 根据键取到对应的对象，使用了一个hashMap来存储对象，这样保证了对象就是在一个集合中，不会被重复
 * 也就相当于一个spring ioc容器 单例的 使用取到即可。
 */
public class SingletonDemo {

    private static Properties properties;
    private static HashMap<String, Object> hashMap = new HashMap<>();;
    /**
     * 初始化properties
     */
    static {
        InputStream resource = SingletonDemo.class.getClassLoader().getResourceAsStream("clazz.properties");
        properties = new Properties();
        try {
            properties.load(resource);
            Set<Object> keySet = properties.keySet();
            for (Object key : keySet) {
                //根据键名获取值 --->得到全限定名
                Object value = properties.get(key);
                //根据全限定名创建对象
                Class<?> clazz = Class.forName(value.toString());
                Object o = clazz.newInstance();
                //对象存储
                hashMap.put((String) key, o);
            }
        } catch (IOException | ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            e.printStackTrace();
        }
    }

        public static void main(String[] args) throws IllegalAccessException, ClassNotFoundException, InstantiationException {
        System.out.println(getBean("student"));
        Student student = (Student) getBean("student");
        student.study();
    }




    /**
     * 这样就是个单例模式
     * 传入一个键得到对应对象
     * @param className
     * @return
     */
    public static Object getBean(String className)  {
        return hashMap.get(className);
    }
}
