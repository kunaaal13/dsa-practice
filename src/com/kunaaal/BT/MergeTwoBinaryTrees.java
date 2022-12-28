package com.kunaaal.BT;

import static com.kunaaal.BT.BinaryTree.buildTreeArr;

public class MergeTwoBinaryTrees {
    public static void main(String[] args) {
        Integer [] nodes = {1,3,5,null,null,null,2,null,null};
        TreeNode root1 = buildTreeArr(nodes);
        Integer [] nodes2 = {2,1,null,4,null,null,3,null,7,null,null};
        TreeNode root2 = buildTreeArr(nodes2);

        System.out.println(mergeTrees(root1, root2).val);
    }

    private static TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if (root1 == null)
            return root2;

        if (root2 == null)
            return root1;

        root1.val += root2.val;

        root1.left = mergeTrees(root1.left, root2.left);
        root1.right = mergeTrees(root1.right, root2.right);

        return root1;
    }
}
