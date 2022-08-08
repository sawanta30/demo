package com.example.demo.core;

public class A {

    public A() {
        System.out.println(Thread.currentThread().getName()+"A - Constructor");
    }
    {
        System.out.println(Thread.currentThread().getName()+"A - Instance block");
    }
    static{
        System.out.println(Thread.currentThread().getName()+"A -Static block");
    }
}
