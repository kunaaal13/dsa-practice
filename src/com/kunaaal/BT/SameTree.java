package com.kunaaal.BT;

import static com.kunaaal.BT.BinaryTree.buildTreeArr;

public class SameTree {
    public static void main(String[] args) {
        // for input its preorder
        Integer [] nodes = {1,2,3,null,null,4,5,null,null,6,null,null,7,null,null};
        TreeNode root1 = buildTreeArr(nodes);
        Integer [] nodes2 = {1,2,3,null,null,4,5,null,null,6,null,null,7,null,null};
        TreeNode root2 = buildTreeArr(nodes2);
        isSameTree(root1, root2);
    }

    private static boolean isSameTree(TreeNode p, TreeNode q) {
        // check if totally equal
        if (p == q)
            return true;

        if ((p == null && q != null) || (p != null && q == null) || (p.val != q.val))
            return false;

        // ab left and right me check karenge dono ka and lenge
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
