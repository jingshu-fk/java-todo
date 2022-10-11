package com.suanfa.test;

import com.suanfa.array.ListNode;

/**
 * @author SHUJINGPING
 * @description
 * 给定一个已排序的链表的头 head ， 删除所有重复的元素，使每个元素只出现一次 。
 * 返回 已排序的链表
 */
public class TestDeleteDuplicates {
    public static void main(String[] args) {

    }

    public static ListNode deleteDuplicates(ListNode head) {
        if(head == null) {
            return null;
        }
        ListNode slow = head, fast = head;
        while(fast != null) {
            if(fast.val != slow.val) {
                slow.next = fast;
                slow = slow.next;
            }
            fast = fast.next;
        }
        slow.next = null;
        return head;
    }
}


