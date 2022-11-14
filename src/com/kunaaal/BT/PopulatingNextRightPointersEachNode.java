package com.kunaaal.BT;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class PopulatingNextRightPointersEachNode {
    static class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right, Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    }

    public Node connect(Node root) {
        Queue<Node> queue = new LinkedList<>();

        if (root == null)
            return null;

        queue.offer(root);

        while (!queue.isEmpty()){
            int size = queue.size();
            ArrayList<Node> arr = new ArrayList<>();
            Node current = null;
            Node next = null;

            // jitne b hai queue me sabke child add kardo
            for (int i = 0; i < size; i++) {
                current = queue.poll();

                if(i<size-1){
                    next=queue.peek();
                    current.next=next;
                }
                if(current.left!=null)
                    queue.offer(current.left);
                if(current.right!=null)
                    queue.offer(current.right);
            }

        }

        return root;
    }


    public Node connectRec (Node root) {
        if(root==null)
            return null;

        link(root.left,root.right);
        return root;
    }

    private void link(Node left, Node right) {
        if (left == null && right == null)
            return;

        left.next = right;

        link(left.left, left.right);
        link(left.right, right.left);
        link(right.left, right.right);
    }


}
