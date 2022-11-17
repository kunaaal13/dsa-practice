package com.kunaaal.BinarySearch;

public class SearchRange {
    public static void main(String[] args) {

    }

    public int[] searchRange(int[] nums, int target) {
        int [] ans = {-1, -1};
        ans[0] = firstOcc(nums, target);
        ans[1] = secondOcc(nums, target);

        return ans;
    }

    private int secondOcc(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int res = -1;

        while (start < end){
            int mid = start + (end - start) / 2;

            if (nums[mid] == target){
                res = mid;
                start = mid + 1;
            } else if (target > nums[mid]){
                start = mid + 1;

            } else if (target < nums[mid]){
                end = mid - 1;
            }
        }


        return res;
    }

    private int firstOcc(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int res = -1;

        while (start < end){
            int mid = start + (end - start) / 2;

            if (nums[mid] == target){
                res = mid;
                end = mid - 1;
            } else if (target > nums[mid]){
                start = mid + 1;

            } else if (target < nums[mid]){
                end = mid - 1;
            }
        }


        return res;
    }
}
