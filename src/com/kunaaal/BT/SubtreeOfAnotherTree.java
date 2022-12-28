package com.kunaaal.BT;

public class SubtreeOfAnotherTree {
    public static void main(String[] args) {

    }

    private static boolean isSubtree(TreeNode root, TreeNode subRoot) {
        // check if root is null
        if (root == null)
            return false;

        if (isIdentical(root,subRoot))
            return true;

        return isIdentical(root.left, subRoot) || isIdentical(root.right, subRoot);
    }

    private static boolean isIdentical(TreeNode node1, TreeNode node2) {
        // If any of the nodes is null, then both must be null
        if (node1 == null || node2 == null) {
            return node1 == null && node2 == null;
        }

        // If both nodes are non-empty, then they are identical only if
        // 1. Their values are equal
        // 2. Their left subtrees are identical
        // 3. Their right subtrees are identical
        return node1.val == node2.val && isIdentical(node1.left, node2.left) && isIdentical(node1.right, node2.right);
    }
}
