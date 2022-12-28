package com.kunaaal.BT;

import java.util.ArrayList;
import java.util.List;

import static com.kunaaal.BT.BinaryTree.buildTreeArr;

public class BinaryTreePaths {
    public static void main(String[] args) {
        Integer [] nodes = {1, 2, null, 5, null, null, 3, null, 4, null, null};
        TreeNode root = buildTreeArr(nodes);
        List<String> ans =  binaryTreePaths(root);
    }

    private static List<String> binaryTreePaths(TreeNode root) {
        ArrayList<String> ans = new ArrayList<>();
        getPaths(root, ans, "");
        return ans;
    }

    private static void getPaths(TreeNode root, ArrayList<String> ans, String str) {
        // leaf check
        if (root.left == null && root.right == null){
            ans.add(str + root.val);
            return;
        }

        // check if left exists
        if (root.left != null){
            getPaths(root.left, ans, str + root.val + "->");
        }

        // check if right exists
        if (root.right != null)
            getPaths(root.right, ans, str + root.val + "->");
    }


}
