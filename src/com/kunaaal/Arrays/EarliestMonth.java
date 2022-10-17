package com.kunaaal.Arrays;

import java.util.ArrayList;
import java.util.List;

public class EarliestMonth {
    public static void main(String[] args) {
        List<Integer> s = new ArrayList<>();
        s.add(1);
        s.add(3);
        s.add(2);
        s.add(3);

        System.out.println(findEarliestMonth(s));
    }

    public static int findEarliestMonth(List<Integer> stockPrice) {
        int index = 0;
        int [] arr = new int[stockPrice.size()];

        int sum = 0;
        for (int i = 0; i < stockPrice.size(); i++) {
            arr[i] = sum + stockPrice.get(i);

            sum = arr[i];
        }

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < stockPrice.size()-1; i++) {
            int pre = arr[i] / (i + 1);

            int post = (arr[arr.length-1] - arr[i]) / (stockPrice.size() - i - 1);

            int diff = Math.abs(pre - post);

            if(diff < min){
                min = diff;
                index = i;
            }
        }
        
        
        return index+1;
    }
}
