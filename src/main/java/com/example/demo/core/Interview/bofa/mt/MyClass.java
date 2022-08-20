package com.example.demo.core.Interview.bofa.mt;

public class MyClass {

    public static synchronized void m1()  {
        System.out.println(Thread.currentThread().getName()+" executing static sync m1() from MyClass");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static synchronized void m2(){
        System.out.println(Thread.currentThread().getName()+" executing static sync m2() from MyClass");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
