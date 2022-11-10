package com.kunaaal.RecursionPep;

import java.util.Scanner;

public class FirstIndex {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr [] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
        int x = s.nextInt();

        System.out.println(firstIndex(arr, 0, x));
    }

    public static int firstIndex(int[] arr, int index, int x){
        if (index == arr.length)
            return -1;

        // puch piche se mila kya
        int aage = firstIndex(arr, index + 1, x);

        if (arr[index] == x)
            return index;
        else
            return aage;
    }
}
