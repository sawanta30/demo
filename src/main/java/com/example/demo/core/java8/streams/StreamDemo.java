package com.example.demo.core.java8.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo {

    public static void main(String[] args) {
        //String[] arr = new String[]{"Akshay","Bharat","Mayank","Raj","Ujwal","Ash"};
        //Arrays.stream(arr);
//        Stream.of(arr);

//        List<String> names = Arrays.asList(arr);

        List<String> names = new ArrayList<>();
        names.add("Akshay");
        names.add("Bharat");
        names.add("Bob");
        names.add("Jack");
        Stream<String> streamStr = names.stream();
        System.out.println(streamStr.count());

        names.add("Vicky");

//        names.stream()
        streamStr.forEach(System.out::println);
    }
}
