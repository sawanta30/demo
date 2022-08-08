package com.example.demo.core.java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionDemo {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Akshay");
        names.add("Bharat");
        names.add("Bob");
        names.add("Jack");
        names.add("Vicky");
        names.add("Babygirl");

        Function<String,Integer> provideStringLength = (str)->str.length();
        Function<Integer,String> printString = (Int)->"INT"+Int;

        //provideStringLength.

        BiFunction<String,String,Boolean> checklengthAndEquality = (s1,s2)->s1.length()==s2.length() && s1.equalsIgnoreCase(s2);

        System.out.println(checklengthAndEquality.apply("AKSHAY","akshay"));

        System.out.println(provideStringLength.andThen(printString).apply("Akshay"));
    }
}
