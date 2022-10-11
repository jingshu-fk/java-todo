package com.day0114;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class PracExcept {
    public static void main(String[] args) {
        byte[] bs = toGbk("中文");
        System.out.println(Arrays.toString(bs));
    }

    public static byte[] toGbk(String s) {
        try {
            return s.getBytes("GBK");  //把s字符串用指定的GBK编码为byte序列
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();   //记录异常
//            System.out.println(e);
            return s.getBytes();
        } finally {
            System.out.println("这是无论是否有异常都会执行的部分");
        }
    }
}
