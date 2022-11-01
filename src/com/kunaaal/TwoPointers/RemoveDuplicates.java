package com.kunaaal.TwoPointers;

import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int [] nums = {1,1,2};
        System.out.println(removeDuplicates(nums));
    }

    public static int removeDuplicates(int[] nums) {
        int i = 0;

        for (int j = 1; j < nums.length; j++) {
            // check if same
            if (nums[i] != nums[j]){
                i++;
                nums[i] = nums[j];
            }
        }

        System.out.println(Arrays.toString(nums));

        return i+1;
    }
}
