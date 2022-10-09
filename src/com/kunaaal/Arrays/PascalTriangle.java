package com.kunaaal.Arrays;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public static void main(String[] args) {
        System.out.println(generate(5));
    }

    public static List<List<Integer>> generate(int n) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        if (n <= 0)
            return ans;

        List<Integer> prev = new ArrayList<>();
        prev.add(1);
        ans.add(prev);

        for (int i = 2; i <= n; i++) {
            List<Integer> curr = new ArrayList<>();
            curr.add(1);

            for (int j = 0; j < prev.size() - 1; j++) {
                curr.add(prev.get(j) + prev.get(j + 1));
            }

            curr.add(1);

            ans.add(curr);

            prev = curr;
        }

        return ans;
    }
}
