package cn.csq.homework.linkedlistex;

import java.util.*;

/**
 * @ClassName : Ex03
 * @Author : CSQ
 * @Date: 2020-07-28 19:29
 * LinkedList使用
 * 五、已知数组存放一批QQ号码，QQ号码最长为11位，
 * 最短为5位String[] strs = {"12345","67891","12347809933","98765432102",
 * "67891","12347809933"}。
 * 将该数组里面的所有qq号都存放在LinkedList中，将list中重复元素删除，
 * 将list中所有元素分别用迭代器和增强for循环打印出来。
 */
public class Ex03 {
    public static void main(String[] args) {
        String[] strs = {"12345","67891","12347809933","98765432102",
                "67891","12347809933"};

        List<String> strings = new LinkedList<>(Arrays.asList(strs));

        System.out.println(Arrays.toString(strings.toArray()));
        System.out.println("=====");
      /*  for (int i = 0; i < strings.size(); i++) {
            for (int j = i + 1; j < strings.size(); j++) {
                if (strings.get(i).equals(strings.get(j))) {
                    strings.remove(j);
                    j--;
                }
            }
        }*/
        for (int i = 0; i < strings.size(); i++) {
            for (int j = strings.size()-1; j>i;j--) {
                if (strings.get(i).equals(strings.get(j))) {
                    strings.remove(j);
                }
            }
        }
            Iterator<String> iterator = strings.iterator();
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }
            System.out.println("====");

            for (String string : strings) {
                System.out.println(string);
            }
//            System.out.println(Arrays.toString(strings.toArray()));
        }

}
