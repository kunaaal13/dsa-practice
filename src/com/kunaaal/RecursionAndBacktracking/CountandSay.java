package com.kunaaal.RecursionAndBacktracking;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class CountandSay {
    public static void main(String[] args) {
        int n = 4;
        String ans = countAndSay(n);
        System.out.println(ans);
    }

    private static String countAndSay(int n) {
        if (n == 1)
            return "1";

        String s = countAndSay(n-1);

        int count = 1 , i = 0;

        StringBuilder str = new StringBuilder();

        while(i < s.length()){ // main loop

            char ch = s.charAt(i++); // store charcter at i and increment i

            while(i < s.length() && s.charAt(i) == ch){ // create a loop to count the number of adjacent characters in string
                i++;    count++;
            }

            str.append(count).append(ch); // add count and current character to str
            count = 1; // reset count to 1
        }

        return str.toString();
    }
}
