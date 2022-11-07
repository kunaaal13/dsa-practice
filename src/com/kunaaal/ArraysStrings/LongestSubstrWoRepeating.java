package com.kunaaal.ArraysStrings;

import java.util.HashSet;

public class LongestSubstrWoRepeating {
    public static void main(String[] args) {
        String str = "pwwkew";
        System.out.println(lengthOfLongestSubstring(str));
    }

    public static int lengthOfLongestSubstring(String str) {
        int ans = 0;

        for (int i = 0; i < str.length(); i++) {
            HashSet<Character> set = new HashSet<>();
            for (int j = i; j < str.length(); j++) {
                char ch = str.charAt(j);
                if (set.contains(ch)){
                    break;
                } else {
                    set.add(ch);
                }
            }

            if (ans < set.size())
                ans = set.size();

        }

        return ans;
    }
}
