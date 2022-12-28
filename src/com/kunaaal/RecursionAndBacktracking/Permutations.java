package com.kunaaal.RecursionAndBacktracking;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
    public static void main(String[] args) {
        int [] nums = {1,2,3};
        List<List<Integer>> permutations = permute(nums);
        System.out.println(permutations);
    }

    private static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        getPermute(nums,ans,0,new ArrayList<>());
        return ans;
    }

    private static void getPermute(int[] nums, List<List<Integer>> ans, int i, ArrayList<Integer> arr) {
        if (i == nums.length){
            ans.add(arr);
            return;
        }


    }
}
