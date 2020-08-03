package cn.csq.fileex;

import java.io.File;
import java.util.HashMap;

/**
 * @author csq
 * @date 2020/8/1 14:51
 */
public class FileEx03 {
    public static void main(String[] args) {
        //file练习3
        //统计一个文件夹中每种文件的个数并打印出来
        //打印格式如下：
        //              txt：3个
        //              doc：4个
        //              jpg：6个
        File file = new File("D:\\javaio");
        if (!file.isDirectory()) {
            System.out.println("文件不是一个文件夹");
        }
        if (file.listFiles().length == 0) {
            System.out.println("文件夹为空");
        }
        File[] files = file.listFiles();
        System.out.println("共有 "+files.length+" 个文件");
        HashMap<String, Integer> hashMap = new HashMap<>();
        for (File file1 : files) {
            if (file1.isDirectory()) {
                hashMap.put(file.getName(), 1);
            }
            System.out.println(file1);
            if (file1.isFile()) {
                String name = file1.getName();
                String endName = name.substring(name.indexOf(".")+1);
                if (hashMap.containsKey(endName)) {
                    hashMap.put(endName, hashMap.get(endName) + 1);
                }else {
                    hashMap.put(endName, 1);
                }
            }
        }
        hashMap.forEach((String s,Integer i)-> System.out.println(s +" ："+i+" 个"));
        }

}
