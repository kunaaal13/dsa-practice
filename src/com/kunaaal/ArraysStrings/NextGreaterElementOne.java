package com.kunaaal.ArraysStrings;

import java.util.HashMap;


public class NextGreaterElementOne {
    public static void main(String[] args) {
        int [] nums1 = {4,1,2};
        int [] nums2 = {1,3,4,2};

        int ans [] = nextGreaterElement(nums1, nums2);

        for (int i : ans)
            System.out.print(i + " ");
    }

    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int [] ans = new int[nums1.length];
        HashMap<Integer, Integer> map = new HashMap<>();

        // key -> nums2[i] value -> index
        for (int i = 0; i < nums2.length; i++) {
            map.put(nums2[i], i);
        }

        for (int i = 0; i < nums1.length; i++) {
            int index = map.get(nums1[i]);

            ans[i] = -1;

            for (int j = index; j < nums2.length; j++) {
                if (nums2[j] > nums1[i]){
                    ans[i] = nums2[j];
                    break;
                }
            }
        }


        return ans;
    }
}
