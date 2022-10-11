package com.month202107.partOfIo;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/*
Writer——FileWriter，字符流：写
 */

public class FileWriteTo {
    public static void main(String[] args) throws IOException {
        String tempPath = "D:\\JavaWorkSpace\\StartOne\\src\\com\\month202107";
        try(Writer writer = new FileWriter(tempPath + "\\kis.txt")) {
            writer.write('H');
            writer.write("Hello".toCharArray());
            writer.write("Java");
        }
    }
}
