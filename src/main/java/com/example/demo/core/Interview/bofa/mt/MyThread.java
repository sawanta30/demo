package com.example.demo.core.Interview.bofa.mt;

public class MyThread extends Thread{

    MyClass myClass;
    public MyThread(MyClass myClass){
        this.myClass = myClass;
    }

    @Override
    public void run() {
        myClass.m1();
    }
}
