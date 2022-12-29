package com.kunaaal.RecursionAndBacktracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSumII {
    public static void main(String[] args) {
        int [] nums = {10,1,2,7,6,1,5};
        List<List<Integer>> ans = combinationSum2(nums, 8);
        System.out.println(ans);
    }

    private static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(list, new ArrayList<>(), candidates, target, 0);
        return list;
    }

    private static void backtrack(List<List<Integer>> list, List<Integer> tempList, int [] nums, int remain, int start){
        // aage nikal gaye
        if (remain < 0)
            return;

        // phuch gaye
        if (remain == 0){
            list.add(new ArrayList<>(tempList));
            return;
        }

        for (int i = start; i < nums.length; i++) {
            // skip duplicates matlab same lagatar nahi aane chahiye
            if(i > start && nums[i] == nums[i-1])
                continue;

            tempList.add(nums[i]);
            backtrack(list, tempList, nums, remain - nums[i], i+1);
            tempList.remove(tempList.size() - 1);
        }

    }
}
