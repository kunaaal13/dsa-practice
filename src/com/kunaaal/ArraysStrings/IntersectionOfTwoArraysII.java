package com.kunaaal.ArraysStrings;

import java.util.ArrayList;
import java.util.HashMap;

public class IntersectionOfTwoArraysII {
    public static void main(String[] args) {

    }

    private static int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map1 = new HashMap<>();
        HashMap<Integer, Integer> map2 = new HashMap<>();

        ArrayList<Integer> ans = new ArrayList<>();

        // num -> freq

        for (int i: nums1) {
            if (map1.containsKey(i)){
                map1.put(i, map1.get(i) + 1);
            } else
                map1.put(i, 1);
        }

        for (int i: nums2) {
            if (map2.containsKey(i)){
                map2.put(i, map2.get(i) + 1);
            } else
                map2.put(i, 1);
        }

        for (int i: nums1) {
            if (map1.containsKey(i) && map1.get(i) != 0 && map2.containsKey(i) && map2.get(i) != 0){
                ans.add(i);
                map1.put(i, map1.get(i) - 1);
                map2.put(i, map2.get(i) - 1);
            }
        }

        int arr[] = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            arr[i] = ans.get(i);
        }

        return arr;
    }
}
