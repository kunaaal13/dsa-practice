package com.kunaaal.RecursionAndBacktracking;

import java.util.ArrayList;
import java.util.List;

public class SubsequenceCondition {
    public static void main(String[] args) {
        int [] arr = {3,3,6,8};
        System.out.println(numSubseq(arr, 10));
    }

    static int count = 0;
    public static int numSubseq(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        getSubsets(nums, ans, 0, new ArrayList<>(), Integer.MIN_VALUE, Integer.MAX_VALUE, target);

        return count % ((int) Math.pow(10, 9) + 7);
    }

    private static void getSubsets(int[] nums, List<List<Integer>> ans, int index, ArrayList<Integer> arr, int max, int min, int target) {
        if (index == nums.length){
            // add the subset in ans
            ans.add(arr);
            if (arr.size() == 0)
                return;

            if (max + min <= target)
                count++;

            return;
        }

        // exclude case
        getSubsets(nums, ans, index+1, arr, max, min, target);

        // include case
        // the subset so far
        ArrayList<Integer> newArr = new ArrayList<>(arr);
        newArr.add(nums[index]);
        max = Math.max(max, nums[index]);
        min = Math.min(min, nums[index]);
        getSubsets(nums, ans, index + 1, newArr, max, min, target);
    }
}
