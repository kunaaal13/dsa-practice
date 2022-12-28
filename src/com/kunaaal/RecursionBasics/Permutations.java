package com.kunaaal.RecursionBasics;

public class Permutations {
    public static void main(String[] args) {
        String str = "abc";
        printPermutations(str, "");
    }

    private static void printPermutations(String str, String ans) {
        if (str.length() == 0){
            System.out.println(ans);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String left = str.substring(0,i);
            String right = str.substring(i+1);

            // string without ch
            String rest = left + right;
            printPermutations(rest, ans+ch);
        }
    }
}
