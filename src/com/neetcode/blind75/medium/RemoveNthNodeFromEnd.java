package com.neetcode.blind75.medium;

public class RemoveNthNodeFromEnd {
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

        int n = 2;
        printNode(head);
        ListNode head1 = removeNthFromEnd(head, n);
        System.out.println("---------------------------------------");
        printNode(head1);
    }

    private static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode pointer1 = head;
        ListNode pointer2 = head;
        while (n != 0) {
            pointer1 = pointer1.next;
            n--;
        }

        while (pointer1 != null && pointer1.next != null) {
            pointer1 = pointer1.next;
            pointer2 = pointer2.next;
        }
        if (pointer1 == null) {
            return head.next;
        } else {
            pointer2.next = pointer2.next.next;
            return head;
        }
    }

    private static void printNode(ListNode head) {
        System.out.println("Printing the nodes....");
        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }

    }
}
