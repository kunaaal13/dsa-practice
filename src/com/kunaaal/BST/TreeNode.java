package com.kunaaal.BST;

public class TreeNode {
    TreeNode left;
    TreeNode right;
    int val;

    TreeNode() {}

    TreeNode(int val){
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right){
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public static TreeNode buildBST(int[] values) {
        TreeNode root = null;

        for (int value : values) {
            root = insert(root, value);
        }

        return root;
    }

    public static TreeNode insert(TreeNode root, int value) {
        if (root == null){
            root = new TreeNode(value);
            return root;
        }

        if (root.val > value){
            root.left = insert(root.left, value);
        } else
            root.right = insert(root.right, value);

        return root;
    }

    public static void main(String[] args) {
        int[] values = {5,1,43,4,2,7};
        TreeNode root = buildBST(values);

    }
}
