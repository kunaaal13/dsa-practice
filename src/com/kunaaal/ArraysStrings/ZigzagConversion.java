package com.kunaaal.ArraysStrings;

public class ZigzagConversion {
    public static void main(String[] args) {
        System.out.println(convert("PAYPALISHIRING", 3));
    }

    public static String convert(String s, int numRows) {
        if (numRows == 1)
            return s;

        String ans = "";

        for (int row = 0; row < numRows; row++) {
            int increment = 2 * (numRows - 1);

            // for each row
            for (int i = row; i < s.length(); i = i + increment) {
                // increment ke gap wale
                ans += s.charAt(i);

                // check karo start or last ki rows to nahi hai
                if (row > 0 && row < numRows-1){
                    // ye check karlo bahar to nahi jayega
                    if (i + increment - 2 * row < s.length()){
                        ans += s.charAt(i + increment - 2 * row);
                    }
                }
            }
        }


        return ans;
    }
}
