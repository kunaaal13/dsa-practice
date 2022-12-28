package com.kunaaal.BT;

import java.util.ArrayList;
import java.util.List;

import static com.kunaaal.BT.BinaryTree.buildTreeArr;

public class RightView {
    public static void main(String[] args) {
        // for input its preorder
        Integer [] nodes = {1, 2, null, 5, null, null, 3, null, 4, null, null};
        TreeNode root = buildTreeArr(nodes);
        List<Integer> ans = rightSideView(root);
    }

    private static List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        addRightSide(root, 0 , ans);
        return ans;
    }

    private static void addRightSide(TreeNode root, int level, List<Integer> ans) {
        if (root == null)
            return;

        // Agar list ka size level ke barabar matlab iss level ka koi nahi hai
        if (ans.size() == level)
            ans.add(root.val);

        addRightSide(root.right, level + 1, ans);
        addRightSide(root.left, level + 1, ans);
    }
}
