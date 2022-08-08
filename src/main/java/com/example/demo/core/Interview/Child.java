package com.example.demo.core.Interview;

import java.sql.SQLException;

public class Child extends MyClass{
    private int a = 10;
    public int b = 25;
    public Child() {
        super();
    }

    @Override
    public void MyClass() {
        System.out.println(super.b);
    }

    @Override
    public void m1(int a) {
        super.m1(a);
    }

    public static void staticMethod(){

    }
}
