package com.kunaaal.BT;

import static com.kunaaal.BT.BinaryTree.buildTreeArr;

public class MaximumPathSum {
    public static void main(String[] args) {
        // for input its preorder
        Integer [] nodes = {1,2,3,null,null,4,5,null,null,6,null,null,7,null,null};
        TreeNode root = buildTreeArr(nodes);
        System.out.println(maxPathSum(root));
    }

    private static int maxPathSum(TreeNode root) {
        int maxValue [] = new int[1];
        maxValue[0] = Integer.MIN_VALUE;
        maxPathDown(root, maxValue);
        return maxValue[0];
    }

    private static int maxPathDown(TreeNode root, int[] maxValue) {
        if (root == null)
            return 0;

        // left aur right calculate karo if negative to zero lelo value inki
        int left = Math.max(0, maxPathDown(root.left, maxValue));
        int right = Math.max(0, maxPathDown(root.right, maxValue));

        // left + right + val => for prticular node
        maxValue[0] = Math.max(maxValue[0], left + right + root.val);
        return Math.max(left,right) + root.val;
    }
}
