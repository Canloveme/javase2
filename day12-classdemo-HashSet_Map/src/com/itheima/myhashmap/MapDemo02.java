package com.itheima.myhashmap;


import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author csq
 * @className MapDemo02
 * @date 2020/7/31 18:03
 */
public class MapDemo02 {

    public static void main(String[] args) {
        //Map的遍历
        //创建map
        HashMap<String, Integer> hashMap = new HashMap<>();
        //添加元素
        hashMap.put("张三", 20);
        hashMap.put("李四", 21);
        hashMap.put("王五", 22);
        hashMap.put("赵六", 23);
        //1.获取所有键 键集合KeySet
        Set<String> keySet = hashMap.keySet();
        for (String s : keySet) {
            //1.通过每一个键，获取每一个值
            Integer age = hashMap.get(s);
            System.out.print(s+" "+age+" ");
        }
        System.out.println();

        //2.直接遍历键值对 Entry对象
        Set<Map.Entry<String, Integer>> entrySet = hashMap.entrySet();
        for (Map.Entry<String, Integer> entry : entrySet) {
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
        hashMap.forEach((s1,i)-> System.out.print(s1+""+i));
    }

}
