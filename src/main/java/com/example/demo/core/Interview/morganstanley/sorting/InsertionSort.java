package com.example.demo.core.Interview.morganstanley.sorting;

import java.util.Arrays;

public class InsertionSort {
    private static int[] data = {7,2,1,6,3,9,8,5};
    public static void main(String[] args) {
        int n = data.length;
        System.out.println(Arrays.toString(data));
        for (int i = 0; i < n-1 ; i++){
          for (int j = 0; j<n-1; j++){
              if (data[j]>data[j+1]){
                  swap(data,j,j+1);
                  int pointer = j;
                  while(j >0){
                      if (data[j]>data[j-1])
                          swap(data,j,j-1);
                      j--;
                  }
              }
          }
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
