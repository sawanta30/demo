package com.example.demo.core.Interview.morganstanley;

import java.util.HashMap;
import java.util.Map;

public class SumPair {

    public static void main(String[] args) {
        int[] a = {1,1,1,1};
        int sum = 2;
//        getPairCount(a,sum);
        System.out.println(getPairCount(a,sum));
    }

    private static int getPairCount(int[] array, int sum){

        Map<Integer,Integer> map = new HashMap<>();

        int count = 0;
        for (int i=0;i<array.length;i++) {
            int element = sum - array[i];
            if (map.containsKey(element))
                count = count + map.get(element);
            if(!map.containsKey(array[i]))
                map.put(array[i],0);


            else
                map.put(array[i],map.get(array[i])+1);
        }
        System.out.println(map);
        return count;
    }
}
