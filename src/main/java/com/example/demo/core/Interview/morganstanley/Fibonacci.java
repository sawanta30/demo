package com.example.demo.core.Interview.morganstanley;

public class Fibonacci {

    public static void main(String[] args) {

        System.out.println(fib(10));
    }

    //best approach O(n)
    private static int fib(int n){
        int a = 0;
        int b = 1;
        int c;
        if (n == 0){
            return a;
        }
        for (int i = 2; i<=n ;i++){
            c = a+b;
            a = b;
            b = c;
        }

        return b;
    }

//    private static int fibRecursion(int n){
//      if(n == 0)
//          return n;
//      else
//          return n+fibRecursion(n-1);
//    }
}
