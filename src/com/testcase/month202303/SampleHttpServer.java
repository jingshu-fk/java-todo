package com.testcase.month202303;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Date;

/**
 * SampleHttpServer
 * @description 简单的http server
 * @author shujingping
 * @date 2023/3/31 16:53
 * @version 1.0
 */
public class SampleHttpServer {
    public static void main(String[] args) throws IOException {
        final ServerSocket server = new ServerSocket(8081);
        System.out.println("Listening for port on 8081 ...");
//        while (true) {
//            Socket clientSocket = server.accept();
//            InputStreamReader isr = new InputStreamReader(clientSocket.getInputStream());
//            BufferedReader br = new BufferedReader(isr);
//            String line = br.readLine();
//            while (!line.isEmpty()) {
//                System.out.println(line);
//                line = br.readLine();
//            }
//        }
        while (true) {
            try (Socket socket = server.accept()){
                Date today = new Date();
                String httpResponse = "HTTP/1.1 200 OK\r\n\r\n" + today;
                socket.getOutputStream()
                        .write(httpResponse.getBytes(StandardCharsets.UTF_8));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
 
