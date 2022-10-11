package com.suanfa.pointer;

import com.suanfa.array.ListNode;

/**
 * @author SHUJINGPING
 * @description 给一个链表删除倒数第k个节点，返回新的链表
 */
public class RemoveNthFromEnd {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        // 虚拟头结点,防止出现空指针情况，比如链表总共5个节点，让你删除倒数第5个节点。
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        // 先找到倒数第n+1个节点
        FindFromEnd ff = new FindFromEnd();
        ListNode x = ff.findFromEnd(dummy, n + 1);
        // 删除倒数第n个节点
        x.next = x.next.next;
        return dummy.next;
    }
}
