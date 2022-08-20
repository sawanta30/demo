package com.example.demo.core.Interview.bofa.mt;

public class MTTester {


    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        MyClass myClass1 = new MyClass();
        MyThread t1 = new MyThread(myClass);
        MyThread2 t2 = new MyThread2(myClass1);

        t1.start();
        t2.start();

        System.out.println("Main executed");
    }
}
