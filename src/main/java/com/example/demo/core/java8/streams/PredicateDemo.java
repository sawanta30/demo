package com.example.demo.core.java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateDemo {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Akshay");
        names.add("Bharat");
        names.add("Bob");
        names.add("Jack");
        names.add("Vicky");
        names.add("Babygirl");

        Predicate<String> lengthGt2 = (str)-> str.length()>2;
        Predicate<String> startWithB = (str) -> str.toCharArray()[0] == 'B';
        BiPredicate<String,Integer> checkNameAndAge = (name,age)->name != null && age >18;

        System.out.println(checkNameAndAge.test("Akshay",27));

        names.stream()
                .filter(lengthGt2.or(startWithB))
                .forEach(System.out::println);
    }
}
