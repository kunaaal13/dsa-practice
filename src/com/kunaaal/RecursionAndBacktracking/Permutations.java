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
        List<List<Integer>> list = new ArrayList<>();
        backtrack(list, new ArrayList<>(), nums);
        return list;
    }

    private static void backtrack(List<List<Integer>> list, ArrayList<Integer> arr, int[] nums) {
        if (arr.size() == nums.length){
            list.add(new ArrayList<>(arr));
            return;
        }


        for (int i = 0; i < nums.length; i++) {
            // agar pehle hi hai to skip kardo
            if (arr.contains(nums[i]))
                continue;

            // arr me add kardo
            arr.add(nums[i]);

            backtrack(list, arr, nums);

            // arr se nikaldo jo add kiya
            arr.remove(arr.size()-1);
        }
    }

}
