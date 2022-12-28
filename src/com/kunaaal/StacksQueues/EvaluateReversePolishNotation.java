package com.kunaaal.StacksQueues;

import java.util.Stack;

public class EvaluateReversePolishNotation {
    public static void main(String[] args) {
        String [] tokens = {"4","13","5","/","+"};
        int ans = evalRPN(tokens);
        System.out.println(ans);
    }

    private static int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < tokens.length; i++) {
            String str = tokens[i];

            if (isOperator(str)){
                if (stack.size() >= 2){
                    int second = stack.pop();
                    int first = stack.pop();

                    int result = operate(first, second, str);
                    stack.push(result);
                }
            } else {
                stack.push(Integer.parseInt(str));
            }
        }

        return stack.pop();
    }

    private static int operate(int first, int second, String operator) {
        int result = 0;

        switch (operator){
            case "+" :
                result = first + second;
                break;

            case "-" :
                result = first - second;
                break;

            case "*" :
                result = first * second;
                break;

            case "/" :
                result = first / second;
                break;

            default: result = 0;
        }

        return result;
    }

    private static boolean isOperator(String str) {
        if (str == "+" || str == "-" || str == "*" || str == "/")
            return true;

        return false;
    }


}
