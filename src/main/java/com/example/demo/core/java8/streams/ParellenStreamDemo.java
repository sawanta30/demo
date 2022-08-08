package com.example.demo.core.java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class ParellenStreamDemo {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Akshay");
        names.add("Bharat");
        names.add("Bob");
        names.add("Jack");
        names.add("Vicky");

        names.stream()
                //.parallel()
                .filter(f->f.length()>2)
                .forEach(e->{
                    System.out.println(Thread.currentThread().getName());
                });

    }
}
