package com.example.demo.core.Interview.morganstanley.multithreading;

public class ThreadJoiningDemo {
    public static void main(String[] args) throws InterruptedException {
        MyThread t1 = new MyThread("UserThread-1");
        MyThread t2 = new MyThread("UserThread-2");

        t1.start();
        t2.start();
        t2.join(3000);
        System.out.println("Main");


    }
}
