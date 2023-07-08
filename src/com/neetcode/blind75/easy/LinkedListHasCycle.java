package com.neetcode.blind75.easy;

import com.neetcode.blind75.medium.ListNode;

public class LinkedListHasCycle {


    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);

        head.next = second;
        second.next = third;
        third.next = head;
        System.out.println(hasCycle(head));
    }

    private static boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow)
                return true;
        }


        return false;
    }
}
