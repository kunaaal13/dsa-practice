package com.kunaaal.BST;

public class ValidateBST {
    public static void main(String[] args) {

    }

    private static boolean isValidBST(TreeNode root) {
        return isValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private static boolean isValidBST(TreeNode root, long minValue, long maxValue) {
        if (root == null)
            return true;

        // every node needs to be in this range
        if (root.val >= maxValue || root.val <= minValue){
            return false;
        }

        // changes in min max
        // 1. Left -> max value will become root.val
        // 2. right -> min value will become root
        return isValidBST(root.left, minValue, root.val) && isValidBST(root.right, root.val, maxValue);
    }

}
