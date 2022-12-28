package com.kunaaal.LinkedList;

import static com.kunaaal.LinkedList.ListNode.buildList;
import static com.kunaaal.LinkedList.ListNode.displayList;

public class OddEven {
    public static void main(String[] args) {
        int [] arr = {2,1,3,5,6,4,7};
        ListNode head = buildList(arr);
        displayList(head);
        ListNode ans = oddEvenList(head);
        displayList(ans);
    }

    private static ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null || head.next.next == null)
            return head;

        ListNode odd = head;
        ListNode even = head.next;

        ListNode current = head;
        ListNode next = head.next;

        while(current != null && current.next != null && next != null && next.next != null){
            current.next = next.next;
            current = current.next;

            next.next = current.next;
            next = next.next;
        }

        current.next = even;
        return odd;
    }

}
