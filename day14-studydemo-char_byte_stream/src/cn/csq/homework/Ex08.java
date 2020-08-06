package cn.csq.homework;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author csq
 * @date 2020/8/3 19:21
 */
public class Ex08 {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\stu.txt");
        FileOutputStream fileOutputStream = new FileOutputStream(file,true);
        Scanner scanner = new Scanner(System.in);
        System.out.println("");
        while (true){
            String s = scanner.nextLine();
            if ("end".equalsIgnoreCase(s)) {
                break;
            }
            fileOutputStream.write(s.getBytes());
            fileOutputStream.write(System.lineSeparator().getBytes());

        }
    }
}
class Student{
    private int id;
    private String name;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
