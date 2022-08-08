package com.example.demo.core.abstraction.demo.interfaceDemo;

public interface Right {


    void m1();

    void left();

    void middle();

    default void defaultMethodRight() {
        System.out.println("defaultMethodRight");
    }

    default void common() {
        System.out.println("defaultMethodRight");
    }

    static void staticMethodRight() {
        System.out.println("staticMethodRight");
    }
    static void sstatic() {
        System.out.println("staticMethodRight");
    }
}
