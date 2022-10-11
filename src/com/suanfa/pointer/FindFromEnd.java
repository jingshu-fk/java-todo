package com.suanfa.pointer;


import com.suanfa.array.ListNode;

/**
 * @author SHUJINGPING
 * @description 找出一个链表的倒数第k个节点
 */
public class FindFromEnd {
    public ListNode findFromEnd(ListNode head, int k) {
        ListNode p1 = head;
        // p1先走k步
        for(int i = 0; i < k; i++) {
            p1 = p1.next;
        }
        ListNode p2 = head;
        // p1和p2同时走n-k步
        while(p1 != null) {
            p2 = p2.next;
            p1 = p1.next;
        }
        // 现在p2指向第n-k节点
        return p2;
    }
}
