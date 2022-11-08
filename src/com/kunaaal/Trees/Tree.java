package com.kunaaal.Trees;

import java.util.*;

public class Tree {
    private class TreeNode {
        int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
    }

//    public List<Integer> inorderTraversal(TreeNode root) {
//        List<Integer> res = new ArrayList<>();
//        in(root, res);
//        return res;
//    }
//
//    private void in(TreeNode root, List<Integer> res) {
//        if (root == null)
//            return;
//
//        in(root.left, res);
//        res.add(root.val);
//        in(root.right, res);
//    }


    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        List<List<Integer>> ans = new ArrayList<>();

        if (root == null)
            return ans;

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


    // Pre order
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();

        if (root == null)
            return ans;

        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root);

        while (!stack.isEmpty()){
           root = stack.pop();
           ans.add(root.val);

            if (root.right != null)
                stack.push(root.right);

           if (root.left != null)
               stack.push(root.left);

        }

        return ans;
    }

    // In order iterative
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();

        Stack<TreeNode> stack = new Stack<TreeNode>();

        TreeNode node = root;

        while (true){
            if (node != null){
                stack.push(node);
                node = node.left;
            } else {
                if (stack.isEmpty()){
                    break;
                }

                node = stack.pop();
                ans.add(node.val);
                node = node.right;
            }
        }

        return ans;

    }

    // Max depth
    public int maxDepth(TreeNode root) {
        if (root == null)
            return 0;

        int leftHeight = maxDepth(root.left);
        int rightHeight = maxDepth(root.right);

        return 1 + Math.max(leftHeight, rightHeight);
    }

    // Balanced binary tree
    public boolean isBalanced(TreeNode root) {
        return dfsHeight(root) != -1;
    }

    private int dfsHeight(TreeNode root) {
        if (root == null)
            return 0;

        int leftHeight = dfsHeight(root.left);
        if (leftHeight == -1)
            return -1;

        int rightHeight = dfsHeight(root.right);
        if (rightHeight == -1)
            return -1;

        if (Math.abs(leftHeight - rightHeight) > 1)
            return -1;

        return Math.max(leftHeight, rightHeight) + 1;
    }

    // Diameter
    public int diameterOfBinaryTree(TreeNode root) {
        int [] diameter = new int[1];
        height(root, diameter);
        return diameter[0];
    }

    private int height(TreeNode root, int[] diameter) {
        if (root == null)
            return 0;

        int leftHeight = height(root.left, diameter);
        int rightHeight = height(root.right, diameter);

        diameter[0] = Math.max(diameter[0], leftHeight + rightHeight);
        return 1 + Math.max(leftHeight , rightHeight);
    }

    // Max path sum
    public int maxPathSum(TreeNode root) {
        int maxValue[] = new int [1];
        maxValue[0] = Integer.MIN_VALUE;
        maxPathDown(root, maxValue);
        return maxValue[0];
    }

    private int maxPathDown(TreeNode node, int maxValue[]){
        if(node == null){
            return 0;
        }

        int left = Math.max(0,maxPathDown(node.left, maxValue));
        int right = Math.max(0,maxPathDown(node.right, maxValue));

        maxValue[0] = Math.max(maxValue[0], left + right + node.val);
        return Math.max(left, right) + node.val;
    }

    // zigzag level order
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        List<List<Integer>> ans = new ArrayList<>();
        boolean leftToRight = true;

        if (root == null)
            return ans;

        queue.offer(root);
        while (!queue.isEmpty()){
            int size = queue.size();
            List<Integer> row = new ArrayList<>(size);

            for (int i = 0; i < size; i++) {
                TreeNode node = queue.peek();
                queue.poll();

                // Find position to fill value
                int index = (leftToRight) ? i : (size-1-i);
                row.add(index, node.val);

                if (node.left != null)
                    queue.add(node.left);

                if (node.right != null)
                    queue.add(node.right);

            }

            // After a level
            ans.add(row);
            leftToRight = !leftToRight;

        }

        return ans;
    }
}
