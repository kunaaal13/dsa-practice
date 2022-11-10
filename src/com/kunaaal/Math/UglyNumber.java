package com.kunaaal.Math;

public class UglyNumber {
    public static void main(String[] args) {

    }

    public boolean isUgly(int n) {
        if (n < 2)
            return false;

        int c = 2;

        while (n > 1) {
            if (n % c == 0) {
                if (!(c == 2 || c == 3 || c == 5))
                    return false;
                n /= c;
            } else
                c++;
        }

        return true;
   }
}
