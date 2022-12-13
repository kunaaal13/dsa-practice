package com.kunaaal.BT;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import static com.kunaaal.BT.BinaryTree.buildTreeArr;

public class ZigzagLevelOrderTraversal {
    public static void main(String[] args) {
        // for input its preorder
        Integer [] nodes = {3, 9, null, null, 20, 15, null, null, 7, null, null};
        TreeNode root = buildTreeArr(nodes);
        List<List<Integer>> list = zigzagLevelOrder(root);
        System.out.println(list);
    }

    private static List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();

        // check if null return
        if (root == null)
            return ans;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        boolean isLeftToRight = true;

        while (!queue.isEmpty()){
            int levelSize = queue.size();
            List<Integer> list = new ArrayList<>();

            for (int i = 0; i < levelSize; i++) {
                if (queue.peek().left != null)
                    queue.offer(queue.peek().left);

                if (queue.peek().right != null)
                    queue.offer(queue.peek().right);

                if (isLeftToRight){
                    list.add(queue.poll().val);
                } else
                    list.add(0,queue.poll().val);
            }

            isLeftToRight = !isLeftToRight;
            ans.add(list);
        }

        return ans;
    }
}
