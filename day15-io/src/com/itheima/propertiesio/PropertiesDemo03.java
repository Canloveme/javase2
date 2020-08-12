package com.itheima.propertiesio;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/**
 * @author csq
 * @date 2020/8/4 16:48
 */
public class PropertiesDemo03 {
    public static void main(String[] args) throws IOException {
        //void load(Reader reader)从输入字符流读取属性列表（键和元素对）
        //void store(Writer writer, String comments)将此属性列表（键和元素对）写入此
        //Properties表中，以适合使用load(Reader)方法的格式写入输出字符流

        //把集合中的数据保存到文件
        //myStore();

        //把文件中的数据加载到集合
        myLoad();

    }

    private static void myLoad() throws IOException {
        Properties prop = new Properties();

        //void load(Reader reader)：
        FileReader fr = new FileReader("day15-io\\config.properties");
        prop.load(fr);
        fr.close();

        System.out.println(prop);
    }

    private static void myStore() throws IOException {
        Properties prop = new Properties();

        prop.setProperty("itheima001","佟丽娅");
        prop.setProperty("itheima002","赵丽颖");
        prop.setProperty("itheima003","刘诗诗");

        //void store(Writer writer, String comments)：
        FileWriter fw = new FileWriter("day15-io\\config.properties");
        prop.store(fw,null);
        fw.close();
    }
}
