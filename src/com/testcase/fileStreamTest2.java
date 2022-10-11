package com.testcase;

import java.io.*;
import java.nio.charset.StandardCharsets;

/*
1、创建一个新文件a.txt
2、往里面写入数据
3、从a.txt里读取数据输出到控制台
 */
public class fileStreamTest2 {
    public static void main(String[] args) throws IOException {
        File f = new File("a.txt");
        FileOutputStream fop = new FileOutputStream(f);
        try(OutputStreamWriter writer = new OutputStreamWriter(fop, StandardCharsets.UTF_8)) {
            writer.append("中文输入");
            writer.append("\r\n");
            writer.append("English");
        }
        // 从文件a.txt读
        FileInputStream fip = new FileInputStream(f);
        try (InputStreamReader reader = new InputStreamReader(fip, StandardCharsets.UTF_8)){
            StringBuilder results = new StringBuilder();
            int tmp;
            while((tmp = reader.read()) != -1) {
                results.append((char) tmp);
            }
            System.out.println(results);
        }
    }
}
