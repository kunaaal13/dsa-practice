package com.kunaaal.BST;

import java.util.ArrayList;

public class KthSmallestElement {
    public static void main(String[] args) {

    }

    private static int kthSmallest(TreeNode root, int k) {
        ArrayList<Integer> arr = new ArrayList<>();
        helper(root, arr);
        return arr.get(k-1);
    }

    private static void helper(TreeNode root, ArrayList<Integer> arr) {
        if (root == null)
            return;

        // left right root
        helper(root.left, arr);
        arr.add(root.val);
        helper(root.right, arr);
    }
}
