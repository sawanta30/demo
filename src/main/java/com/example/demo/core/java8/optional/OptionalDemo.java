package com.example.demo.core.java8.optional;

import java.util.Optional;

public class OptionalDemo {



    public static void main(String[] args) {
        Optional<String> strOpt = Optional.ofNullable(null);
        Optional<String> opt = Optional.empty();
        System.out.println(strOpt.isPresent());
        opt.get();
    }
}
