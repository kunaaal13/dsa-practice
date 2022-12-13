package com.kunaaal.BT;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import static com.kunaaal.BT.BinaryTree.buildTreeArr;

public class FlattenBinaryTreeToLinkedList {
    public static void main(String[] args) {
        // for input its preorder
        Integer [] nodes = {1,2,3,null,null,4,5,null,null,6,null,null,7,null,null};
        TreeNode root = buildTreeArr(nodes);
        flatten(root);
    }

    private static void flatten(TreeNode root) {
        List<Integer> list = new ArrayList<>();

        // check khali hai kya
        if (root == null)
            return;

        // stack banake root ko daldo
        Stack<TreeNode> stack = new Stack<TreeNode>();

        TreeNode node = root;
        stack.push(node);

        while (!stack.isEmpty()){
            // top ki val nikal lo, ans me add kardo
            node = stack.pop();
            list.add(node.val);

            // pehle right daalo fir left
            if (node.right != null)
                stack.push(node.right);

            if (node.left != null)
                stack.push(node.left);
        }

        // ab jo list thi preorder ki usme se root ke right me add karte jao
        for (int i = 1; i < list.size(); i++) {
            root.left = null;
            root.right = new TreeNode(list.get(i));
            root = root.right;
        }
    }
}
