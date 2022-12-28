package com.kunaaal.BST;

public class Search {
    public static void main(String[] args) {

    }

    private static TreeNode searchBST(TreeNode root, int val) {
        while (root != null && root.val != val){
            if (root.val > val)
                root = root.left;
            else
                root = root.right;
        }

        return root;
    }
}
