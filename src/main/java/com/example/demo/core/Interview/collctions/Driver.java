package com.example.demo.core.Interview.collctions;

import java.util.HashMap;
import java.util.Map;

public class Driver {
    public static void main(String[] args) {
//        Map<Person,String> map = new HashMap<>();
//        Person p1 = new Person("firstname1","lastname1");
//        Person p2 = new Person("firstname2","lastname2");
//
//        map.put(p1,"This is firstperson object");
//        map.put(p2,"This is second person object");
//
//        map.put(new Person("firstname1","lastname1"),"Overriding first person");
//        System.out.println(map.size());
//
//        System.out.println(map.get(new Person("firstname1","lastname1")));

        StringBuffer s1 = new StringBuffer("EP5");
        StringBuffer s2 = new StringBuffer("EP5");

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));

    }
}
