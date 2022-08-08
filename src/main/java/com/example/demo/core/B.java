package com.example.demo.core;

public class B extends A {

    public B() {
        System.out.println(Thread.currentThread().getName()+"B - Constructor");
    }
    {
        System.out.println(Thread.currentThread().getName()+"B - Instance block");
    }
    static{
        System.out.println(Thread.currentThread().getName()+"B -Static block");
    }
}
