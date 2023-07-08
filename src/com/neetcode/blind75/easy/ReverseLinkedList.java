package com.neetcode.blind75.easy;

import com.neetcode.blind75.medium.ListNode;

public class ReverseLinkedList {

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);
        ListNode fifth = new ListNode(5);

        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;

        printNode(head);
        ListNode reversedNode = reverse(head);
        printNode(reversedNode);
    }

    private static ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
        while (current != null) {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        //prev = head;
        return prev;
    }

    private static void printNode(ListNode head) {
        System.out.println("Printing the nodes....");
        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }

    }
}
