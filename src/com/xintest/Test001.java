package com.xintest;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * @author SHUJINGPING
 * @date 2022.2.9
 */
public class Test001 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入Java成绩：");
        int k1 = scanner.nextInt();
        System.out.println("请输入Oracle成绩：");
        int k2 = scanner.nextInt();
        System.out.println("请输入HTML成绩：");
        int k3 = scanner.nextInt();

        double k4 = (k1 + k2 + k3) / 3;

        System.out.println("---------------------------");
        System.out.println("Java\tOracle\tHTML");
        System.out.println(k1 + "\t" + k2 + "\t" + k3);
        System.out.println("---------------------------");
        System.out.println("总分：" + (k1 + k2 + k3));
        System.out.println("平均分：" + k4);

        LinkedList ll = new LinkedList();

    }
}
