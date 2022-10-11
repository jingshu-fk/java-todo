package com.suanfa.pointer;

import com.suanfa.array.ListNode;

/**
 * @author SHUJINGPING
 * @description 反转前N个节点
 *
 * 2 给定一个索引区间[m, n]，反转这个区间的链表节点。
 */
public class ReverseN {
    // 定义一个后驱节点
    ListNode successor = null;

    public ListNode reverseN(ListNode head, int n) {

        // 判断是不是前1个节点
        if(n == 1) {
            successor = head.next;
            return head;
        }

        ListNode last = reverseN(head, n - 1);
        head.next.next = head;
        // 第一个节点得指向后驱节点
        head.next = successor;
        return last;
    }

    public ListNode reverseBetween(ListNode head, int m, int n) {
        if(m == 1) {
            reverseN(head, n);
        }

        head.next = reverseBetween(head, m - 1, n - 1);
        return head;
    }
}
