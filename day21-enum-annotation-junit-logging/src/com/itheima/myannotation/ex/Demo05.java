package com.itheima.myannotation.ex;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author csq
 * @date 2020/8/13 11:21
 *  * 自定义一个注解@XXX,用于指定类的方法上,如果某一个类的方法上使用了该注解,就执行该方法
 * 1. 自定义一个注解,并在类中的某几个方法上加上注解
 * 2. 在测试类中,获取注解所在的类的Class对象
 * 3. 获取类中所有的方法对象
 * 4. 遍历每一个方法对象,判断是否有对应的注解
 */
public class Demo05 {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, InvocationTargetException {
        //1.通过反射获取UseTest类的字节码文件对象
        Class<?> clazz = Class.forName("com.itheima.myannotation.ex.Demo04");
        //创建对象
        Demo04 demo04 = (Demo04) clazz.newInstance();
        ////2.通过反射获取这个类里面所有的方法对象
        Method[] declaredMethods = clazz.getDeclaredMethods();
        //3.遍历数组，得到每一个方法对象
        for (Method declaredMethod : declaredMethods) {
            //method依次表示每一个方法对象。
            //isAnnotationPresent(Class<? extends Annotation> annotationClass)
            //判断当前方法上是否有指定的注解。
            //参数：注解的字节码文件对象
            //返回值：布尔结果。  true 存在  false 不存在
            if (declaredMethod.isAnnotationPresent(Goto.class)) {
                declaredMethod.invoke(demo04);
            }
        }
    }
}
