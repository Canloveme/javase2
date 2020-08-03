package cn.csq.homework.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 * @author csq
 * @date 2020/7/31 20:56
 */
public class Ex08 {
    public static void main(String[] args) {
        /**
         * 十、在原有世界杯Map的基础上，
         * 增加如下功能：读入一支球队的名字，
         * 输出该球队夺冠的年份列表。例如，读入“巴西”，
         * 应当输出1958 1962 1970 1994 2002 读入“荷兰”，
         * 应当输出 没有获得过世界杯
         * //tips:参阅Map接口containsValue(Object value)方法
         */
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
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个国家的名称");
        String s = scanner.nextLine();
        if (hashMap.containsValue(s)) {
            Set<Map.Entry<String, String>> entries = hashMap.entrySet();
            for (Map.Entry<String, String> entry : entries) {
                if (entry.getValue().equals(s)) {
                    System.out.print(entry.getKey()+" ");
                }
            }
        }else {
            System.out.println("没有获得过世界杯");
        }
    }
}
