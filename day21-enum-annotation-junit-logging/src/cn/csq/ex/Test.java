package cn.csq.ex;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.Properties;

/**
 * @author csq
 * @date 2020/8/13 18:08
 */
public class Test {
    static Properties properties = new Properties();
    static {
        InputStream resourceAsStream = Test.class.getClassLoader().getResourceAsStream("prop.properties");
        try {
            properties.load(resourceAsStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, IOException {
        String studentClassName = (String) properties.get("student");

        Class<?> clazz = Class.forName(studentClassName);

        Student student = (Student) clazz.newInstance();

        /**
         *  要求：使用stu调用show方法，使用show方法能正常运行
         *     提示：
         *     1.获取student中被注解修饰的成员对象
         *     2.为此成员对象进行赋值
         */
        Field[] declaredFields = clazz.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            if (declaredField.isAnnotationPresent(Autowired.class)) {
                declaredField.setAccessible(true);
                String name = declaredField.getName();
                Object obj = Class.forName((String) properties.get(name)).newInstance();
                declaredField.set(student, obj);
            }
        }
        student.show();

    }
}
