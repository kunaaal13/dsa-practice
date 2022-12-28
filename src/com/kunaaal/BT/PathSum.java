package com.kunaaal.BT;

import static com.kunaaal.BT.BinaryTree.buildTreeArr;

public class PathSum {
    public static void main(String[] args) {
        Integer [] nodes = {1, 2, null, 5, null, null, 3, null, 4, null, null};
        TreeNode root = buildTreeArr(nodes);
        System.out.println(hasPathSum(root, 70));
    }

    private static boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null)
            return false;

        // leaf check
        if (root.left == null && root.right == null && root.val == targetSum)
            return true;

        // agar left aur right me kahi b sahi ho raha chdd do
        return hasPathSum(root.left, targetSum - root.val) || hasPathSum(root.right, targetSum - root.val);
    }
}
