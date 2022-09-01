package com.example.demo.core.exception;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class Driver {

    public static void main(String[] args) {
//        byte a = 10;
//        byte b =20;
//        int c = a+b;
//
//        System.out.println(c);

//        ForkJoinPool fjp = new ForkJoinPool(10);
//        System.out.println(fjp.getPoolSize());
//        String s1 = new String("Akshay");
//        String s2 = "Akshay";
//        System.out.println(s1 == s2);
//        String s3 = s2.toUpperCase().toLowerCase();
//        System.out.println(s2 == s3);

        ForkJoinPool commonPool = ForkJoinPool.commonPool();
        System.out.println();
        commonPool.shutdown();
//        commonPool.invo
        System.out.println(commonPool.getPoolSize());




    }
}
