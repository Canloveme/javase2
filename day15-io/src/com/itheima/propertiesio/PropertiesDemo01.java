package com.itheima.propertiesio;

import java.util.Properties;

/**
 * @author csq
 * @date 2020/8/4 16:34
 */
public class PropertiesDemo01 {
    public static void main(String[] args) {
        Properties prop = new Properties();

        //增
        prop.put("哈哈", "嘿嘿");
        prop.put("嗯嗯", "额额");
        System.out.println(prop);

        //删
        prop.remove("哈哈");
        System.out.println(prop);

        //改
        prop.put("嗯嗯", "啧啧");
        System.out.println(prop);

        //查
        prop.get("嗯嗯");
        System.out.println(prop);
    }
}
