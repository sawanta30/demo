package com.example.demo.core.Interview.morganstanley.multithreading;

import javax.swing.plaf.basic.BasicScrollPaneUI;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class CHMTest {

    public static void main(String[] args) {
        ConcurrentHashMap<String,String> chm = new ConcurrentHashMap<>();
//        HashMap<String,String> chm = new HashMap<>();
        for (int i = 0; i<100;i++){
            chm.put("Key-"+i,"Value-"+i);
        }

        chm.forEach((k,v)->{
            System.out.println(k+" "+v);
            chm.put("Akshay","Sawant");
        });
//        System.out.println(chm);


    }
}
