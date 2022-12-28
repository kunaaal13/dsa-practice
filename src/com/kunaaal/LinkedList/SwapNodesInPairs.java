package com.kunaaal.LinkedList;

import static com.kunaaal.LinkedList.ListNode.buildList;
import static com.kunaaal.LinkedList.ListNode.displayList;

public class SwapNodesInPairs {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4, 5};
        ListNode head = buildList(arr);
        displayList(head);
        ListNode ans = swapPairs(head);
        displayList(ans);
    }

    private static ListNode swapPairs(ListNode head) {
        // if linked has one or two elements return ll
        if (head == null || head.next == null)
            return head;

        ListNode second = head.next;
        ListNode third = second.next;

        second.next = head;
        head.next = swapPairs(third);

        return second;
    }
}
