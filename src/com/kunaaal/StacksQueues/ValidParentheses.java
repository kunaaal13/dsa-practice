package com.kunaaal.StacksQueues;

import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        String s = "(]";
        System.out.println(isValid(s));
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            // check if opening
            if (c == '{' || c == '[' || c == '('){
                stack.push(c);
            } else {
                if (stack.isEmpty()){
                    return false;
                }

                char n = stack.peek();
                stack.pop();

                if (c == ')' && n =='('){

                } else if (c == '}' && n == '{'){

                } else if (c == ']' && n == '['){

                } else {
                    return false;
                }
            }
        }


        return true;
    }
}
