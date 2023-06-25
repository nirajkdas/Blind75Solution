package com.neetcode.blind75.easy;

public class MergeSortedLinkedList {
    static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    private static void printNode(ListNode head) {
        System.out.println("Printing the nodes....");
        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }

    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);

        head.next = second;
        second.next = third;

        ListNode head1 = new ListNode(1);
        ListNode fourth = new ListNode(4);

        head1.next = fourth;

        printNode(head);
        printNode(head1);
        ListNode mergedNode = merge(head, head1);
        printNode(mergedNode);
    }

    private static ListNode merge(ListNode list1, ListNode list2) {
        System.out.println("Merging the linked lists.....");
        ListNode temp = new ListNode(0, null);
        ListNode result = temp;
        while (list1 != null && list2 != null) {
            if (list1.val > list2.val) {
                temp.next = list2;
                list2 = list2.next;
                temp = temp.next;
            } else if (list1.val < list2.val) {
                temp.next = list1;
                list1 = list1.next;
                temp = temp.next;
            } else {
                temp.next = list1;
                list1 = list1.next;
                temp = temp.next;
                temp.next = list2;
                list2 = list2.next;
                temp = temp.next;

            }
        }

        while (list1 != null) {
            temp.next = list1;
            list1 = list1.next;
            temp = temp.next;
        }

        while (list2 != null) {
            temp.next = list2;
            list2 = list2.next;
            temp = temp.next;
        }
        return result.next;

    }
}
