package com.example.demo.core.java8.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TerminalOps {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Akshay");
        names.add("Bharat");
        names.add("Bob");
        names.add("Jack");
        names.add("Vicky");
        names.add("Vicky");
        names.add("Vicky");
        names.add("Babygirl");
        names.add("Babygirl");
        names.add("Babygirl");

        List<List<String>> list = new ArrayList<>();
        list.add(names);
        list.add(names);
        list.add(names);


//        System.out.println(names.stream().distinct().collect(Collectors.toList()));

//        names.stream()
//                .map(e->e.chars().mapToObj(c->(char)c))
//
//                .flatMap()
//                .collect(Collectors.toList());


        List<String> lstr = list.stream()
                .flatMap(l->l.stream())
                .collect(Collectors.toList());

        System.out.println(lstr);

       int value = names.stream().map(s->s.length())
                .reduce(0,(a,b)->a+b);

        System.out.println(value);



    }
}
