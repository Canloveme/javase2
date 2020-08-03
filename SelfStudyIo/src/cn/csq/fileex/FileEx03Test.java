package cn.csq.fileex;

import java.io.File;
import java.util.HashMap;

/**
 * @author csq
 * @date 2020/8/1 15:23
 */
public class FileEx03Test {
    public static void main(String[] args) {

        File file = new File("D:\\javaio");
        HashMap<String, Integer> hashMap = new HashMap<>();
        getCount(hashMap, file);
        System.out.println(hashMap);
    }

    private static void getCount(HashMap<String, Integer> hashMap, File file) {
        File[] files = file.listFiles();
        for (File f : files) {
            if (f.isFile()) {
                String fileName = f.getName();
                String[] split = fileName.split("\\.");
                if (split.length == 2) {
                    String fileEndName = split[1];
                    //已经存在
                    if (hashMap.containsKey(fileEndName)) {
                         //将已经出现的次数取出来
                        Integer count = hashMap.get(fileEndName);
                        count++;
                        //修改map
                        hashMap.put(fileEndName, count);
                    }else {
                        //不存在，第一次出现
                        hashMap.put(fileEndName, 1);
                    }
                }
            }
        }
    }
}
