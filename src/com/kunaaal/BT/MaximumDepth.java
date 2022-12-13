package com.kunaaal.BT;

import static com.kunaaal.BT.BinaryTree.buildTreeArr;

public class MaximumDepth {
    public static void main(String[] args) {
        // for input its preorder
        Integer [] nodes = {1,2,3,null,null,4,5,null,null,6,null,null,7,null,null};
        TreeNode root = buildTreeArr(nodes);
        int depth = maxDepth(root);
    }

    private static int maxDepth(TreeNode root) {
        // null hai matlab height 0
        if (root == null)
            return 0;

        int leftHeight = maxDepth(root.left);
        int rightHeight = maxDepth(root.right);

        // height upto this => max of left and right + 1
        return 1 + Math.max(leftHeight,rightHeight);
    }
}
