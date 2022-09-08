package com.example.demo.concurrency;

public class ThreadRunner {

    public static void main(String[] args) {
        MyThread t1 = new MyThread(null,"t1");
        MyThread t2 = new MyThread(t1,"t2");
        MyThread t3 = new MyThread(t2,"t3");




        t3.start();
        t2.start();
        t1.start();
    }
}
