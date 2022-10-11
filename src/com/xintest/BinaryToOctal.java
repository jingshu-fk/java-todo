package com.xintest;

import java.util.Scanner;

/**
 * @author SHUJINGPING
 * @version 2021.12.29
 *  二进制转换为八进制
 */

public class BinaryToOctal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the binary number: ");
        int b = sc.nextInt();
        System.out.println("Octal equivalent: " + convertBinaryToOctal(b));
        sc.close();
    }

    public static String convertBinaryToOctal(int binary) {
        String octal = "";
        int currBit = 0, j = 1;
        while (binary != 0) {
            int code3 = 0;
            for (int i = 0; i < 3; i++) {
                currBit = binary % 10;
                binary = binary / 10;
                code3 += currBit * j;
                j *= 2;
            }
            octal = code3 + octal;
            j = 1;
        }
        return octal;
    }
}
