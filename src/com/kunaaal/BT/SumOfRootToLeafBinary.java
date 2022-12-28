package com.kunaaal.BT;

import static com.kunaaal.BT.BinaryTree.buildTreeArr;

public class SumOfRootToLeafBinary {
    public static void main(String[] args) {
        Integer [] nodes = {1, 0, 0, null, null, 1, null, null, 1, 0, null, null, 1, null, null};
        TreeNode root = buildTreeArr(nodes);
        int ans = sumRootToLeaf(root);
        System.out.println(ans);
    }

    private static int sumRootToLeaf(TreeNode root) {
        return helper(root, 0);
    }

    private static int helper(TreeNode root, int sum) {
        // root is null -> sum = 0
        if (root == null)
            return 0;

        // update sum
        sum = (2 * sum) + root.val;

        // leaf check
        if(root.left == null && root.right == null)
            return sum;

        int sumLeft = helper(root.left, sum);
        int sumRight = helper(root.right, sum);

        return sumLeft + sumRight;
    }
}
