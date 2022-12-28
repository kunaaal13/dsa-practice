package com.kunaaal.RecursionBasics;

public class DisplayArr {
    public static void main(String[] args) {
        int arr [] = {1,2,3,4,5};
        displayArr(arr, 0);
        displayArrRev(arr, 0);
    }

    private static void displayArrRev(int[] arr, int i) {
        if (i == arr.length)
            return;

        displayArrRev(arr, i+1);
        System.out.println(arr[i]);
    }

    private static void displayArr(int[] arr, int i) {
        if (i == arr.length)
            return;

        System.out.println(arr[i]);
        displayArr(arr, i+1);
    }
}
