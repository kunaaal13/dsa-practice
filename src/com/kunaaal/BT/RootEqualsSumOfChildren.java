package com.kunaaal.BT;

import static com.kunaaal.BT.BinaryTree.buildTreeArr;

public class RootEqualsSumOfChildren {
    public static void main(String[] args) {
        Integer [] nodes = {1, 2, null, 5, null, null, 3, null, 4, null, null};
        TreeNode root = buildTreeArr(nodes);
        checkTree(root);
    }

    private static boolean checkTree(TreeNode root) {
        // since it has only 3 nodes root and its both child
        return root.val == (root.left.val + root.right.val);
    }
}
