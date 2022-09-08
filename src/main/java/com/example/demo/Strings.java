package com.example.demo;

public class Strings {

    public static void main(String[] args) {
        //String str =new String("Akshay");
        String str ="Akshay";

        System.out.println(str == str.intern());
    }
}
