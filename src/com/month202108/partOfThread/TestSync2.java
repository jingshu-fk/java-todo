package com.month202108.partOfThread;

/**
 * @Time: 2021-08-13
 * 对多个线程进行加锁,对代码块
 */
public class TestSync2 {
    public static void main(String[] args) throws InterruptedException {
        Thread[] ts = new Thread[] {new AddStudentThread(), new DecStudentThread(),
        new AddTeacherThread(), new DecTeacherThread()};
        for (Thread t: ts) {
            t.start();
        }
        for (Thread t: ts) {
            t.join();
        }
        System.out.println(CounterTwo.studentCount);
        System.out.println(CounterTwo.teacherCount);
    }
}


class CounterTwo{
    public static final Object lock1 = new Object();
    public static final Object lock2 = new Object();
    public static int studentCount = 0;
    public static int teacherCount = 0;
}


class AddStudentThread extends Thread{
    @Override
    public void run() {
        for (int i=0; i<10000; i++) {
            synchronized (CounterTwo.lock1) {
                CounterTwo.studentCount += 1;
            }
        }
    }
}

class DecStudentThread extends Thread {
    @Override
    public void run() {
        for (int i=0; i<10000; i++) {
            synchronized (CounterTwo.lock1) {
                CounterTwo.studentCount -= 1;
            }
        }
    }
}

class AddTeacherThread extends Thread {
    @Override
    public void run() {
        for (int i=0; i<10000; i++) {
            synchronized (CounterTwo.lock2) {
                CounterTwo.teacherCount += 1;
            }
        }
    }
}

class DecTeacherThread extends Thread {
    @Override
    public void run() {
        for (int i=0; i<10000; i++) {
            synchronized (CounterTwo.lock2) {
                CounterTwo.teacherCount -= 1;
            }
        }
    }
}