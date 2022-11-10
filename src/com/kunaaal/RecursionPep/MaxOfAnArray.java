package com.kunaaal.RecursionPep;

import java.util.Scanner;

public class MaxOfAnArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr [] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }

        System.out.println(maxOfArray(arr,0));
    }

    public static int maxOfArray(int[] arr, int index){
        if (index == arr.length)
            return Integer.MIN_VALUE;

        int prevMax = maxOfArray(arr, index + 1);
        if (arr[index] > prevMax)
            return arr[index];
        else
            return prevMax;
    }
}
