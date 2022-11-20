package com.kunaaal.StacksQueues;

import java.util.Stack;

public class BaseballGame {
    public static void main(String[] args) {
        String [] arr = {"5","2","C","D","+"};
        System.out.println(calPoints(arr));
    }

    // hhh no no
    private static int calPoints(String[] operations) {
        int sum = 0;
        Stack<Integer> stack = new Stack<>();
        int temp = 0;

        // comment

        for (int i = 0; i < operations.length; i++) {
            String str = operations[i];

            if (str.equals("C")){
                sum -= stack.pop();
            } else if (str.equals("D")){
                temp = 2 * stack.peek();
                stack.push(temp);
                sum += temp;
            } else if (str.equals("+")){
                temp = stack.pop();
                int res = temp + stack.peek();
                stack.push(temp);
                stack.push(res);
                sum += res;
            } else {
                temp = Integer.parseInt(str);
                stack.push(temp);
                sum += temp;
            }

        }

        return sum;
    }
}
