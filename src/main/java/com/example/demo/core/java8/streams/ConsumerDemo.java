package com.example.demo.core.java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerDemo {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Akshay");
        names.add("Bharat");
        names.add("Bob");
        names.add("Jack");
        names.add("Vicky");
        names.add("Babygirl");

        Consumer<String> printString = (str)->System.out.println(str);
        Consumer<String> printSubString = (str)->System.out.println(str.substring(2));
        BiConsumer<String,Integer> nameAndAgeConsumer = (name,age)->System.out.println(name+" "+age);
//
//        printString.accept("ABCDEF");
//        nameAndAgeConsumer.accept("Akshay",27);
//
//        names.stream()
//                .forEach(printString);

        printString.andThen(printSubString).accept("Akshay");
    }
}
