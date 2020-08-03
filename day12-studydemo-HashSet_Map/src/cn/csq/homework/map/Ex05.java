package cn.csq.homework.map;

import java.util.HashMap;

/**
 * @author csq
 * @date 2020/7/31 20:47
 */
public class Ex05 {
    public static void main(String[] args) {
        /**
         * 七、
         * 有2个数组，第一个数组内容为：[黑龙江省,浙江省,江西省,广东省,福建省]，
         * 第二个数组为：[哈尔滨,杭州,南昌,广州,福州]，将第一个数组元素作为key，
         * 第二个数组元素作为value存储到Map集合中。如{黑龙江省=哈尔滨, 浙江省=杭州, …}。
         */
        String[] keys = {"黑龙江省", "浙江省", "江西省", "广东省", "福建省"};
        String[] values = {"哈尔滨", "杭州", "南昌", "广州", "福州"};
        HashMap<String, String> hashMap = new HashMap<>();
        for (int i = 0; i < keys.length; i++) {
            hashMap.put(keys[i], values[i]);
        }
        hashMap.forEach((String k,String v)-> System.out.println(k+" "+v));
    }
}
