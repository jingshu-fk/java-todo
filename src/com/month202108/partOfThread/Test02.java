package com.month202108.partOfThread;

/**
 * Time:2021-08-11
 * 中断线程:interrupt
 * 目标线程检测到isInterrupted()为true或者捕获了InterruptedException都应该立刻结束自身线程
 */
public class Test02 {
    public static void main(String[] args) {
        SubThread2 t1 = new SubThread2();
        t1.start();

        for(int i=0; i<=1000; i++) {
            System.out.println("main ==> " + i);
        }
        t1.interrupt();
    }
}

class SubThread2 extends Thread {
    @Override
    public void run() {
        super.run();
        for(int i=0; i<=1000;i++) {
            //判断线程的中断标志,线程有 isInterrupted()方法,该方法返回线程的中断标志
            if(this.isInterrupted()){
                System.out.println("当前线程的中断标志为true, 我要退出了");
                return; //直接结束当前run()方法的执行
            }
            System.out.println("sub thread --> " + i);
        }
    }
}
