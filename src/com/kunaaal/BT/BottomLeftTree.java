package com.kunaaal.BT;

import java.util.ArrayList;
import java.util.List;

import static com.kunaaal.BT.BinaryTree.buildTreeArr;

public class BottomLeftTree {
    public static void main(String[] args) {
        Integer [] nodes = {2,1,null,null,3,null,null};
        TreeNode root = buildTreeArr(nodes);
        int ans = findBottomLeftValue(root);
        System.out.println(ans);
    }

    private static int findBottomLeftValue(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        getLeftLeaves(root, ans, 0);
        return ans.get(ans.size()-1);
    }

    private static void getLeftLeaves(TreeNode root, List<Integer> ans, int level) {
        if (root == null)
            return;

        // if size equal matlab value add kardo
        if (level == ans.size())
            ans.add(root.val);

        getLeftLeaves(root.left, ans, level + 1);
        getLeftLeaves(root.right, ans, level + 1);
    }

}
