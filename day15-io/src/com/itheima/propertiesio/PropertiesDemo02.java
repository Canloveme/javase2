package com.itheima.propertiesio;

import java.util.Properties;
import java.util.Set;

/**
 * @author csq
 * @date 2020/8/4 16:41
 */
public class PropertiesDemo02 {
    public static void main(String[] args) {
        //特有方法
        //Object setProperty(String key, String value)设置集合的键和值，都是String类型，
        // 底层调用 Hashtable方法
        // putString   getProperty(String key)使用此属性列表中指定的键搜索属性
        //Set<String> stringPropertyNames()从该属性列表中返回一个不可修改的键集，
        // 其中键及其对应的值是字符串

        //创建集合对象
        Properties prop = new Properties();

        //Object setProperty(String key, String value)：设置集合的键和值，都是String类型
        prop.setProperty("itheima001", "佟丽娅");
        prop.setProperty("itheima002", "赵丽颖");
        prop.setProperty("itheima003", "刘诗诗");

        //String getProperty(String key)：使用此属性列表中指定的键搜索属性
//        System.out.println(prop.getProperty("itheima001"));
//        System.out.println(prop.getProperty("itheima0011"));

//        System.out.println(prop);

        //Set<String> stringPropertyNames()：从该属性列表中返回一个不可修改的键集，其中键及其对应的值是字符串
        Set<String> names = prop.stringPropertyNames();
        for (String key : names) {
//            System.out.println(key);
            String value = prop.getProperty(key);
            System.out.println(key + "," + value);
        }
    }
}
