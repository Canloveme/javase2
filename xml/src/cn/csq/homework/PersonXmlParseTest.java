package cn.csq.homework;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.net.MalformedURLException;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.*;

/**
 * @author MSI-PC
 */
public class PersonXmlParseTest {

    private static ArrayList<Person> persons = null;

    @Before
    public void personsParse() {
        File file = new File("E:\\itheimaProjects\\javase2\\xml\\xml\\persons.xml");
        SAXReader saxReader = new SAXReader();
        Document document = null;
        try {
            document = saxReader.read(file);
        } catch (DocumentException | MalformedURLException e) {
            e.printStackTrace();
        }
        assert document != null;
        Element rootElement = document.getRootElement();
        persons = new ArrayList<>();
        List<Element> personElements = rootElement.elements("person");
        for (Element personElement : personElements) {
            String id = personElement.attribute("id").getValue();
            String name = personElement.element("name").getText();
            String sex = personElement.element("sex").getText();
            String town = personElement.element("town").getText();
            String math = personElement.element("math").getText();
            String eng = personElement.element("eng").getText();
            String birthday = personElement.element("birthday").getText();
            persons.add(new Person(id, name, sex, town, math, eng, birthday));

        }
        for (Person person : persons) {
            System.out.println(person);
        }
        System.out.println("===================");
    }

    /**
     * 1.要求将英语+数学部分大于150分的人员信息打印出来(姓名)
     */
    @Test
    public void test1() {
        persons.forEach(person -> {
            if ((!("NULL".equals(person.getEng()))) && (!("NULL".equals(person.getMath())))) {
                if ((Integer.parseInt(person.getEng()) + Integer.parseInt(person.getMath())) > 150) {
                    System.out.println(person);
                }
            }
        });
    }

    /**
     * 2.统计每个城区的参考人数
     * 打印结果格式如下
     * 东城区： 2人
     * XXX区： 1人
     * XXX区： 3人
     */
    @Test
    public void test2() {
        HashMap<String, Integer> hashMap = new HashMap<>(10);
        for (Person person : persons) {
            if (hashMap.containsKey(person.getTown())) {
                hashMap.put(person.getTown(), hashMap.get(person.getTown()) + 1);
            } else {
                hashMap.put(person.getTown(), 1);
            }
        }
        System.out.println(hashMap);
    }

    /**
     * 3.统计数学成绩第2高的学员信息
     * 打印结果格式如下：
     * 姓名:xxxx   数学成绩:xxx分
     */
    @Test
    public void test3() {
        /*TreeMap<Integer, String> treeMap = new TreeMap<>(new Comparator<>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }

        });*/
        TreeMap<Integer, String> treeMap = new TreeMap<>(Comparator.reverseOrder());
        for (Person person : persons) {
            treeMap.put( Integer.parseInt(person.getMath()),person.getName());
        }
        Set<Map.Entry<Integer, String>> entries = treeMap.entrySet();
        System.out.println(entries);
        entries.stream().limit(2).skip(1).forEach(System.out::println);
    }

    /**
     * 4.根据生日，推算每人现在的年龄
     * 打印结果格式如下：
     * 姓名:xxxx   年龄：28岁
     * 姓名:xxxx   年龄：22岁
     * 姓名:xxxx   年龄：23岁
     */
    @Test
    public void test4() {
        persons.forEach(person -> {
            System.out.println("姓名：" + person.getName() + "   年龄：" + Period.between(LocalDate.parse(person.getBirthday(),
                    DateTimeFormatter.ofPattern("yyyy-MM-dd")),LocalDate.now()).getYears() + "岁");
        });
    }

    /**
     * 5.统计男、女生参加英语考试的人数
     * 打印结果格式如下：
     * 男生：xx人
     * 女生: xx人
     */
    @Test
    public void test5() {
        HashMap<String, Integer> hashMap = new HashMap<>();
        for (Person person : persons) {
            if (!"NULL".equals(person.getEng())) {
                if (hashMap.containsKey(person.getSex())) {
                    hashMap.put(person.getSex(), hashMap.get(person.getSex()) + 1);
                }else {
                    hashMap.put(person.getSex(), 1);
                }
            }
        }
        System.out.println(hashMap);
    }

}
