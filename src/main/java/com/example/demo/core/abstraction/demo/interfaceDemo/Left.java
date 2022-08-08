package com.example.demo.core.abstraction.demo.interfaceDemo;

public interface Left {

    void m1();

    void left();

    void middle();

    default void defaultMethodLeft() {
        System.out.println("defaultMethodLeft");
    }

    static void staticMethodLeft() {
        System.out.println("staticMethodLeft");
    }

    default void common() {
        System.out.println("defaultMethodRight");
    }

    static void sstatic() {
        System.out.println("staticMethodRight");
    }
}
