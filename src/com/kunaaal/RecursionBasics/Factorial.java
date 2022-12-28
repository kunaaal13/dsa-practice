package com.kunaaal.RecursionBasics;

public class Factorial {
    public static void main(String[] args) {
        int ans = factorial(5);
        System.out.println(ans);
    }

    private static int factorial(int n) {
        // base case
        if (n == 0)
            return 1;

        // basic idea : fact(5) = 5 * fact(4)
        int ans = n * factorial(n-1);
        return ans;
    }
}
