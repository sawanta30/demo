package com.example.demo.core.Interview.morganstanley.sorting;

import java.util.Arrays;

public class MergeSort {
    private  int[] data = {5,8,2,1,9,5,7,4};
    public static void main(String[] args) {
        MergeSort ms = new MergeSort();
        System.out.println(Arrays.toString(ms.data));
        ms.mergeSort(ms.data);
        System.out.println(Arrays.toString(ms.data));


    }

    private  void mergeSort(int[] array){

        if (array.length<2)
            return;
        int middle = array.length/2;

        int[] left = new int[middle];
        for (int i =0;i<middle;i++)
            left[i] = array[i];

        int[] right = new int[array.length-middle];
        for (int i = middle; i< array.length;i++)
            right[i-middle] = array[i];

        mergeSort(left);
        mergeSort(right);
        merge(left,right,array);


    }

    private  void merge(int[] left, int[] right, int[] result){
        int i =0, j =0, k = 0;
        while(i<left.length && j < right.length){
            if (left[i]<=right[j])
                result[k++] = left[i++];
            else
                result[k++] = right[j++];
        }

        if (i<left.length){
            while (i< left.length)
                result[k++] = left[i++];
        }
        if (j< right.length)
            while(j< right.length){
                result[k++] = right[j++];
            }

    }

}
