package com.kunaaal.Arrays;

import java.util.HashSet;

public class IsSubsequence {
    public static void main(String[] args) {
        String s = "aec";
        String t = "abcde";

        System.out.println(isSubsequence(s,t));
    }

    public static boolean isSubsequence(String s, String t) {
        HashSet<Character> set = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            set.add(s.charAt(i));
        }

        int i = 0;
        int j = 0;

        while (i < s.length() && j < t.length()){
            if (s.charAt(i) == t.charAt(j)){
                i++;
            } else {
                // does not match
                if (set.contains(t.charAt(j)))
                    return false;
            }
            j++;
        }


        return true;
    }
}
