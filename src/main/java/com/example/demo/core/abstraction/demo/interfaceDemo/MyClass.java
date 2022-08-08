package com.example.demo.core.abstraction.demo.interfaceDemo;

public class MyClass implements Left,Right {

    public static void main(String[] args) {

    }

    @Override
    public void m1() {

    }

    @Override
    public void left() {

    }

    @Override
    public void middle() {

    }

    @Override

    public void common() {
        Right.super.common();
    }
}
