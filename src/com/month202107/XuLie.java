package com.month202107;

import java.io.*;
import java.util.Arrays;

public class XuLie {
    public static void main(String[] args) throws IOException {
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        try(ObjectOutputStream output = new ObjectOutputStream(buffer)) {
            output.writeInt(123);
            output.writeUTF("阿叔");
//            output.writeObject(Double.valueOf(123.456));
        }
        // Arrays.toString()就是将数组转为字符串形式
        System.out.println(Arrays.toString(buffer.toByteArray()));
    }
}
