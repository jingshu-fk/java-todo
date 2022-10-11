package com.month202109;
/*
@Time：2021-09-14
@Theme：变量类型：实例变量、静态变量、成员变量
 */
public class BianLiang {
    public static void main(String[] args) {
        int acs = 3;  //成员变量
    }
}


class Korean{
    static String pcType; //静态变量
    Integer count; //实例变量

    public Korean(Integer count){
        this.count = count;
    }
}
