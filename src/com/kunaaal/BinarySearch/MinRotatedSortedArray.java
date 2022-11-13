package com.kunaaal.BinarySearch;

public class MinRotatedSortedArray {
    public static void main(String[] args) {
        int [] arr = {11,13,15,17};
        System.out.println(findMin(arr));
    }

    private static int findMin(int[] nums) {
        int index = findPivot(nums);
        if (index >= nums.length || index < 0)
            return nums[0];
        else
            return nums[index];
    }

    private static int findPivot(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end){
            int mid = start + (end - start) / 2;

            if (nums[mid] >= nums[0]){
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }

        return start;
    }
}
