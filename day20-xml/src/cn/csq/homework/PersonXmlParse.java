package cn.csq.homework;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * @author MSI-PC
 */
public class PersonXmlParse {
    public static void main(String[] args) throws DocumentException, ParseException {
        File file = new File("E:\\itheimaProjects\\javase2\\day20-xml\\homework\\homeworkpersons.xml");
        SAXReader saxReader = new SAXReader();
        Document document = saxReader.read(file);
        Element rootElement = document.getRootElement();
        ArrayList<Person> persons = new ArrayList<>();
        List<Element> personElements = rootElement.elements("person");
        for (Element personElement : personElements) {
            String id = personElement.attribute("id").getValue();
            String name = personElement.attribute("name").getText();
            String sex = personElement.attribute("sex").getText();
            String town = personElement.attribute("town").getText();
            String math = personElement.attribute("math").getText();
            String eng = personElement.attribute("eng").getText();
            String birthday = personElement.attribute("birthday").getText();
            persons.add(new Person(id, name, sex, town, Double.parseDouble(math), Double.parseDouble(eng),
                    new SimpleDateFormat("yyyy-MM-dd").parse(birthday)));
        }
        for (Person person : persons) {
            System.out.println(person);
        }
    }


}
