package com.day0114;

import java.util.StringJoiner;

/*
StringJoiner类使用：字符串分隔
单个字符串分隔：split
 */

public class PracJoin {
    public static void main(String[] args) {
        String[] fields = {"name", "position", "salary"};
        String table = "employee";
        String select  = buildSelectSql(table, fields);
        System.out.println(select);
        System.out.println("SELECT name,position,salary FROM employee".equals(select) ? "测试成功": "测试失败");
    }

    public static String buildSelectSql(String table, String[] fields) {
        if (fields.length == 0) {
            return "";
        }
        StringJoiner s = new StringJoiner(",", "SELECT ", " FROM ");
        for (String field: fields) {
            s.add(field);
        }
        String s1 = s + table;
        return s1;
    }
}
