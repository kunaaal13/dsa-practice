package com.kunaaal.Arrays;

public class PivotIndex {
    public static void main(String[] args) {
        int [] nums = {1,7,3,6,5,6};

        System.out.println(pivotIndex(nums));
    }

    public static int pivotIndex(int[] nums) {
        int ans = -1;
        int sum = 0;
        int [] arr = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            arr[i] = nums[i] + sum;

            sum = arr[i];
        }

        for (int i = 0; i < nums.length; i++) {
            int left = arr[i] - nums[i];
            int right = arr[nums.length-1] - arr[i];

            if (left == right)
                return i;
        }


        return ans;
    }
}
