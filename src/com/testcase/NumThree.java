package com.testcase;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

//字节编码解码

public class NumThree {
    public static void main(String[] args) throws Exception {
        String value = "I have 1 dog";
        byte[] bytes = value.getBytes(StandardCharsets.US_ASCII);
        System.out.println(Arrays.toString(bytes).replace(",", "").trim());
        System.out.println(new String(bytes, StandardCharsets.US_ASCII));
    }
}
