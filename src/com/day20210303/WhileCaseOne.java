package com.day20210303;

/**
 * @author SHUJINGPING
 */
public class WhileCaseOne {
	public static void main(String[] args) {
		int sum = 0;
		int n = 1;
		while (n < 100) {
			sum += n;
			n++;
		}
		System.out.println(n);
		System.out.println(sum);
	}
}
