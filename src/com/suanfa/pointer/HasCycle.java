package com.suanfa.pointer;

import com.suanfa.array.ListNode;

/**
 * @author SHUJINGPING
 * @description 判断一个单链表是否成环
 */
public class HasCycle {
    public boolean isHaveCycle(ListNode head) {
        ListNode slow = head, fast = head;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow == fast;
    }
}
