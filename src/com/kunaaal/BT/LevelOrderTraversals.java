package com.kunaaal.BT;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import static com.kunaaal.BT.BinaryTree.buildTreeArr;

public class LevelOrderTraversals {
    public static void main(String[] args) {
        // for input its preorder
        Integer [] nodes = {1,2,3,null,null,4,5,null,null,6,null,null,7,null,null};
        TreeNode root = buildTreeArr(nodes);
        List<List<Integer>> levelorder = LevelOrderTraversal(root);
    }

    private static List<List<Integer>> LevelOrderTraversal(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();

        if (root == null)
            return ans;

        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);

        while (!queue.isEmpty()){
            int levelSize = queue.size();
            List<Integer> list = new ArrayList<>();

            for (int i = 0; i < levelSize; i++) {
                if (queue.peek().left != null)
                    queue.offer(queue.peek().left);

                if (queue.peek().right != null)
                    queue.offer(queue.peek().right);

                list.add(queue.poll().val);
            }

            ans.add(list);
        }

        return ans;
    }
}
