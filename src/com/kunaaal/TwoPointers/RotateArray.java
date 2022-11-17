package com.kunaaal.TwoPointers;

public class RotateArray {
    public static void main(String[] args) {

    }

    public void rotate(int[] nums, int k) {
        if (k > nums.length)
            k = k % nums.length;


        reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);



    }
    private static void reverse(int[] arr, int i, int j) {
        while (i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}
