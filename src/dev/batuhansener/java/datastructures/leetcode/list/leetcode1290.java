package dev.batuhansener.java.datastructures.leetcode.list;

import java.util.ArrayList;

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

class leetcode1290 {
    public int getDecimalValue(ListNode head) {
        int output = 0, carpan = 1;
        ArrayList<Integer> list = new ArrayList<>();

        while(head != null){
            list.add(head.val);
            head = head.next;
        }

        for(int a = list.size()-1 ; a>=0 ;  a--){
            output += (list.get(a)*carpan);
            carpan *= 2;
        }

        return output;
    }
}