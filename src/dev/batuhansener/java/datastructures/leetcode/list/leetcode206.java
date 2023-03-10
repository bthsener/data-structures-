package dev.batuhansener.java.datastructures.leetcode.list;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class leetcode206 {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode seq = null;
        ListNode current = head;

        while(current!=null){
            seq = current.next;
            current.next = prev;
            prev = current;
            current = seq;
        }
        return prev;
    }
}