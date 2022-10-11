package com.testcase;

/**
 * @Time: 2021-08-12
 *
 */
public class CaseReplaceTwo {
    public static boolean isValid(String cas) {
        while(cas.contains("{}") || cas.contains("[]") || cas.contains("()")) {
            cas = cas.replace("{}", "");
            cas = cas.replace("[]", "");
            cas = cas.replace("()", "");
        }
        boolean pos = cas.equals("");
        return pos;
    }

    public static void main(String[] args) {
        System.out.println(isValid("([])"));

    }
}



