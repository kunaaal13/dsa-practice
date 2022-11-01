package com.kunaaal.BinarySearch;

public class ArrangingCoins {
    public static void main(String[] args) {

    }

    public static int arrangeCoins(int n) {
        if(n == 1)
            return 1;
        if(n == 2)
            return 1;
        if(n == 3)
            return 2;
        long start = 2;
        long end = n/2;

        while (start <= end){
            long mid = start + (end - start)/2;

            // since sum upto n is n(n+1)/2
            long coinsFilled = mid * (mid+1)/2;

            if(coinsFilled == n)
                return (int)mid;

            else if(coinsFilled > n)
                end = mid - 1;
            else
                start = mid + 1;
        }

        return (int) end;
    }
}
