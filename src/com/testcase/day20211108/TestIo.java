package com.testcase.day20211108;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class TestIo {
    static class NorthService{
        ReadWriteLock readWriteLock = new ReentrantReadWriteLock();
        Lock readLock = readWriteLock.readLock();
        Lock writeLock = readWriteLock.writeLock();

        public void readFast() throws IOException{
            try {
                readLock.lock();
                try(FileInputStream fit = new FileInputStream("D:\\JavaWorkSpace\\StartOne\\src\\com\\testcase\\day20211108\\his.txt")) {
                    byte[] by = new byte[5];
                    int len;
                    while((len=fit.read(by))!=-1) {
                        System.out.println(new String(by));
                    }
                }
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                readLock.unlock();
            }
        }

        public void writeFast() throws IOException {
            try {
                writeLock.lock();
                try(FileOutputStream ft = new FileOutputStream("D:\\JavaWorkSpace\\StartOne\\src\\com\\testcase\\day20211108\\his.txt")) {
                    for (int i = 1; i <= 10; i++) {
                        ft.write("hello".getBytes());
                        ft.write("\r\n".getBytes());
                    }
                }
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                writeLock.unlock();
            }
        }
    }

    public static void main(String[] args) {
        NorthService northService = new NorthService();

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    northService.writeFast();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    northService.readFast();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }
}
