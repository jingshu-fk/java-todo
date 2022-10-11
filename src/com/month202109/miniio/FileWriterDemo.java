package com.month202109.miniio;
/*
@Time: 2021-10-09
字符流写数据；FileWriter
 */
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
    public static void main(String[] args) throws IOException {
        try(FileWriter fw = new FileWriter("D:\\JavaWorkSpace\\StartOne\\src\\com\\month202109\\miniio\\a.txt")) {
            //1 写入char数组
//            char[] c = {'a', 'b', 'c', 'd', 'e'};
//            fw.write(c, 2, 3);
            //2 写入一个字符
            fw.write('k');
            //3 写入一个字符串
            fw.write("Hello");
        }
    }
}
