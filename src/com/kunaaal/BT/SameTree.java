package com.kunaaal.BT;

import static com.kunaaal.BT.BinaryTree.buildTreeArr;

public class SameTree {
    public static void main(String[] args) {
//        hahaha
        int nodes [] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        TreeNode root1 = buildTreeArr(nodes);
        TreeNode root2 = buildTreeArr(nodes);

        System.out.println(isSameTree(root1, root2));

    }

    private static boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == q)
            return true;

        if ((p == null && q != null) || (p != null && q == null) || (p.val != q.val))
            return false;

        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
