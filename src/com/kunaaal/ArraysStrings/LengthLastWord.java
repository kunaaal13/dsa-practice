package com.kunaaal.ArraysStrings;

public class LengthLastWord {
    public static void main(String[] args) {
        String s = "luffy is still joyboy";

        System.out.println(lengthOfLastWord(s));
    }

    public static int lengthOfLastWord(String s) {
        int length = 0;
        boolean isWord = false;

        for (int i = s.length()-1; i >= 0; i--) {
            if (!isWord){
                if (s.charAt(i) != ' '){
                    length++;
                    isWord = true;
                }
            } else {
                if (s.charAt(i) == ' '){
                    return length;
                } else {
                    length++;
                }
            }
        }



        return length;
    }
}
