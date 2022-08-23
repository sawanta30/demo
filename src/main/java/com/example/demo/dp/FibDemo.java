package com.example.demo.dp;

import java.util.Arrays;

public class FibDemo {


    public static void main(String[] args) {
        int n =25;
        final int[] arr = new int[n];
        arr[0] = 0;
        arr[1] = 1;
        arr[2] = 1;
//        System.out.println(fib(n,arr));
        System.out.println(fib(25));
        System.out.println(Arrays.toString(arr));
    }

    private static int fib(int n,int[] array){
        if (n<=2)
            return 1;
        if (array[n-1]!=0)
            return array[n-1];
        return array[n-1]=fib(n-1,array)+fib(n-2,array);
    }
    private static int fib(int n){
        if (n<=2)
            return 1;
//        if (array[n-1]!=0)
//            return array[n-1];
        return fib(n-1)+fib(n-2);
    }
}
