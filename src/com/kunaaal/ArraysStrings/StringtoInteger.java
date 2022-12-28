package com.kunaaal.ArraysStrings;

public class StringtoInteger {
    public static void main(String[] args) {

    }

    private static int myAtoi(String s) {
        // trim spaces
        s = s.trim();
        int ans = 0;
        boolean isPositive = true;
        int i = 0;

        if(s.length() == 0)
            return 0;

        // handle signs
        if (s.charAt(0) == '-' || s.charAt(0) == '+'){
            if(s.charAt(0) == '-')
                isPositive = false;
            i++;

            if(s.length() == 1)
                return 0;

            if (s.charAt(i) == '-' || s.charAt(i) == '+')
                return 0;
        }

        for (; i < s.length(); i++) {
            if (s.charAt(i) >= 48 && s.charAt(i) <= 57){
                //check if total will be overflow after 10 times and add digit
                if(Integer.MAX_VALUE/10 < ans || Integer.MAX_VALUE/10 == ans && Integer.MAX_VALUE %10 < s.charAt(i) - '0')
                    return isPositive ? Integer.MAX_VALUE : Integer.MIN_VALUE;

                ans = ans * 10 + s.charAt(i) - '0';
            } else
                break;

        }


        if (!isPositive)
            return ans * -1;

        return ans;

    }

}
