package cn.csq.test;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @ClassName : FailSafeExample
 * @Author : CSQ
 * @Date: 2020-07-28 20:47
 */
public class FailSafeExample {
    public static void main(String[] args) {
        ConcurrentHashMap<String,String> premiumPhone =
                new ConcurrentHashMap<String,String>();
        premiumPhone.put("Apple", "iPhone");
        premiumPhone.put("HTC", "HTC one");
        premiumPhone.put("Samsung","S5");

        Iterator<String> iterator = premiumPhone.keySet().iterator();

        while (iterator.hasNext()) {
            System.out.println(premiumPhone.get(iterator.next()));
            premiumPhone.put("Sony", "Xperia Z");
        }

    }
}
