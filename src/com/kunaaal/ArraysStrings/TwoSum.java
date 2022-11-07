package com.kunaaal.ArraysStrings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class TwoSum {
    public static void main(String[] args) {
        int [] nums = {2,7,11,15};
        int target = 9;

        System.out.println(Arrays.toString(twoSum(nums, target)));
    }

    public static int[] twoSum(int[] nums, int target) {
        int [] ans = new int[2];

        // key -> integer value-> index
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(nums[0], 0);

        for (int i = 1; i < nums.length; i++) {
            int second = target - nums[i];
            if (map.containsKey(second)){
                ans[0] = map.get(second);
                ans[1] = i;
                return ans;
            }

            map.put(nums[i], i);

        }

        return ans;
    }

//    private static int binarySearch(int[] nums, int start, int target) {
//        int end = nums.length;
//
//        while (start <= end){
//            int mid = start + (end - start) / 2;
//
//            if (nums[mid] > target){
//                end = mid - 1;
//            } else if (nums[mid] < target) {
//                start = mid + 1;
//            } else {
//                return mid;
//            }
//        }
//
//        return -1;
//    }
}
