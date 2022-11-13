package com.kunaaal.BT;

import java.util.*;

public class BinaryTree {
    static int inputIndex = -1;

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        System.out.println("enter root data");
//        TreeNode root = buildTree(s);
//        System.out.println(root.val);


        int nodes [] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        TreeNode root = buildTreeArr(nodes);
        System.out.println(rightSideView(root));
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

    private static int maxDepth(TreeNode root) {
        if (root == null)
            return 0;

        int left = maxDepth(root.left);
        int right = maxDepth(root.right);

        return 1 + Math.max(left, right);
    }

    private static void zigZagLevelOrderTraversal(TreeNode root) {
        List<List<Integer>> res=new ArrayList<List<Integer>>();
        Queue<TreeNode> queue = new LinkedList<>();
        boolean isLeftToRight = true;

        if (root == null)
            return;

        queue.offer(root);

        // jab tak khali nahi ho jati
        while (!queue.isEmpty()){
            List<Integer> subres=new ArrayList<Integer>();
            int size = queue.size();

            // jitne b hai queue me sabke child add kardo
            for (int i = 0; i < size; i++) {
                // agar right hai to kardo add
                if (queue.peek().left != null)
                    queue.offer(queue.peek().left);

                if (queue.peek().right != null)
                    queue.offer(queue.peek().right);

                if (isLeftToRight){
                    subres.add(queue.poll().val);
                } else
                    subres.add(0, queue.poll().val);


            }

            res.add(subres);
            isLeftToRight = !isLeftToRight;
        }

        System.out.println(res);
    }

    private static void levelOrderTraversal(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();

        if (root == null)
            return;

        // add root since it is not null
        queue.offer(root);

        // jab tak khali nahi ho jati
        while (!queue.isEmpty()){
            int size = queue.size();

            // jitne b hai queue me sabke child add kardo
            for (int i = 0; i < size; i++) {
                // agar right hai to kardo add
                if (queue.peek().left != null)
                    queue.offer(queue.peek().left);

                if (queue.peek().right != null)
                    queue.offer(queue.peek().right);

                // Print
                System.out.print(queue.poll().val + " ");
            }

            // change karni line
            System.out.println("");
        }
    }

    private static void preOrder(TreeNode root) {
        if (root == null)
            return;

        System.out.println(root.val);
        preOrder(root.left);
        preOrder(root.right);
    }

    public static TreeNode buildTreeArr(int[] nodes) {
        inputIndex++;

        if (nodes[inputIndex] == -1)
            return null;

        TreeNode node = new TreeNode(nodes[inputIndex]);
        node.left = buildTreeArr(nodes);
        node.right = buildTreeArr(nodes);

        return node;
    }

    public static TreeNode buildTree(Scanner s) {
        int rootData = s.nextInt();

        if (rootData == -1)
            return null;

        TreeNode root = new TreeNode(rootData);

        System.out.println("enter left of "+rootData);
        root.left = buildTree(s);

        System.out.println("enter right of "+rootData);
        root.right = buildTree(s);

        return root;
    }




}
