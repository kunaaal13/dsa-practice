package com.kunaaal.RecursionAndBacktracking;

import java.util.ArrayList;
import java.util.List;

public class Subsets {
    public static void main(String[] args) {
        int [] arr = {1,2,3};
        List<List<Integer>> ans = subsets(arr);
        System.out.println(ans);
    }

    private static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        getSubsets(nums, ans, 0, new ArrayList<>());
        return ans;
    }

    private static void getSubsets(int[] nums, List<List<Integer>> ans, int index, ArrayList<Integer> arr) {
        if (index == nums.length){
            // add the subset in ans
            ans.add(arr);
            return;
        }

        // exclude case
        getSubsets(nums, ans, index+1, arr);

        // include case
        // the subset so far
        ArrayList<Integer> newArr = new ArrayList<>(arr);
        newArr.add(nums[index]);
        getSubsets(nums, ans, index + 1, newArr);
    }
}
