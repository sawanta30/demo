package com.example.demo.core.exception;

public interface PSVM {

    public static void main(String[] args) {
        System.out.println("Akshay");
        (new PSVM(){}).printName();
    }

    default void printName(){
        System.out.println("Default called");
    }
}
