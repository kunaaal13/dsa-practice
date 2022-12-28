package com.kunaaal.BT;

import static com.kunaaal.BT.BinaryTree.buildTreeArr;

public class SymmetricTree {
    public static void main(String[] args) {
        // for input its preorder
        Integer [] nodes = {1,2,3,null,null,4,null,null,2,4,null,null,3,null,null};
        TreeNode root = buildTreeArr(nodes);
        System.out.println(isSymmetric(root));
    }

    private static boolean isSymmetric(TreeNode root) {
        // it will be true if
        // 1. root is null or
        // 2. its subtrees are exactly mirror
        return root == null || isMirror(root.left, root.right);
    }

    private static boolean isMirror(TreeNode Left, TreeNode Right) {
        // dono null matlab same true
        if (Left == null && Right == null)
            return true;

        // agar koi ek hi null to matlab same nahi
        if (Left == null || Right == null)
            return false;

        // values check
        if (Left.val != Right.val)
            return false;

        // iska left uske right ke sath equal aur iska right uske left
        return isMirror(Left.left, Right.right) && isMirror(Left.right, Right.left);
    }
}
