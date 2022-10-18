package com.kunaaal.ArraysStrings;

import java.util.Arrays;

public class BuySellStock1 {
    public static void main(String[] args) {
        int [] prices = {7,6,4,3,1};

        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices){
        int min = prices[0];
        int maxProfit = 0;

        for (int price : prices) {
            min = Math.min(price, min);
            int profit = price - min;
            maxProfit = Math.max(profit, maxProfit);
        }

        return maxProfit;
    }

//    public static int maxProfit(int[] prices) {
//        int [] maxArr = new int[prices.length];
//
//        int max = Integer.MIN_VALUE;
//        for (int i = prices.length-1; i >= 0; i--) {
//            maxArr[i] = max;
//
//            if (prices[i] > max)
//                max = prices[i];
//        }
//
//        max = 0;
//
//        for (int i = 0; i < prices.length-1; i++) {
//            int profit = maxArr[i] - prices[i];
//
//            if (profit > max)
//                max = profit;
//        }
//
//        return max;
//    }
}
