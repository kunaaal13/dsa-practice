package com.kunaaal.BT;

import static com.kunaaal.BT.BinaryTree.buildTreeArr;

public class CountGoodNodes {
    public static void main(String[] args) {
        Integer [] nodes = {3,1,3,null,null,null,4,1,null,null,5,null,null};
        TreeNode root = buildTreeArr(nodes);
        int ans = goodNodes(root);
        System.out.println(ans);
    }

    private static int goodNodes(TreeNode root) {
        return cal(root, Integer.MIN_VALUE);
    }

    private static int cal(TreeNode root, int max) {
        if (root == null)
            return 0;

        // agar root ki value badi hai to count ki value 1
        int count = 0;
        if (root.val >= max){
            max = Math.max(max, root.val);
            count++;
        }

        // left ki + right ki + ye node good hai ki nahi
        return cal(root.left, max) + cal(root.right, max) + count;
    }
}
