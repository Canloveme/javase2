package cn.csq.homework;

import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

/**
 * @author csq
 * @date 2020/8/4 19:25
 */
public class Ex06 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        /**
         *  1.定义学生类,包含姓名(String name),性别(String gender),年龄(int age)三个属性,
         *  生成空参有参构造,set和get方法,toString方法
         *  2.键盘录入6个学员信息(录入格式:张三,男,25),要求有两个相同的信息,
         *  将6个学员信息存入到ArrayList集合中
         *  3.将存有6个学员信息的ArrayList集合对象写入到 StudentInfo.txt文件中
         *  4.读取 StudentInfo.txt文件中的ArrayList对象并遍历打印
         *  5.对ArrayList集合中的6个学生对象进行去重,将去重后的结果利用字符缓冲流写入到
         *  NewStudentInfo.txt文件中(写入格式：张三-男-25)
         */
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();
        int i = 6;
        while (i > 0) {
            System.out.println("录入6个学员信息 录入格式:张三,男,25,还剩" + i + "个");
            String s = scanner.nextLine();
            String[] split = s.split(",");
            Student student = new Student(split[0], split[1], Integer.parseInt(split[2]));
            students.add(student);
            i--;
        }
        method1(students);
        method2(students);
    }

    private static void method2(ArrayList<Student> students) throws IOException {
        HashSet<Student> students1 = new HashSet<>(students);
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("day15-io\\NewStudentInfo.txt"));
        for (Student student : students1) {
            bufferedWriter.write(student.getName() + "-" + student.getGender() + "-" + student.getAge());
            bufferedWriter.write(System.lineSeparator());
        }
        bufferedWriter.close();
    }

    private static void method1(ArrayList<Student> students) throws IOException, ClassNotFoundException {
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("day15-io\\StudentInfo.txt"));
        objectOutputStream.writeObject(students);
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("day15-io\\StudentInfo.txt"));
        ArrayList<Student> studentArraysList = (ArrayList<Student>) objectInputStream.readObject();
        for (Student student : studentArraysList) {
            System.out.println(student);
        }
        objectOutputStream.close();
        objectInputStream.close();
    }
}
class Student implements Serializable {
        private String name;
        private String gender;
        private int age;

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Student)) {
            return false;
        }

        Student student = (Student) o;

        if (getAge() != student.getAge()) {
            return false;
        }
        if (getName() != null ? !getName().equals(student.getName()) : student.getName() != null) {
            return false;
        }
        return getGender() != null ? getGender().equals(student.getGender()) : student.getGender() == null;
    }

    @Override
    public int hashCode() {
        int result = getName() != null ? getName().hashCode() : 0;
        result = 31 * result + (getGender() != null ? getGender().hashCode() : 0);
        result = 31 * result + getAge();
        return result;
    }

    @Override
        public String toString() {
            return "student{" +
                    "name='" + name + '\'' +
                    ", gender='" + gender + '\'' +
                    ", age=" + age +
                    '}';
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getGender() {
            return gender;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public Student() {
        }

        public Student(String name, String gender, int age) {
            this.name = name;
            this.gender = gender;
            this.age = age;
        }
}

