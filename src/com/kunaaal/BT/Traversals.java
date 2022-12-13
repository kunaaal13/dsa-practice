package com.kunaaal.BT;

import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import static com.kunaaal.BT.BinaryTree.buildTreeArr;

public class Traversals {
    public static void main(String[] args) {
        // for input its preorder
        Integer [] nodes = {1,2,3,null,null,4,5,null,null,6,null,null,7,null,null};
        TreeNode root = buildTreeArr(nodes);
        List<Integer> pre = iterativePostOrder(root);
    }

    private static List<Integer> iterativePostOrder(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        if (root == null)
            return ans;

        Stack<TreeNode> stack1 = new Stack<TreeNode>();
        Stack<TreeNode> stack2 = new Stack<TreeNode>();

        stack1.push(root);

        while (!stack1.isEmpty()){
            // top nikal lo aur 2 me add kardo
            root = stack1.pop();
            stack2.push(root);

            // left right ko 1 me daldo
            if (root.left != null)
                stack1.push(root.left);

            if (root.right != null)
                stack1.push(root.right);
        }

        // stack 2 ko khali karke
        while (!stack2.isEmpty()){
            ans.add(stack2.pop().val);
        }

        return ans;
    }

    private static List<Integer> iterativeInOrder(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        TreeNode node = root;

        // stack banalo
        Stack<TreeNode> stack = new Stack<TreeNode>();

        while (true){
            if (node != null){
                // stack me dalke, left me bhjdo node ko
                stack.push(node);
                node = node.left;
            } else {
                // matlab left me kuch nhi ab
                // agar stack khali to loop se bahar aa jao
                if (stack.isEmpty())
                    break;

                // top wale ko nikake uski value to ans me add kardo
                node = stack.pop();
                ans.add(node.val);

                // right me bhjdo
                node = node.right;
            }
        }

        return ans;
    }

    private static List<Integer> iterativePreOrder(TreeNode root) {
        List<Integer> ans = new ArrayList<>();

        // check khali hai kya
        if (root == null)
            return ans;

        // stack banake root ko daldo
        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root);

        while (!stack.isEmpty()){
            // top ki val nikal lo, ans me add kardo
            root = stack.pop();
            ans.add(root.val);

            // pehle right daalo fir left
            if (root.right != null)
                stack.push(root.right);

            if (root.left != null)
                stack.push(root.left);
        }

        return ans;
    }

    private static void postOrderTraversal(TreeNode root) {
        if (root == null)
            return;

        // left right root
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.println(root.val);
    }

    private static void inOrderTraversal(TreeNode root) {
        if (root == null)
            return;

        // left root right
        inOrderTraversal(root.left);
        System.out.println(root.val);
        inOrderTraversal(root.right);
    }

    private static void preOrderTraversal(TreeNode root){
        if (root == null)
            return;

        // root left right
        System.out.println(root.val);
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }




}
