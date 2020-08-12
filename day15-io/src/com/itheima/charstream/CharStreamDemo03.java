package com.itheima.charstream;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author csq
 * @date 2020/8/4 9:36
 */
public class CharStreamDemo03 {
    public static void main(String[] args) throws IOException {
        //将键盘录入用户名密码保存到本地中
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("请输入用户名：");
            String username = scanner.nextLine();
            System.out.println("请输入密码：");
            String password = scanner.nextLine();
            if ("end".equalsIgnoreCase(scanner.nextLine())) {
                break;
            }
            FileWriter fileWriter = new FileWriter("day15-io\\b.txt");
            fileWriter.write(username);
            fileWriter.write(System.lineSeparator());
            fileWriter.write(password);
            System.out.println("保存成功");
        }
    }
}
