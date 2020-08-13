package cn.csq.homework;

/**
 * @author MSI-PC
 */
public class Person {
    private String id;
    private String name;
    private String sex;
    private String town;
    private String math;
    private String eng;
    private String birthday;

    public Person() {
    }

    @Override
    public String toString() {
        return "Person{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", town='" + town + '\'' +
                ", math='" + math + '\'' +
                ", eng='" + eng + '\'' +
                ", birthday='" + birthday + '\'' +
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

    public String getMath() {
        return math;
    }

    public void setMath(String math) {
        this.math = math;
    }

    public String getEng() {
        return eng;
    }

    public void setEng(String eng) {
        this.eng = eng;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public Person(String id, String name, String sex, String town, String math, String eng, String birthday) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.town = town;
        this.math = math;
        this.eng = eng;
        this.birthday = birthday;
    }
}
