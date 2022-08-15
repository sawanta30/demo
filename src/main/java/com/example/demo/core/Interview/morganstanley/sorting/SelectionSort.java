package com.example.demo.core.Interview.morganstanley.sorting;

import java.util.Arrays;

public class SelectionSort {

    private static int[] data = {5,8,2,1,9,5,7,4};
    public static void main(String[] args) {
        int n = data.length;
        System.out.println(Arrays.toString(data));
        for (int i = 0; i< n; i++){
            int max = Integer.MAX_VALUE;
            int minIndex = Integer.MIN_VALUE;
            for (int j=i;j<n;j++){
                if (data[j]<max){
                    max = data[j];
                    minIndex = j;
                }

            }
            if (! (minIndex == Integer.MIN_VALUE))
                swap(data,minIndex,i);
        }

        System.out.println(Arrays.toString(data));
    }

    private static void swap(int[] arr, int index1, int index2){
        int temp;
        temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;

    }
}
