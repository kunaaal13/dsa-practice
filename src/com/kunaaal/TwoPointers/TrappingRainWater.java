package com.kunaaal.TwoPointers;

public class TrappingRainWater {
    public static void main(String[] args) {

    }

    public static int trap(int[] height) {
        int [] left = new int[height.length];
        int [] right = new int[height.length];
        int max = 0;
        int c = 0;

        for (int i = 0; i < height.length; i++) {
            left[i] = Math.max(height[i], max);
            max = left[i];
        }

        max = height[height.length - 1];
        for (int i = height.length - 1; i >= 0; i--) {
            right[i] = Math.max(height[i], max);
            max = right[i];
        }

        for (int i = 0; i < height.length; i++) {
            c = c + Math.min(left[i] , right[i]) - height[i];
        }

        return c;
    }
}
