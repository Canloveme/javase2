package cn.csq.homework;

import java.util.Date;

/**
 * @author MSI-PC
 */
public class Person {
    private String id;
    private String name;
    private String sex;
    private String town;
    private double math;
    private double eng;
    private Date birthday;

    @Override
    public String toString() {
        return "Person{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", town='" + town + '\'' +
                ", math=" + math +
                ", eng=" + eng +
                ", birthday=" + birthday +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public double getMath() {
        return math;
    }

    public void setMath(double math) {
        this.math = math;
    }

    public double getEng() {
        return eng;
    }

    public void setEng(double eng) {
        this.eng = eng;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Person() {
    }

    public Person(String id, String name, String sex, String town, double math, double eng, Date birthday) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.town = town;
        this.math = math;
        this.eng = eng;
        this.birthday = birthday;
    }
}
