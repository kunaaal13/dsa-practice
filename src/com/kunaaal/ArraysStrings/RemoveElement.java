package com.kunaaal.ArraysStrings;

import static com.kunaaal.ArraysStrings.FindDisappearedNumbers.swap;

public class RemoveElement {
    public static void main(String[] args) {
        int [] nums = {0,1,2,2,3,0,4,2};
        int val = 2;

        System.out.print(removeElement(nums, val));
    }

    public static int removeElement(int[] nums, int val) {
        int ans = 0;

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == val){

                for (int j = i+1; j < nums.length; j++) {
                    if (nums[j] != val){
                        swap(nums, i, j);
                        break;
                    }
                }
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val)
                break;

            ans++;
        }




        return ans;
    }
}
