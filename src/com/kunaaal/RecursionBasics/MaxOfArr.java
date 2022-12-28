package com.kunaaal.RecursionBasics;

public class MaxOfArr {
    public static void main(String[] args) {
        int [] arr = {1,2,3,-1,2,0};
        int ans = getMax(arr, 0);
        System.out.println(ans);
    }

    private static int getMax(int[] arr, int i) {
        if (i == arr.length - 1)
            return arr[i];

        int max = Math.max(arr[i], getMax(arr, i+1));
        return max;
    }
}
