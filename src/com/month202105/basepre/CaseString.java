package com.month202105.basepre;

import java.util.StringJoiner;

public class CaseString {
    public static void main(String[] args) {
        String[] fields = {"name", "position", "salary"};
        String table = "employee";
//        String insert = buildInsertSql(table, fields);
//        System.out.println(insert);
//        String s = "INSERT INTO employee (name, position, salary) VALUES (?, ?, ?)";
        String select = builderSelectSql(table, fields);
        System.out.println(select);
        String s = "SELECT name, position, salary FROM employee";
        System.out.println(s.equals(select) ? "测试成功" : "测试失败");


    }

    //StringBuilder高效拼接字符串
    public static String buildInsertSql(String table, String[] fields) {
        StringBuilder sb = new StringBuilder();
        String[] placeholders = new String[fields.length];
        for(int i = 0;i < fields.length;i++) {
            placeholders[i] = "?";
        }
        sb.append("INSERT INTO ")
                .append(table)
                .append(" (")
                //String.join()当没有前后缀时分隔更高效
                .append(String.join(", ", fields))
                .append(")")
                .append(" VALUES (")
                .append(String.join(", ", placeholders))
                .append(")");
        return sb.toString();
    }

    //StringJoiner根据分隔符分隔字符串拼接
    public static String builderSelectSql(String table, String[] fields) {
        StringJoiner sj = new StringJoiner(", ", "SELECT ", " FROM employee");
        for(String field : fields) {
            sj.add(field);
        }
        return sj.toString();
    }
}


