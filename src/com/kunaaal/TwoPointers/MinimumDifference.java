package com.kunaaal.TwoPointers;

import java.util.Arrays;

public class MinimumDifference {
    public static void main(String[] args) {
        int [] nums = {9,4,1,7};
        System.out.println(minimumDifference(nums, 2));
    }

    public static int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int diff = Integer.MAX_VALUE;

        int i = 0;
        int j = k-1;

        while (j < nums.length){
            diff = Math.min(diff, nums[j] - nums[i]);
            i++;
            j++;
        }

        return diff;
    }
}
