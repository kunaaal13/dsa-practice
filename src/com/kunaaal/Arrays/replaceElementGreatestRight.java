package com.kunaaal.Arrays;

import java.util.Scanner;

public class replaceElementGreatestRight {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        int [] ans = replaceElements(arr);
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }

    }

    public static int[] replaceElements(int[] arr) {
        int max = -1;

        for (int i = arr.length-1; i >= 0 ; i--) {
            int current = arr[i];

            arr[i] = max;

            max = Math.max(current, max);
        }

        return arr;
    }
}
