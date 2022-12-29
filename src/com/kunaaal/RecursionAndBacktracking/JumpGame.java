package com.kunaaal.RecursionAndBacktracking;

public class JumpGame {
    public static void main(String[] args) {
        int [] arr = {3,2,1,0,4};
        boolean ans = canJump(arr);
        System.out.println(ans);
    }

    private static boolean canJump(int[] arr) {
        return check(arr, 0);
    }

    private static boolean check(int[] arr, int i) {
        // aage nikal gaya
        if (i == arr.length)
            return false;

        // phuch gaya
        if (i == arr.length - 1)
            return true;

        // max move jo chal sakta
        int moves = arr[i];

        // ans
        boolean ans = false;

        // har move pe check karo
        for (int j = 1; j <= moves ; j++) {
            // agar koi b true hai to true
            ans = ans || check(arr, i+j);
        }

        return ans;
    }
}
