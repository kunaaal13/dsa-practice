package com.kunaaal.RecursionPep;

import java.util.ArrayList;
import java.util.Scanner;

public class GetSubsequence {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        System.out.println(gss(str));
    }

    public static ArrayList<String> gss(String str) {
        if (str.length() == 0){
            ArrayList<String> ans = new ArrayList<>();
            ans.add("");
            return ans;
        }
        // hjhjj

        char ch = str.charAt(0);
        String rest = str.substring(1);
        ArrayList<String> arr = gss(rest);

        ArrayList<String> ans = new ArrayList<>();
        for (String s: arr){
            ans.add(""+s);
        }

        for (String s: arr)
            ans.add(ch+s);

        return ans;
    }
}
