package com.itheima.reflectdemo.constructorsdemo;

import java.lang.reflect.Constructor;

/**
 * @author csq
 * @date 2020/8/10 10:42
 */
public class GetConstructorsDemo {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException {

        //1.获取class对象
        Class<?> clazz = Class.forName("com.itheima.reflectdemo.constructorsdemo.Student");

        //添加s得到构造方法数组
        //通过添加形参class类型获取对应的单个构造方法
        //带declared的不受修饰符影响，可以获取所有构造方法
        /**
         *  getConstructors()  受方法修饰符影响 只能得到公共的 受保护的 和 私有的都不能获取
         *  getDeclaredConstructors() 不受方法修饰符影响
         */

        //Constructor<?>[] getConstructors()返回所有公共构造方法对象的数组
        //publicConstructorListMethod(clazz);
        // Constructor<?>[] getDeclaredConstructors()返回所有构造方法对象的数组 无论私有公有的
        //getDeclaredConstructorsMethod(clazz);

        //因为Student类中,没有只有一个int的构造,所以这里会报错.
        /*Constructor constructor3 = clazz.getConstructor(int.class);
        System.out.println(constructor3);*/

        // Constructor<T> getConstructor(Class<?>... parameterTypes)返回单个公共构造方法对象
        // 根据形参类型得到公共的构造方法
        //getConstructorParameterTypesMethod(clazz);
        // Constructor<T> getDeclaredConstructor(Class<?>... parameterTypes)返回单个构造方法对象
        //getDeclaredConstructorForParameterMethod(clazz);


    }

    private static void getDeclaredConstructorForParameterMethod(Class<?> clazz) throws NoSuchMethodException {
        //根据形参类型得到私有的构造方法
        // Constructor<T> getDeclaredConstructor(Class<?>... parameterTypes)返回单个构造方法对象
        Constructor<?> declaredConstructor = clazz.getDeclaredConstructor(String.class);
        System.out.println("declaredConstructor = " + declaredConstructor);
        //declaredConstructor = private com.itheima.reflectdemo.constructorsdemo.Student(java.lang.String)
    }

    private static void getConstructorParameterTypesMethod(Class<?> clazz) throws NoSuchMethodException {
        // Constructor<T> getConstructor(Class<?>... parameterTypes)返回单个公共构造方法对象
        // 根据形参类型得到公共的构造方法
        //小括号中,一定要跟构造方法的形参保持一致.
        Constructor<?> constructor = clazz.getConstructor();
        System.out.println("constructor = " + constructor);
        //小括号添加构造方法对应形参的class对象
        Constructor<?> constructor1 = clazz.getConstructor(String.class, int.class);
        System.out.println("constructor1 = " + constructor1);
        //constructor = public com.itheima.reflectdemo.constructorsdemo.Student()
        //constructor1 = public com.itheima.reflectdemo.constructorsdemo.Student(java.lang.String,int)
    }


    private static void getDeclaredConstructorsMethod(Class<?> clazz) {
        // Constructor<?>[] getDeclaredConstructors()返回所有构造方法对象的数组 无论私有公有的
        Constructor<?>[] declaredConstructors = clazz.getDeclaredConstructors();
        for (Constructor<?> declaredConstructor : declaredConstructors) {
            System.out.println(declaredConstructor);
        }
        //private com.itheima.reflectdemo.constructorsdemo.Student(java.lang.String)
        //public com.itheima.reflectdemo.constructorsdemo.Student()
        //public com.itheima.reflectdemo.constructorsdemo.Student(java.lang.String,int)
    }

    private static void publicConstructorListMethod(Class<?> clazz) {
        //Constructor<?>[] getConstructors()返回所有公共构造方法对象的数组
        Constructor<?>[] constructors = clazz.getConstructors();
        for (Constructor<?> constructor : constructors) {
            System.out.println(constructor);
        }
        //public com.itheima.reflectdemo.constructorsdemo.Student()
        //public com.itheima.reflectdemo.constructorsdemo.Student(java.lang.String,int)
    }
}
