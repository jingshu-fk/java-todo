package com.month202109.miniio;
/*
@Time: 2021-10-09
字符缓冲流：
 */
import java.io.*;

public class BufferedStreamDemo02 {
    public static void main(String[] args) throws IOException {
        String file = "D:\\JavaWorkSpace\\StartOne\\src\\com\\month202109\\miniio\\a.txt";
        //1 字符缓冲输出流
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
            for(int i=1;i<=10;i++) {
                bw.write("hello" + i);
                bw.newLine();
            }
        }
        //2 字符缓冲输入流
        try(BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while((line=br.readLine())!=null) {
                System.out.println(line);
            }
        }
    }
}
