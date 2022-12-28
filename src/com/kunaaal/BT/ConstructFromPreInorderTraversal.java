package com.kunaaal.BT;

import java.util.HashMap;
import java.util.Map;

public class ConstructFromPreInorderTraversal {
    public static void main(String[] args) {
        int [] preorder = {3,9,20,15,7};
        int [] inorder = {9,3,15,20,7};

        System.out.println(buildTree(preorder, inorder));
    }

    private static TreeNode buildTree(int[] preorder, int[] inorder) {
        Map<Integer, Integer> inMap = new HashMap<>();

        for (int i = 0; i < inorder.length; i++) {
            inMap.put(inorder[i], i);
        }

        TreeNode root = build(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1, inMap);

        return root;
    }

    private static TreeNode build(int[] preorder, int preStart, int preEnd, int[] inorder, int inStart, int inEnd, Map<Integer, Integer> inMap) {
        if (preStart > preEnd || inStart > inEnd)
            return null;

        TreeNode root = new TreeNode(preorder[preStart]);

        int inRoot = inMap.get(root.val);
        int numsLeft = inRoot - inStart;

        root.left = build(preorder, preStart + 1, preStart + numsLeft, inorder, inStart, inRoot - 1, inMap);
        root.right = build(preorder, preStart + numsLeft + 1, preEnd, inorder, inRoot + 1, inEnd, inMap);

        return root;
    }
}
