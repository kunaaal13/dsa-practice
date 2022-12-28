package com.kunaaal.RecursionBasics;

import java.util.ArrayList;
import java.util.List;

public class Subsets {
    public static void main(String[] args) {
        int [] nums = {1,2,3};
        List<List<Integer>> subsets = subsets(nums);
        System.out.println(subsets);
    }

    private static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        getSubsets(nums, ans, 0, new ArrayList<Integer>());
        return ans;
    }

    private static void getSubsets(int[] nums, List<List<Integer>> ans, int i, ArrayList<Integer> arr) {
        if (i == nums.length){
            ans.add(arr);
            return;
        }

        // exclude
        getSubsets(nums, ans, i+1, arr);

        // include
        ArrayList<Integer> res = new ArrayList<>(arr); // subset so far
        res.add(nums[i]);
        getSubsets(nums, ans, i+1, res);

    }


}
