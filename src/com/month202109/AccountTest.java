package com.month202109;

public class AccountTest {
    public static void main(String[] args) {
        CreditAccount ca = new CreditAccount();
        ca.setActno("阿叔");
        ca.setBalance(34000);
        System.out.println(ca.getActno() + "信用账户，余额还剩：" + ca.getBalance());
    }
}
