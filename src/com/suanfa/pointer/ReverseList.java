package com.suanfa.pointer;

import com.suanfa.array.ListNode;

/**
 * @author
 * @description 反转一个链表
 *
 * 使用递归思路
 */
public class ReverseList {
    public ListNode getReverseListNode(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }
        ListNode last = getReverseListNode(head.next);
        head.next.next = head;
        // head节点变成最后的节点
        head.next = null;
        return last;
    }
}
