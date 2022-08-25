package com.example.demo.arraypractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class ArrayDriver {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
//        ArrayUtils.printImmidiateSmaller(arr, arr.length);

//        System.out.println(ArrayUtils.binarySearch(arr,arr.length,2));
//        ArrayUtils.reverseInSizeOfK(arr,arr.length,4);
//        System.out.println(Arrays.toString(arr));


        ArrayList<Integer> l = new ArrayList();
        l.add(1);
        l.add(2);
        Iterator it = l.iterator();
        l.add(3);
        l.add(4);
        while (it.hasNext())
        {
            System.out.println(it.next());
        }
        System.out.println(l);
    }
}
