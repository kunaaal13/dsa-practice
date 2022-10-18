package com.kunaaal.ArraysStrings;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class isomorphicStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();

        System.out.println(isIsomorphic(s,t));
    }

    public static boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> map = new HashMap<>();
        HashSet<Character> setS = new HashSet<>();
        HashSet<Character> setT = new HashSet<>();

        for (char c : s.toCharArray())
            setS.add(c);

        for (char c : t.toCharArray())
            setT.add(c);

        if (setT.size() != setS.size())
            return false;

        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))){

                if (!map.get(s.charAt(i)).equals(t.charAt(i)))
                    return false;
            } else {
                map.put(s.charAt(i), t.charAt(i));
            }
        }




        return true;
    }
}
