package com.month202109.miniio;
/*
@Time: 2021-10-09
字节流输出，写数据
 */
import java.io.FileOutputStream;
import java.io.IOException;


public class FileOutputStreamDemo01 {
    public static void main(String[] args) throws IOException {
        try(FileOutputStream ft = new FileOutputStream("D:\\JavaWorkSpace\\StartOne\\src\\com\\month202109\\miniio\\a.txt")){
            for(int i=1;i<=10;i++){
                ft.write("hello".getBytes());
                ft.write("\r\n".getBytes());
            }
        }
    }
}
