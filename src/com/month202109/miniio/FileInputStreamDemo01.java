package com.month202109.miniio;
/*
@Time: 2021-10-09
字节输入流，读取数据
 */
import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamDemo01 {
    public static void main(String[] args) throws IOException {
        try(FileInputStream fit = new FileInputStream("D:\\JavaWorkSpace\\StartOne\\src\\com\\month202109\\miniio\\a.txt")) {
            byte[] by = new byte[3]; //缓冲字节数组
            int len;
            while((len=fit.read(by))!=-1){ //3 判断读取到的数据是不是-1
                System.out.print(new String(by));
            }
        }
    }
}
