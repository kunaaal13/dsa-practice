package com.kunaaal.BT;

import static com.kunaaal.BT.BinaryTree.buildTreeArr;

public class SumRootToLeafNumbers {
    public static void main(String[] args) {
        Integer [] nodes = {1, 2, null, 5, null, null, 3, null, 4, null, null};
        TreeNode root = buildTreeArr(nodes);
        int sum = sumNumbers(root);
    }

    private static int sumNumbers(TreeNode root) {
        return helper(root, 0);
    }

    private static int helper(TreeNode root, int num) {
        if (root == null)
            return 0;

        // update num by adding given node
        num = num * 10 + root.val;

        // leaf check
        if (root.left == null && root.right == null)
            return num;

        // left and right values
        int left = helper(root.left, num);
        int right = helper(root.right, num);

        return left + right;
    }
}
