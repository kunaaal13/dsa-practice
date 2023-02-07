package com.kunaaal.StacksQueues;

import java.util.Arrays;
import java.util.Map;
import java.util.Stack;

class Pair {
    int temp, index;

    Pair(int temp, int index) {
        this.temp = temp;
        this.index = index;
    }
}

public class DailyTemp {
    public static void main(String[] args) {
        int [] temp = {73,74,75,71,69,72,76,73};

        int [] ans = dailyTemperatures(temp);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] dailyTemperatures(int[] temperatures) {
        int [] ans = new int[temperatures.length];

        Stack<Pair> stack = new Stack<>();
        stack.push(new Pair(temperatures[0], 0));

        for (int i = 1; i < temperatures.length; i++) {
            int curr = temperatures[i];

            while(!stack.isEmpty() && curr > stack.peek().temp){
                Pair top = stack.pop();
                ans[top.index] = i - top.index;
            }

            stack.push(new Pair(curr, i));
        }

        return ans;
    }
}
