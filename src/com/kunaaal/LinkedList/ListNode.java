package com.kunaaal.LinkedList;

public class ListNode {
    int val;
    ListNode next;

    ListNode() {}

    ListNode(int val){
        this.val = val;
    }

    ListNode(int value, ListNode next){
        this.val = value;
        this.next = next;
    }

    public static void displayList(ListNode head) {
        if (head == null){
            System.out.println("null");
            return;
        }

        while (head != null){
            System.out.print(head.val + " -> ");
            head = head.next;
        }

        System.out.print("null");
        System.out.println("");
    }


    public static ListNode buildList(int[] arr) {
        if (arr.length == 0)
            return null;

        ListNode head = new ListNode(arr[0]);
        ListNode node = head;

        for (int i = 1; i < arr.length; i++) {
            node.next = new ListNode(arr[i]);
            node = node.next;
        }

        return head;
    }

    public static void main(String[] args) {
        int [] arr = {1};
        ListNode head = buildList(arr);
        displayList(head);
    }
}
