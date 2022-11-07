package com.kunaaal.TwoPointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {
        int [] nums = {-1,0,1,2,-1,-4};

        System.out.println(threeSum(nums));
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length-2; i++) {
            int one = nums[i];

            for (int j = i+1; j < nums.length-1; j++) {
                int two = nums[j];

                int three = 0 - one - two;
                int search = binarySearch(nums, j+1, three);
                if(search < 0)
                    continue;

                ArrayList<Integer> li = new ArrayList<>();
                li.add(one);
                li.add(two);
                li.add(three);

                if (!ans.contains(li))
                    ans.add(li);


            }
        }


        return ans;
    }

    private static int binarySearch(int[] nums, int start, int target) {
        int end = nums.length-1;

        while (start <= end){
            int mid = start + (end - start) / 2;

            if (nums[mid] > target){
                end = mid - 1;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                return mid;
            }
        }

        return -1;
    }


}
