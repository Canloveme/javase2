package cn.csq.homework.map;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @author csq
 * @date 2020/7/31 20:53
 */
public class Ex07 {
    public static void main(String[] args) {
        /**
         * 九、利用Map，完成下面的功能：
         * 从命令行读入一个字符串，表示一个年份，输出该年的世界杯冠军是哪支球队。
         * 如果该年没有举办世界杯，则输出：没有举办世界杯。
         * //tips:参阅Map接口containsKey(Object key)方法
         */
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("1930", "乌拉圭");
        hashMap.put("1934", "意大利");
        hashMap.put("1938", "意大利");
        hashMap.put("1950", "乌拉圭");
        hashMap.put("1954", "西德");
        hashMap.put("1958", "巴西");
        hashMap.put("1962", "巴西");
        hashMap.put("1966", "英格兰");
        hashMap.put("1970", "巴西");
        hashMap.put("1974", "西德");
        hashMap.put("1978", "阿根廷");
        hashMap.put("1982", "意大利");
        hashMap.put("1986", "阿根廷");
        hashMap.put("1990", "西德");
        hashMap.put("1994", "巴西");
        hashMap.put("1998", "法国");
        hashMap.put("2002", "巴西");
        hashMap.put("2006", "意大利");
        hashMap.put("2010", "西班牙");
        hashMap.put("2014", "德国");
        if (hashMap.containsKey(s)) {
            System.out.println(hashMap.get(s));
        }else {
            System.out.println("没有举办世界杯");
        }
    }
}
