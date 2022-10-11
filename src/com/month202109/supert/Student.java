package com.month202109.supert;


public class Student extends People {
    int sno;

    public Student() {
//        super(); //这里隐式调用了super()
    }
    public Student(String idCard, String name, boolean sex, int sno) {
        super(idCard, name, sex);  //super初始化父类型特征
        this.sno = sno;
    }
}
