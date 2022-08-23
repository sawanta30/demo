package com.example.demo.dp;

import java.util.Arrays;

public class MinCoins {

    public static void main(String[] args) {
        int[] a = {1,5,7};
        int sum = 18;
        int[] dp = new int[sum+1];
        Arrays.fill(dp,-1);
        dp[0] = 0;
        System.out.println(minCoins(sum,a,dp));
        System.out.println(Arrays.toString(dp));
    }


    private static int minCoins(int money, int[] a,int[] dp){
        if (money == 0)
            return 0;
        int finalAns = Integer.MAX_VALUE;
        for (int i =0; i< a.length;i++){
            if (money-a[i]>=0) {
                int currentAns = 0;
                if (dp[money-a[i]] != -1){
                    currentAns = dp[money-a[i]];
                }else{
                    currentAns = minCoins(money-a[i],a,dp);

                }

                if (currentAns != Integer.MAX_VALUE && currentAns+1 < finalAns)
                    finalAns = currentAns+1;

            }
        }
        return dp[money] = finalAns;

    }
}
