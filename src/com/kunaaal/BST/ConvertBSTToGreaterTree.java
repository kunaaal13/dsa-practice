package com.kunaaal.BST;

import java.util.ArrayList;
import java.util.HashMap;

public class ConvertBSTToGreaterTree {
    public static void main(String[] args) {

    }

    int sum = 0;
    public TreeNode convertBST(TreeNode root) {
        convert(root);
        return root;
    }

    public void convert(TreeNode cur) {
        if (cur == null) return;
        convert(cur.right);
        cur.val += sum;
        sum = cur.val;
        convert(cur.left);
    }


}
