package com.kunaaal.RecursionPep;

import java.util.Scanner;

public class PrintDecreasing {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        pdi(n);
    }

    public static void printDecreasing(int n){
        if (n < 1)
            return;


        printDecreasing(n-1);
        System.out.println(n);
    }

    public static void printIncreasing(int n){
        if (n < 1)
            return;

        printIncreasing(n-1);
        System.out.println(n);
    }

    public static void pdi(int n){
        if (n < 1)
            return;

        System.out.println(n);
        pdi(n-1);
        System.out.println(n);
    }
}
