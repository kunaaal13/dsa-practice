package com.kunaaal.BT;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import static com.kunaaal.BT.BinaryTree.buildTreeArr;

public class LevelOrderTraversal2 {
    public static void main(String[] args) {
        Integer [] nodes = {3,1,3,null,null,null,4,1,null,null,5,null,null};
        TreeNode root = buildTreeArr(nodes);
        List<List<Integer>> ans = levelOrderBottom(root);
    }

    private static List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null)
            return ans;

        Queue<TreeNode> queue = new LinkedList<>();
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

            // add at the start
            ans.add(0,list);
        }

        return ans;
    }
}
