package com.example.demo.core.innerclasses.staticinner;

public class Outer {
    int x = 10;
    static int y = 40;
    public static class Inner{
        static int y = 100;

    }
    public static void main(String[] args) {
        System.out.println(Inner.y);
    }


}
