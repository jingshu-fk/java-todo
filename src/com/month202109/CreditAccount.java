package com.month202109;

public class CreditAccount extends Account{ // 信用账户类，继承了银行账户类
    // 信誉度
    private double credit;

    public double getCredit(){
        return credit;
    }

    public void setCredit(double credit){
        this.credit = credit;
    }
}
