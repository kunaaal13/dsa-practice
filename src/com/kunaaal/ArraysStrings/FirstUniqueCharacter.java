package com.kunaaal.ArraysStrings;

import java.util.HashMap;
import java.util.HashSet;

public class FirstUniqueCharacter {
    public static void main(String[] args) {

    }

    public int firstUniqChar(String s) {
//        HashMap<Character, Integer> map = new HashMap<>();
//
//        for (int i = 0; i < s.length(); i++) {
//            char ch = s.charAt(i);
//            if (map.containsKey(ch)){
//                // value badhao
//                map.put(ch, map.get(ch) + 1);
//            } else {
//                map.put(ch, 1);
//            }
//        }
//
//        for (int i = 0; i < s.length(); i++) {
//            char ch = s.charAt(i);
//
//            if (map.get(ch) == 1)
//                return i;
//        }
//
//        return -1;

        HashSet<Character> set = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (set.contains(ch))
                continue;

            set.add(ch);

            if (s.lastIndexOf(ch) == i)
                return i;
        }

        return -1;
    }
}
