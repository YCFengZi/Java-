package net.StudentManger.utils;

import java.sql.Date;
import java.text.SimpleDateFormat;

public class DateUtils {
    public static Date stringToDate(String date) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        try {
            return new Date(format.parse(date).getTime());
        } catch (Exception e) {
            System.out.println("日期格式不对");
        }
        return null;
    }
}
