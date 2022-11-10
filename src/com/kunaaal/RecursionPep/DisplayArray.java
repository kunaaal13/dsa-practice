package com.kunaaal.RecursionPep;

import java.util.Scanner;

public class DisplayArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr [] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }

        displayArrReverse(arr, 0);
    }

    public static void displayArr(int[] arr, int index){
        if (index == arr.length)
            return;

        System.out.println(arr[index]);
        displayArr(arr, index + 1);
    }

    public static void displayArrReverse(int[] arr, int index) {
        if (index == arr.length)
            return;

        displayArrReverse(arr, index + 1);
        System.out.println(arr[index]);
    }
}
