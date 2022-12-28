package com.kunaaal.RecursionBasics;

public class Power {
    public static void main(String[] args) {
//        int ans = powerLinear(3,5);
        int ans = powerLog(3,5);
        System.out.println(ans);
    }

    private static int powerLog(int n, int k) {
        if (k == 0)
            return 1;

        int ans = powerLog(n, k/2) * powerLog(n, k/2);

        // odd
        if (k % 2 != 0)
            ans = ans * n;

        return ans;
    }

    // n raised to power k
    private static int powerLinear(int n, int k) {
        if (k == 0)
            return 1;

        int ans = n * powerLinear(n, k-1);
        return ans;
    }
}
