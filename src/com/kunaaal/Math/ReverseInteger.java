package com.kunaaal.Math;

public class ReverseInteger {
    public static void main(String[] args) {
        int x = 1534236469;
        System.out.print(reverse(x));
    }

    private static int reverse(int x){
        long ans = 0;

        // abs to handle negative values
        while(Math.abs(x) > 0){
            ans = ans * 10 + x % 10;
            x = x / 10;

            // range of 32 bit
            if (ans > Integer.MAX_VALUE || ans < Integer.MIN_VALUE)
                return 0;
        }

        return (int) ans;
    }
}
