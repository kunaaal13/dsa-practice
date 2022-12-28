package com.kunaaal.ArraysStrings;

public class IndexOfFirstOcuurenceString {
    public static void main(String[] args) {
        String haystack = "leetcodeleeto";
        String needle = "leeto";

        int index = strStr(haystack, needle);
        System.out.println(index);
    }

    private static int strStr(String haystack, String needle) {
        // make window
        int length = needle.length();

        for (int i = 0; i <= haystack.length()-length; i++) {
            String window = haystack.substring(i, i+length);
            if (window.equals(needle))
                return i;
        }

        return -1;

    }
}
