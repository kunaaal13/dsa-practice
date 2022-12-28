package com.kunaaal.RecursionBasics;

import java.util.ArrayList;

public class Subsequences {
    public static void main(String[] args) {
        String str = "abcde";
        ArrayList<String> arr = getSubsequences(str);
        System.out.println(arr);

        printSubsequence(str, "");
    }

    private static void printSubsequence(String str, String ans) {
        if (str.length() == 0){
            System.out.println(ans);
            return;
        }

        // char nikal lo
        char ch = str.charAt(0); // a
        String rest = str.substring(1); //bc

        // lagado
        printSubsequence(rest, ans+ch);

        // rehne do
        printSubsequence(rest, ans);

    }

    private static ArrayList<String> getSubsequences(String str) {
        if (str.length() == 0){
            ArrayList<String> res = new ArrayList<>();
            res.add("");
            return res;
        }


        // char nikal lo
        char ch = str.charAt(0); // a
        String rest = str.substring(1); //bc

        ArrayList<String> arr = getSubsequences(rest);
        ArrayList<String> ans = new ArrayList<>();

        for (String s : arr){
            // include
            ans.add(ch+s);

            // exclude
            ans.add(""+s);
        }

        return ans;
    }
}
