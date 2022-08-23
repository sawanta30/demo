package com.example.demo.arraypractice;

import java.util.Stack;
import java.util.function.Function;
import java.util.function.Supplier;

public class ArrayUtils {

    public static void printImmidiateSmaller(int[] arr, int n){
        for (int i = 0; i < n-1; i++) {
            if (arr[i] > arr[i+1]) {
                System.out.print(arr[i+1]+" ");
            }else
                System.out.print(-1+" ");
        }
        System.out.print(-1);
    }

    public static int binarySearch(int[] arr,int n, int k){
        return binarySearchImpl(arr,0, arr.length, k);
    }

    private static int binarySearchImpl(int[] arr, int start, int end, int target){
        int middle = (start+end)/2;
        if(middle == 0)
            return (arr[0]==target) ? 0:-1;
        if (arr[middle] == target)
            return middle;
        else if(arr[middle]<target)
           return  binarySearchImpl(arr,middle,end,target);
        else
            return binarySearchImpl(arr,start,middle,target);

    }

    public static void reverseInSizeOfK(int[] arr, int n, int k){
      if (n<k)
          return;
      int i = 0;
        while(i<n-k+1){
           Stack<Integer> stack = new Stack<>();
            for (int j = i; j < i+k; j++) {
              stack.push(arr[j]);
            }
            for (int j = i; j < i+k; j++) {
               arr[j] = stack.pop();
            }
            i+=k;
        }

    }

    private void reverseArray(int[] array, int start, int end){
        final Function<Integer, String> integerStringFunction = (Integer i) -> "str" + i;
        Runnable runnable = () -> {
        };
    }

}
