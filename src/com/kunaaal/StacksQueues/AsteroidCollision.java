package com.kunaaal.StacksQueues;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Stack;

public class AsteroidCollision {
    public static void main(String[] args) {
        int [] asteroids = {10,2,-5};
        int [] ans = asteroidCollision(asteroids);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] asteroidCollision(int[] asteroids) {
        LinkedList<Integer> s = new LinkedList<>();

        for (int asteroid: asteroids) {
            if (asteroid > 0)
                s.add(asteroid);
            else {
                while (!s.isEmpty() && s.getLast() > 0 && s.getLast() < -asteroid)
                    s.pollLast();
                if (!s.isEmpty() && s.getLast() == -asteroid)
                    s.pollLast();
                else if (s.isEmpty() || s.getLast() < 0)
                    s.add(asteroid);
            }
        }

        return s.stream().mapToInt(i->i).toArray();
    }


}
