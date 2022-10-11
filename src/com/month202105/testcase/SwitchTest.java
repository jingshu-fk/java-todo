package com.month202105.testcase;


/*
switch条件判断分支
 */
public class SwitchTest {
    public static void main(String[] args) {
        char grade = 'C';
        switch (grade) {
            case 'A':
                System.out.println("优秀");
                break;
            case 'B':
            case 'C':
                System.out.println("良好");
                break;
            case 'D':
                System.out.println("不及格");
                break;
            default:
                System.out.println("未知等级");
        }
        System.out.println("你的等级是：" + grade);
    }
}
