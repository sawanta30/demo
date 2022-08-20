package com.example.demo.core.Interview.bofa.mt;

public class MyThread2 extends Thread{

    MyClass myClass;
    public MyThread2(MyClass myClass){
        this.myClass = myClass;
    }

    @Override
    public void run() {
        myClass.m2();
    }
}
