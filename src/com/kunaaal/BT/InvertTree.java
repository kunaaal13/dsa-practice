package com.kunaaal.BT;

import static com.kunaaal.BT.BinaryTree.buildTreeArr;

public class InvertTree {
    public static void main(String[] args) {
        Integer [] nodes = {4,2,1,null,null,3,null,null,7,6,null,null,9,null,null};
        TreeNode root = buildTreeArr(nodes);

        System.out.println(invertTree(root));
    }

    private static TreeNode invertTree(TreeNode root) {
        if (root == null)
            return null;

        if (root.left == null && root.right == null)
            return root;

        TreeNode node = new TreeNode(root.val);
        node.left = invertTree(root.right);
        node.right = invertTree(root.left);

        return node;
    }
}
