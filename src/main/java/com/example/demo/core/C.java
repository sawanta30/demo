package com.example.demo.core;

public class C extends B {

    public C() {
        System.out.println(Thread.currentThread().getName()+"C - Constructor");
    }
    {
        System.out.println(Thread.currentThread().getName()+"C - Instance block");
    }
    static{
        System.out.println(Thread.currentThread().getName()+"C -Static block");
    }
}
