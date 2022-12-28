package com.kunaaal.BitManipulation;

public class SingleNumber {
    public static void main(String[] args) {
        int [] arr = {4,1,2,1,2};
        System.out.println(singleNumber(arr));
    }

    private static int singleNumber(int[] nums) {
        int ans = 0;

        for (int i = 0; i < nums.length; i++) {
            ans ^= nums[i];
        }

        return ans;
    }
}
