package com.suanfa.pointer;

import com.suanfa.array.ListNode;

/**
 * @author SHUJINGPING
 * @description  【快慢指针】
 * 给定一个头结点为 head 的非空单链表，返回链表的中间结点。
 * 如果有两个中间结点，则返回第二个中间结点。
 */
public class MiddleNode {
    public ListNode findMiddleNode(ListNode head) {
        ListNode slow = head, fast = head;
        // 当快指针走到末尾时停止
        while(fast != null && fast.next != null) {
            // 慢指针走一步，快指针就得走两步
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
