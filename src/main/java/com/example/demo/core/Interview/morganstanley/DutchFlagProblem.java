package com.example.demo.core.Interview.morganstanley;

import java.util.ArrayList;
import java.util.List;

public class DutchFlagProblem {

    //arrange 0,1,2 in specified order in array

    private static int[] arr = {1,0,1,0,2,1,0,1,2,0,2,2,1,2,1,2,2,1,0,0,1,0,2,0,0,0};
    public static void main(String[] args) {
        //aaproach -1  Time Complexity : O(n) requires 2 traversals
        //count number of 1's 2's and 0's and then add it in list

//        approach - 2 Best Approach Time Complexity O(n) but requires only one traversal

        //maintain index of 1 and add 0 at 0 index and 2 at start
        List<Integer> output = new ArrayList<>();
        int indexOfOne = 0;
        for(int i : arr){
          if (i == 2)
              output.add(i);
          else if (i == 1){
              output.add(indexOfOne,i);
              indexOfOne++;
          } else if (i == 0) {
              output.add(0,i);
              indexOfOne++;
          }
        }

        System.out.println(output);



    }


}
