package com.month202109.miniio;
/*
@Time: 2021-10-9
复制文件a.txt到b.txt
 */
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class CopyTxtDemo {
    public static void main(String[] args) throws IOException {
        try(FileInputStream fi = new FileInputStream("D:\\JavaWorkSpace\\StartOne\\src\\com\\month202109\\miniio\\a.txt")) {
            FileOutputStream fot = new FileOutputStream("D:\\JavaWorkSpace\\StartOne\\src\\com\\month202109\\miniio\\b.txt");
            int by;
            while((by=fi.read())!=-1) {
                fot.write(by);
            }
        }
    }
}
