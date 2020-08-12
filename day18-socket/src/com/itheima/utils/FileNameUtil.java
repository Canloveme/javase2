package com.itheima.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author csq
 * @date 2020/8/9 18:25
 */
public class FileNameUtil {

    public static String changeFileName() {
        return new SimpleDateFormat("yyyyMMddhhmmsssss").format(new Date());
    }
}
