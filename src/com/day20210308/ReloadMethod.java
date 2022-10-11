package com.day20210308;


/**
 * 方法重载：完成类似的功能
#1 方法名是一样的；
#2 参数是不一样的；
#3 返回类型是一样的；
*/
public class ReloadMethod {
    public static void main(String[] args) {
        String s = "Test String";
		//String.indexOf()即是
		int n1 = s.indexOf('t');
		int n2 = s.indexOf("st");
		int n3 = s.indexOf("st", 4);
		System.out.println("值分别为" + n1 + "," + n2 + "," + n3);
    }
}


