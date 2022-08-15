package com.example.demo.core.Interview.morganstanley;

public class NthUglyNumber {

    //ugly number is a number divisible by either 2,3 or 5 eg 1,2,3,4,5,6,8,9,10....tn
    public static void main(String[] args) {
        System.out.println(getNthUglyNumber(150));
    }

    private static int getNthUglyNumber(int n){
        if(n==1)
            return 1;

        int count = 2;
        int i = 2;
       for(int j=2;count<n;j++) {
           if (i % 2 == 0 || i % 3 == 0 || i % 5 == 0)
               count++;
           i++;
       }

        return i;
    }
}
