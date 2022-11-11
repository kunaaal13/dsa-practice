package com.kunaaal.RecursionPep;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GetKpc {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str =  s.next();
        System.out.println(letterCombinations(str));
    }

    static String [] codes = {"","","abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};

    public static ArrayList<String> getKPC(String str) {
        if (str.length()==0){
            ArrayList<String> lastans = new ArrayList<>();
            lastans.add("");
            return lastans;
        }

        //678
        char ch = str.charAt(0); //6
        String left = str.substring(1); //78

        ArrayList<String> pro = getKPC(left); // 6 words of 78
        ArrayList<String> ans = new ArrayList<>();

        String code_ch = codes[ch-'0'];
        for (int i = 0; i < code_ch.length(); i++) {
            char c = code_ch.charAt(i);
            for (String s : pro) {
                ans.add(s+c);
            }
        }
        return ans;
    }

    public static List<String> letterCombinations(String str) {
        if (str.length()==0){
            ArrayList<String> lastans = new ArrayList<>();
            lastans.add("");
            return lastans;
        }

        //678
        char ch = str.charAt(0); //6
        String left = str.substring(1); //78

        List<String> pro = letterCombinations(left); // 6 words of 78
        ArrayList<String> ans = new ArrayList<>();

        String code_ch = codes[ch-'0'];
        for (int i = 0; i < code_ch.length(); i++) {
            char c = code_ch.charAt(i);
            for (String s : pro) {
                ans.add(c+s);
            }

            // haha
        }
        return ans;
    }
}
