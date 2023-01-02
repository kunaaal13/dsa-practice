package com.kunaaal.LinkedList;

import static com.kunaaal.LinkedList.ListNode.buildList;
import static com.kunaaal.LinkedList.ListNode.displayList;

public class RotateList {
    public static void main(String[] args) {
        int [] arr = {0,1,2};
        ListNode head = buildList(arr);
        displayList(head);
        ListNode ans = rotateRight(head, 4);
        displayList(ans);
    }

    private static ListNode rotateRight(ListNode head, int k) {
        int length = 0;
        ListNode node = head;

        if(head == null || head.next == null)
            return head;

        //  find the length
        while (node != null){
            length++;
            node = node.next;
        }

        // find the rotations
        k = k % length;

        if (k == 0)
            return head;

        // reach to length-k node
        int i = 1;
        node = head;

        while (i < length - k){
            node = node.next;
            i++;
        }

        // store that node and make its next null
        ListNode temp = node;
        node = node.next;

        temp.next = null;

        ListNode ans = node;
        while (node.next != null){
            node = node.next;
        }


        node.next = head;
        return ans;

    }
}
