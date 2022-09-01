package com.example.demo.core.exception;

public class MyClass {

    public int m1(){



        try{
            throw new RuntimeException("ABC");
        }catch(Exception e) {
//            throw new RuntimeException("XYZ");
        }finally{
            System.out.println("finally");

        }
        return 1;

    }
}
