package com.example.demo.arraypractice;

import java.util.*;
import java.util.stream.Collectors;

public class SortMapByValues {


    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("Akshay",10);
        map.put("Bharat",12);
        map.put("Vijay",6);
        map.put("Nitin",8);
        map.put("Ujwal",13);
        map.put("Mayank",11);
        map.put("ShashiKant",9);
        map.put("Siddharth",2);

        System.out.println(map);


        Map<String,Integer> my = map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(a, b)->a,LinkedHashMap::new));

        System.out.println(my);

    }


//    private Map<String,Integer> sortByValues(Map<String,Integer> map){
//        Set<Map.Entry<String,Integer>> list = map.entrySet();
//    }
}
