package com.kunaaal.BT;

import static com.kunaaal.BT.BinaryTree.buildTreeArr;

public class BalancedBinaryTree {
    public static void main(String[] args) {
        // for input its preorder
        Integer [] nodes = {1,2,3,null,null,4,5,null,null,6,null,null,7,null,null};
        TreeNode root = buildTreeArr(nodes);
        System.out.println(isBalanced(root));
    }

    private static boolean isBalanced(TreeNode root) {
        return dfsHeight(root) != -1;
    }

    private static int dfsHeight(TreeNode root) {
        // null means zero
        if (root == null)
            return 0;

        // left calculate karo agar -1 aa raha matlab kahi pehle balanced nahi tha
        // iss case me fir se -1 bhj do aage
        int leftHeight = dfsHeight(root.left);
        if (leftHeight == -1)
            return -1;

        int rightHeight = dfsHeight(root.right);
        if (rightHeight == -1)
            return -1;

        if (Math.abs(leftHeight - rightHeight) > 1)
            return -1;

        return Math.max(leftHeight, rightHeight) + 1;
    }
}
