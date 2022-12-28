package com.kunaaal.RecursionBasics;

import java.util.Arrays;

public class IndexOfOccurencesArr {
    public static void main(String[] args) {
        int [] arr = {6,15,11,40,4,4,9};
        int firstIndex = getFirst(arr, 0, 4);
        System.out.println("first "+firstIndex);

        int lastIndex = getLast(arr, 0, 4);
        System.out.println("last"+lastIndex);

        int [] allIndices = getAllIndices(arr, 0, 4, 0);
        System.out.println(Arrays.toString(allIndices));
    }

    // jate time count karlo kitne equal hai, utne size ka arr banalo aur add kardo usme
    private static int[] getAllIndices(int[] arr, int i, int x, int count) {
        if (i == arr.length){
            return new int[count];
        }

        if (arr[i] == x){
            int [] res = getAllIndices(arr, i+1, x, count+1);
            res[count] = i;
            return res;
        }

        int [] res = getAllIndices(arr, i+1, x, count);
        return res;
    }

    private static int getLast(int[] arr, int i, int x) {
        if (i == arr.length - 1){
            if (arr[i] == x)
                return i;

            return -1;
        }


        // aage ka dekho agar hai to vo return karo varna ye
        int lastIndex = getLast(arr, i+1, x);

        if (lastIndex != -1)
            return lastIndex;

        if (arr[i] == x)
            return i;

        return lastIndex;

    }

    private static int getFirst(int[] arr, int i, int x) {
        if (i == arr.length - 1){
            if (arr[i] == x)
                return i;

            return -1;
        }

        // aage ka maang lo
        int firstInRest = getFirst(arr, i+1, x);

        if (arr[i] != x)
            return firstInRest;

        return i;

    }
}
