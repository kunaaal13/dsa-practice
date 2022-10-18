package com.kunaaal.ArraysStrings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class encodeDecodeStrings {
    public static void main(String[] args) {
        List<String> strs = new ArrayList<>(Arrays.asList("we", "say", ":", "yes"));
        String encoded = encode(strs);
        System.out.println(encoded);
        List<String> decoded = decode(encoded);
        System.out.println(decoded);
    }

    /*
     * @param strs: a list of strings
     * @return: encodes a list of strings to a single string.
     */
    public static String encode(List<String> strs) {
        // write your code here
        String ans = "";
        String str = "/-/";

        for (String s : strs){
            ans += s + str;
        }

        return ans;

    }

    /*
     * @param str: A string
     * @return: dcodes a single string to a list of strings
     */
    public static List<String> decode(String str) {
        // write your code here
        String [] split = str.split("/-/");

        return Arrays.asList(split);
    }
}
