package com.kunaaal.BinarySearch;

public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
        int [] nums = {4,5,6,7,0,1,2};
        int target = 0;
        System.out.println(search(nums, target));
    }

    public static int search(int[] nums, int target) {
        if(nums.length==1){
            if(nums[0]==target)
                return 0;
            else
                return -1;
        }

        int pivot = findPivot(nums);
        if (pivot==-1){
            //normal binary search
            return BS(nums,target,0,nums.length-1);
        } else{
            return Math.max(BS(nums,target,0,pivot),BS(nums,target,pivot+1, nums.length-1));
        }

    }

    private static int BS(int[] nums, int target, int s, int e) {
        while (s<=e){
            int mid = s + (e-s)/2;
            if(nums[mid]>target)
                e = mid-1;
            else if(nums[mid]==target)
                return mid;
            else
                s = mid + 1;
        }
        return -1;
    }

    private static int findPivot(int[] nums) {
        int start = 0;
        int end = nums.length-1;
        while (start<=end){
            int mid = start + (end-start)/2;
            if (nums[mid] < nums[end])
                end = mid;
            else
                start = mid + 1;
        }
        return start;
    }
}
