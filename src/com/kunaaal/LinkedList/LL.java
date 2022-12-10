package com.kunaaal.LinkedList;

public class LL {
    private ListNode head;
    private int size;


    private class ListNode {
        int val;
        ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public void reverse (){
        if (size < 2){
            return;
        }

        ListNode prev = null;
        ListNode present = head;
        ListNode next = present.next;

        while (present != null){
            present.next = prev;
            prev = present;
            present = next;
            if (next != null)
                next = next.next;
        }


    }


    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode a = headA;
        ListNode b = headB;

        while (a!=b){
            if (a == null)
                a = headB;
            else
                a = a.next;

            if (b == null)
                b = headA;
            else
                b = b.next;
        }

        return a;
    }



}
