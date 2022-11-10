package com.kunaaal.RecursionPep;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int n = s.nextInt();
        System.out.println(powerLog(x,n));
    }

    public static int power(int x, int n){
        if (n == 0)
            return 1;

        int ans = x * power(x, n-1);
        return ans;
    }

    public static int powerLog(int x, int n){
        if (n == 0)
            return 1;

        int half = powerLog(x, n/2);
        int ans = half * half;

        if (n % 2 == 0)
            return ans;

        return ans * x;

    }
}
