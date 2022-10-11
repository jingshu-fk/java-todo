package com.testcase.month202111;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

/**
 * 字符串转为日期
 */
public class StringToDate {
    public static void main(String[] args) {
        String testDate = "January 2, 2010";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM d, yyyy", Locale.ENGLISH);
        LocalDate date = LocalDate.parse(testDate, formatter);
        System.out.println(date); // 2010-01-02
    }
}
