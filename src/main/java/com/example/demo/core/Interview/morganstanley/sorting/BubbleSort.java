package com.example.demo.core.Interview.morganstanley.sorting;

import java.util.Arrays;

public class BubbleSort {

    private static int[] data = {7,2,1,6,3,9,8,5};

    public static void main(String[] args) {

        System.out.println(Arrays.toString(data));
        int n = data.length;
        int temp;
        //O(n^2)
        boolean isSorted;
        for (int i = 0; i<n-1;i++){
            for (int j =0; j < n-i-1;j++){
                isSorted = true;
              if (data[j+1] < data[j]){
                  swap(data,j,j+1);
                  isSorted = false;
              }
              if (isSorted)
                  break;
            }

        }

        System.out.println(Arrays.toString(data));

    }

    private static void swap(int[] a, int index1, int index2){
        int temp;
        temp = a[index1];
        a[index1] = a[index2];
        a[index2] = temp;
    }
}
