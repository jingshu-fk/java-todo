package com.day20210320;

import java.time.LocalDate;
import java.util.Date;

public class ToDuiXiang {
    public static void main(String[] args) {
        System.out.println(new Date().toString());

        LocalDate newYearDate = LocalDate.of(2021, 3, 20);
        int year = newYearDate.getYear();
        int month = newYearDate.getMonthValue();
        int day = newYearDate.getDayOfMonth();
        System.out.println(month);
    }
}