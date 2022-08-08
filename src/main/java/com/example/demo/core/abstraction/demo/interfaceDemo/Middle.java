package com.example.demo.core.abstraction.demo.interfaceDemo;

public interface Middle extends Right{


    default void defaultMethodMiddle() {
        System.out.println("defaultMethodMiddle");
    }

    static void staticMethodMiddle() {
        System.out.println("staticMethodMiddle");
    }


}
