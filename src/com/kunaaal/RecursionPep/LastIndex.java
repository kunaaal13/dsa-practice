package com.kunaaal.RecursionPep;

import java.util.Scanner;

public class LastIndex {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr [] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
        int x = s.nextInt();

        System.out.println(lastIndex(arr, 0, x));
    }

    public static int lastIndex(int[] arr, int index, int x){
        if (index == arr.length)
            return -1;

        // dekho aage hai kya
        int aage = lastIndex(arr, index + 1, x);
        if (aage == -1){
            if (arr[index] == x)
                return index;
            else
                return -1;
        } else
            return aage;
    }
}
