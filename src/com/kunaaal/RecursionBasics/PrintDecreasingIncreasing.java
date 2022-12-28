package com.kunaaal.RecursionBasics;

public class PrintDecreasingIncreasing {
    public static void main(String[] args) {
//        printDecreasing(5);
//        printIncreasing(5);
        printDecreasingIncreasing(5);
    }

    // 3 2 1 1 2 3
    private static void printDecreasingIncreasing(int n) {
        // base case
        if (n == 0)
            return;

        // while going down print decreasing
        System.out.println(n);

        // call
        printDecreasingIncreasing(n-1);

        // while coming back
        System.out.println(n);
    }

    private static void printIncreasing(int n) {
        // base case
        if (n == 0)
            return;

        printIncreasing(n-1);
        System.out.println(n);

    }

    private static void printDecreasing(int n) {
        // base case
        if (n == 0)
            return;

        System.out.println(n);
        printDecreasing(n-1);
    }
}
