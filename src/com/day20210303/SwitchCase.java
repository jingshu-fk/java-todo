package com.day20210303;

/**
 * @author SHUJINGPING
 */

public class SwitchCase {
    public static void main(String[] args) {
		int option = 2;
		switch(option) {
            case 1:
                System.out.println("Selected 1");
                break;
            case 2:
			case 3:
                System.out.println("Selected 2");
                break;
            case 4:
                System.out.println("Selected 4");
                break;
            default:
                System.out.println("Selected Nothing");
                break;
        }
	}
}