package com.kunaaal.Arrays;

public class validAnagrams {
    public static void main(String[] args) {
        String s = "rat";
        String t = "car";

        System.out.println(isAnagram(s, t));
    }

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;

        int [] arr = new int[26];

        for (int i = 0; i < s.length(); i++) {
            int index = s.charAt(i) - 97;
            arr[index]++;

            index = t.charAt(i) - 97;
            arr[index]--;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0)
                return false;
        }

        return true;
    }
}
