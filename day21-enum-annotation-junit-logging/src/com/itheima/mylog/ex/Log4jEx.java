package com.itheima.mylog.ex;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

/**
 * @author csq
 * @date 2020/8/13 16:35
 */
public class Log4jEx {
    public static final Logger LOGGER = LoggerFactory.getLogger(Log4jEx.class);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个数字：");
        String s = scanner.nextLine();
        try {
            int i = Integer.parseInt(s);
            System.out.println("i = " + i);
            LOGGER.info("【数据转化成功】 i = " + i);
        } catch (NumberFormatException e) {
            e.printStackTrace();
            LOGGER.info("【数据转化失败】错误输入为 ： " + s);
        }
    }
}
