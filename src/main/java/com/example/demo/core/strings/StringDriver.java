package com.example.demo.core.strings;

import java.util.ArrayList;
import java.util.List;

public class StringDriver {

    public static void main(String[] args) {
//        List<String> list = new ArrayList<>();
//        list.add("asa");
//        list.add(null);
//        list.add("abcdcba");
//        list.add("Akshay");
//
//        System.out.println(StringUtils.getAnagrams(list));

        String s = new String("Akshay");
        String s1 = s.intern();
        System.out.println(System.identityHashCode(s));
        System.out.println(System.identityHashCode(s1));
        System.out.println(s == s1);
    }
}
