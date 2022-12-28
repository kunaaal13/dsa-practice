package com.kunaaal.BT;

import static com.kunaaal.BT.BinaryTree.buildTreeArr;

public class MinimumDepth {
    public static void main(String[] args) {
        Integer [] nodes = {3, 9, null, null, 20, 15, null, null, 7, null, null};
        TreeNode root = buildTreeArr(nodes);
        int ans = minDepth(root);
        System.out.println(ans);
    }

    private static int minDepth(TreeNode root) {
        if (root == null)
            return 0;

        int left = minDepth(root.left);
        int right = minDepth(root.right);

        if (left == 0 || right == 0){
            return left + right + 1;
        }

        return Math.min(left,right) + 1;

    }


}
