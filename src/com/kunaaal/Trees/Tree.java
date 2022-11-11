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


    // Sum of Root To Leaf Binary Numbers
//    public int sumRootToLeaf(TreeNode root) {
//        int ans = 0;
//        support(root, ans, "");
//        return ans;
//    }

//    private void support(TreeNode root, int sum, String str) {
//        if (root == null)
//            return;
//
//        str += root.val;
//
//        if (root.left == null && root.right == null){
//            sum += Integer.parseInt(str, 2);
//            str = "";
//            return;
//        }
//
//
//        support(root.left, sum, str);
//        support(root.right, sum, str);
//
//        return;
//    }


    // target path sum
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null)
            return false;

        if (root.left == null && root.right == null && root.val == targetSum) // Leaf check
            return true;

        return hasPathSum(root.left, targetSum - root.val) || hasPathSum(root.right, targetSum - root.val);
    }

    // Second Minimum Node In a Binary Tree
    public int findSecondMinimumValue(TreeNode root) {
        int second = Integer.MAX_VALUE;
        support(root, Integer.MAX_VALUE, second);

        return second;
    }

    private void support(TreeNode root, int minValue, int second) {
        if (root == null)
            return;

        if (root.val < minValue){
            second = minValue;
            minValue = root.val;
        }

        support(root.left, minValue, second);
        support(root.right, minValue, second);
    }

    public int sumOfLeftLeaves(TreeNode root) {
        if(root == null)
            return 0;

        int left = 0;

        if(root.left != null && root.left.left == null && root.left.right == null)
            left = root.left.val;

        return left + sumOfLeftLeaves(root.left) + sumOfLeftLeaves(root.right);
    }

    public List<Double> averageOfLevels(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        List<Double> ans = new ArrayList<>();

        if (root == null)
            return ans;

        queue.offer(root);

        while (!queue.isEmpty()){
            double levelSize = queue.size();
            double sum = 0;

            List<Integer> list = new ArrayList<>();

            for (int i = 0; i < levelSize; i++) {
                if (queue.peek().left != null)
                    queue.offer(queue.peek().left);

                if (queue.peek().right != null)
                    queue.offer(queue.peek().right);

                sum += queue.poll().val;
            }
            double avg = sum / levelSize;
            ans.add(avg);
        }

        return ans;
    }

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();

        getLeaf(root1, arr1);
        getLeaf(root2, arr2);

        if (arr1.size() != arr2.size())
            return false;

        for (int i = 0; i < arr2.size(); i++) {
            if (arr1.get(i) != arr2.get(i))
                return false;
        }

        return true;
    }

    private void getLeaf(TreeNode root, ArrayList<Integer> arr) {
        if (root == null)
            return;

        // check if leaf
        if (root.left == null && root.right == null)
            arr.add(root.val);

        getLeaf(root.left, arr);
        getLeaf(root.right, arr);
    }

    public int goodNodes(TreeNode root) {
        int good = 0;
        cal(root, good, Integer.MIN_VALUE);
        return good;
    }

    private void cal(TreeNode root, int good, int max) {
        if (root == null)
            return;

        if (root.val >= max)
            good++;

        max = Math.max(max, root.val);

        cal(root.left, good, max);
        cal(root.right, good, max);
    }

    public List<String> binaryTreePaths(TreeNode root) {
        ArrayList<String> arr = new ArrayList<>();
        getPaths(root, arr, "");
        return arr;
    }

    private void getPaths(TreeNode root, ArrayList<String> arr, String str) {
        if (root.left == null && root.right == null){
            arr.add(str + root.val);
        }

        if (root.left != null)
            getPaths(root.left, arr, str + root.val + "->");

        if (root.right != null)
            getPaths(root.right, arr, str + root.val + "->");
    }

    StringBuilder str;
    public String tree2str(TreeNode root) {
        str = new StringBuilder();
        getStr(root);
        return str.toString();
    }

    private void getStr(TreeNode root) {
        if (root == null)
            return;

        if(root.left == null && root.right==null){
            str.append(root.val);
            return;
        }

        str.append(root.val);
        str.append("(");
        getStr(root.left);
        str.append(")");

        if(root.right!=null){
            str.append('(');
            getStr(root.right);
            str.append(')');
        }

    }

    public boolean isSymmetric(TreeNode root) {
        return root == null || isMirror(root.left, root.right);
    }

    private boolean isMirror(TreeNode node1, TreeNode node2) {
        if (node1 == null && node2 == null)
            return true;

        if (node1 == null || node2 == null)
            return false;

        if (node1.val != node2.val)
            return false;

        // iska left uske right ke sath equal aur iska right uske left
        return isMirror(node1.left, node2.right) && isMirror(node1.right, node2.left);
    }


    public int maxLevelSum(TreeNode root) {

    }
}
