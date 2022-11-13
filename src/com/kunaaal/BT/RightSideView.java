package com.kunaaal.BT;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import static com.kunaaal.BT.BinaryTree.buildTreeArr;

public class RightSideView {
    public static void main(String[] args) {
        int nodes [] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        TreeNode root = buildTreeArr(nodes);
        rightSideViewRec(root);

    }

    private static List<Integer> rightSideViewRec(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        addRightSide(root, 0 , ans);
        return ans;
    }

    private static void addRightSide(TreeNode root, int level, List<Integer> ans) {
        if (root == null){
            return;
        }


        System.out.println(root.val);
        if (ans.size() == level){
            ans.add(root.val);
        }


        addRightSide(root.right, level + 1, ans);
        addRightSide(root.left, level + 1, ans);
    }

    private static List<Integer> rightSideView(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<Integer> ans = new ArrayList<>();

        if (root == null)
            return ans;

        queue.offer(root);

        while (!queue.isEmpty()){
            int size = queue.size();
            System.out.println(queue);

            for (int i = 0; i < size; i++) {
                TreeNode temp = queue.poll();

                if (i == size - 1){
                    ans.add(temp.val);
                    System.out.println(temp.val);
                }


                if (temp.left != null)
                    queue.offer(temp.left);

                if (temp.right != null)
                    queue.offer(temp.right);
            }
        }

        return ans;
    }
}
