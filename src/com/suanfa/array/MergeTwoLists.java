package com.suanfa.array;

/**
 * @author SHUJINGPING
 * @description 合并两个有序链表
 * 将两个升序链表合并为一个新的升序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的
 */
public class MergeTwoLists {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(-1), p = dummy;
        ListNode p1 = l1, p2 = l2;

        while(p1 != null && p2 != null) {
            //比较p1和p2的指针，较小的指针连接到p指针
            if(p1.val > p2.val) {
                p.next = p2;
                p2 = p2.next;
            }else {
                p.next = p1;
                p1 = p1.next;
            }
            // p指针不断前进
            p = p.next;
        }
        if(p1.next != null) {
            p.next = p1;
        }
        if(p2.next != null) {
            p.next = p2;
        }
        return dummy.next;
    }
}
