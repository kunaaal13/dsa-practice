package com.kunaaal.BT;

import java.util.*;

public class BinaryTree {
    static int inputIndex = -1;

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Integer nodes [] = {1,2,3,null,null,4,5,null,null,6,null,null,7,null,null};
        TreeNode root = buildTreeArr(nodes);
    }

    public static TreeNode buildTreeArr(Integer[] nodes) {
        inputIndex++;

        if (nodes[inputIndex] == null)
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
