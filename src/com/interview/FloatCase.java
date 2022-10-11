package com.interview;

/**
 * @author SHUJINGPING
 * @date 2022-6-8
 * @description
 * 因为浮点数的误差舍入导致，只有2的幂数可以用简单的二进制表示法精确表示。不对应于2次方的数字必须四舍五入以适应有限数量的位
 */
public class FloatCase {
    public static void main(String[] args) {
        System.out.println(0.1*3 == 0.3);
        System.out.println(0.1*2 == 0.2);

        double a1 = 6.7;
        double b1 = 6.8;
        System.out.println(Double.compare(a1, b1) == 0);
    }
}
