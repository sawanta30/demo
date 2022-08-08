package com.example.demo.core.java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Akshay");
        names.add("Bharat");
        names.add("Bob");
        names.add("Jack");
        names.add("Vicky");
        names.add("Babygirl");

        Supplier<String> stringSupplier = ()-> "test";
        System.out.println(stringSupplier.get());


    }
}
