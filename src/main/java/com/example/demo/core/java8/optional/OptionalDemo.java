package com.example.demo.core.java8.optional;

import java.util.Optional;

public class OptionalDemo {



    public static void main(String[] args) {
        Optional<String> strOpt = Optional.ofNullable(null);
        //Optional<String> opt = Optional.of(null);
        //System.out.println(opt.isPresent());
        Optional<Integer> optInt =  Optional.empty();
//        strOpt.get();
        //opt.get();
        //optInt.get();
    }
}
