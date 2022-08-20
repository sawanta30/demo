package com.example.demo.core.Interview.bofa;

public abstract class MyAbstract {
    public int data;

    public MyAbstract() {
        System.out.println("Abstract class constuctor called");
        this.data = 100;
    }

    public MyAbstract(int data) {
        this.data = data;
    }

    public abstract void m1();
}
