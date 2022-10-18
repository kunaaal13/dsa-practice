package com.kunaaal.ArraysStrings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MajorityElement {
    public static void main(String[] args) {
        int [] nums = {3,2,3};
        System.out.println(majorityElement(nums));

        List<Integer> num = new ArrayList<>();
    }

    public static int majorityElement(int[] nums) {
        int ans = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])){
                int val = map.get(nums[i]) + 1;
                if (val > nums.length / 2)
                    return nums[i];
                map.put(nums[i], val);
            } else {
                map.put(nums[i], 1);
            }
        }

        return ans;
    }
}
