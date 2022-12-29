package com.kunaaal.RecursionAndBacktracking;

import java.util.ArrayList;
import java.util.List;

public class KeyPad {
    public static void main(String[] args) {
        String digits = "2";
        List<String> ans = letterCombinations(digits);
        System.out.println(ans);
    }

    private static List<String> letterCombinations(String str) {
        List<String> ans = new ArrayList<>();

        if (str.length() == 0)
            return ans;

        return getCombinations(str);

    }

    static String codes [] = {"","","abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz", ""};

    private static List<String> getCombinations(String str) {
        if (str.length() == 0){
            List<String> last = new ArrayList<>();
            last.add("");
            return last;
        }


        // 678
        // char nikal lo
        char ch = str.charAt(0); // 6
        String rest = str.substring(1); // 78

        // 78 ke sare combinations
        List<String> right = getCombinations(rest);
        
        List<String> ans = new ArrayList<>();

        // codes possible for given no
        String code_ch = codes[ch-'0'];

        for (int i = 0; i < code_ch.length(); i++) {
            // abc
            char c = code_ch.charAt(i); // a

            // har kisi right ke ans ke aage lagado
            for (String s: right){
                ans.add(c + s);
            }
        }

        return ans;
    }
}
