package com.day0114;


import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;

public class PracRandom {
    public static void main(String[] args) {
        SecureRandom sr = null;
        try {
            sr = SecureRandom.getInstanceStrong();  //获取高强度的安全随机数生成器
        } catch (NoSuchAlgorithmException e) {
            sr = new SecureRandom();  //获取普通的安全随机数生成器
        }
        byte[] buffer = new byte[16];
        sr.nextBytes(buffer);
        System.out.println(Arrays.toString(buffer));
    }
}
