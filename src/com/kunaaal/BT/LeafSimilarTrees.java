package com.kunaaal.BT;

import java.util.ArrayList;

import static com.kunaaal.BT.BinaryTree.buildTreeArr;

public class LeafSimilarTrees {
    public static void main(String[] args) {
        Integer [] nodes = {3,1,3,null,null,null,4,1,null,null,5,null,null};
        TreeNode root = buildTreeArr(nodes);
        leafSimilar(root,root);
    }

    private static boolean leafSimilar(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();

        getLeafs(root1, arr1);
        getLeafs(root2, arr2);

        if (arr1.size() != arr2.size())
            return false;

        for (int i = 0; i < arr1.size(); i++) {
            if (arr1.get(i) != arr2.get(i))
                return false;
        }

        return true;
    }

    private static void getLeafs(TreeNode root, ArrayList<Integer> arr) {
        if (root == null)
            return;

        // leaf check
        if (root.left == null && root.right == null)
            arr.add(root.val);

        // get all leafs from left and right
        getLeafs(root.left, arr);
        getLeafs(root.right, arr);
    }
}
