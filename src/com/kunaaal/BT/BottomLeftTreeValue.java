package com.kunaaal.BT;

import java.util.LinkedList;
import java.util.Queue;

import static com.kunaaal.BT.BinaryTree.buildTreeArr;

public class BottomLeftTreeValue {
    public static void main(String[] args) {
        int nodes [] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        TreeNode root = buildTreeArr(nodes);

        System.out.println(findBottomLeftValue(root));
    }

    private static int findBottomLeftValue(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        int ans = -1;

        if (root == null)
            return -1;

        queue.offer(root);

        while (!queue.isEmpty()){
            int size = queue.size();
            ans = queue.peek().val;

            for (int i = 0; i < size; i++) {
                if (queue.peek().left != null)
                    queue.offer(queue.peek().left);

                if (queue.peek().right != null)
                    queue.offer(queue.peek().right);

                queue.poll();
            }
        }

        return ans;
    }
}
