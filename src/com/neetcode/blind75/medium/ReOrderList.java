package com.neetcode.blind75.medium;


import com.neetcode.blind75.medium.ListNode;

public class ReOrderList {

    public static void main(String[] args){
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
        reorderList(head);
        System.out.println("-------------------------------------------------------");
        printNode(head);
    }

    private static void reorderList(ListNode head) {
        ListNode mid = findMiddle(head);
        ListNode end = reverse(mid);
        ListNode start = head;
        merge(start,end);
    }

    private static void merge(ListNode start, ListNode end) {
        while(start != null && end != null){
            ListNode temp = start.next;
            start.next = end;
            start = temp;

            temp = end.next;
            end.next = start;
            end = temp;
        }
        if(start != null){
            start.next = null;
        }

    }

    private static ListNode reverse(ListNode mid) {
        ListNode current = mid;
        ListNode next = null;
        ListNode prev = null;
        while (current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
    }

    private static ListNode findMiddle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while(fast!= null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    private static void printNode(ListNode head) {
        System.out.println("Printing the nodes....");
        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }

    }
}
