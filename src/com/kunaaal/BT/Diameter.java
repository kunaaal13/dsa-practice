package com.kunaaal.BT;

import static com.kunaaal.BT.BinaryTree.buildTreeArr;

public class Diameter {
    public static void main(String[] args) {
        // for input its preorder
        Integer [] nodes = {1,2,3,null,null,4,5,null,null,6,null,null,7,null,null};
        TreeNode root = buildTreeArr(nodes);
        int ans = diameterOfBinaryTree(root);
    }

    private static int diameterOfBinaryTree(TreeNode root) {
        int [] diameter = new int[1];
        height(root, diameter);
        return diameter[0];
    }

    private static int height(TreeNode root, int[] diameter) {
        if (root == null)
            return 0;

        int leftHeight = height(root.left, diameter);
        int rightHeight = height(root.right, diameter);

        diameter[0] = Math.max(diameter[0], leftHeight + rightHeight);
        return 1 + Math.max(leftHeight , rightHeight);
    }
}
