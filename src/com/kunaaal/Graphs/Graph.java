package com.kunaaal.Graphs;

import java.util.Scanner;

public class Graph {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int e = s.nextInt();

        int [][] edges = new int[n][n];

        for (int i = 0; i < e; i++) {
            int fv = s.nextInt();
            int sv = s.nextInt();

            edges[fv][sv] = 1;
            edges[sv][fv] = 1;
        }
    }
}
