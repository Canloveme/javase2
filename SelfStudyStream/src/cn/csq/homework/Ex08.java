package cn.csq.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author csq
 * @date 2020/8/1 16:35
 */
public class Ex08 {
    public static void main(String[] args) {
        /**
         * 以下是某不知名机构评出的全球最佳影片及华人最佳影片前十名 ：
         * 现将两个榜单中的影片名，分别按排名顺序依次存入两个ArrayList集合
         * 2、通过流的方式
         * 	1）打印全球影片排行榜中的前三甲影片名
         * 	2）打印华人影片排行榜中倒数5名的影片名
         * 	3）将两个排行榜中的前5名挑出来共同存入新的集合
             * 	4）定义电影Film类，以影片名为name创建Film对象并保存至集合
         */
        ArrayList<String> list1 = new ArrayList<>(List.of("教父", "肖申克的救赎", "辛德勒的名单", "公民凯恩", "卡萨布兰卡",
                "教父续集", "七武士", "星球大战", "美国美人", "飞跃疯人院"));
        ArrayList<String> list2 = new ArrayList<>(List.of("霸王别姬", "大闹天宫", "鬼子来了", "大话西游", "活着",
                "饮食男女", "无间道", "天书奇谭", "哪吒闹海", "春光乍泄"));
        list1.stream().limit(3).forEach(System.out::println);
        System.out.println("===");
        list2.stream().skip(5).forEach(System.out::println);
        ArrayList<Film> films = new ArrayList<>();
        //System.out.println(Stream.concat(list1.stream().limit(5), list2.stream().limit(5)).collect(Collectors.toList()));
        System.out.println("===");
        List<String> list = Stream.concat(list1.stream().limit(5), list2.stream().limit(5)).collect(Collectors.toList());
        for (String s : list) {
            films.add(new Film(s));
        }
        films.forEach(System.out::println);
    }
}
class Film{
    private String name;

    @Override
    public String toString() {
        return "Film{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Film(String name) {
        this.name = name;
    }
}
