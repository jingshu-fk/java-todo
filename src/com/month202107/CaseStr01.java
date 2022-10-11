package com.month202107;



public class CaseStr01 {
    String str = new String("hello");
    char[]ch = {'t','e','s','t'};

    public void change(String str,char ch[]){
        str = "hello,world";
        ch[0]='b';
    }
    public static void main(String[] args) {
        CaseStr01 st = new CaseStr01();
        st.change(st.str, st.ch);
        System.out.println(st.str);
        System.out.println(st.ch);
    }
}
