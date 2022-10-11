package com.suanfa.tree;

/**
 * @author SHUJINGPING
 * @description  leetcode 114题
 */
public class TestFlatten {
    /**
     * 函数定义：实现对二叉树的拉平为一个链表
     * @param root
     */
    public void flatten(TreeNode root) {
        if(root == null) {
            return;
        }

        // 利用定义，把左子树和右子树弄平
        flatten(root.left);
        flatten(root.right);

        // 后续遍历位置
        // 1、左右子树已经被拉为一条链表
        TreeNode left = root.left;
        TreeNode right = root.right;

        // 2、将左子树变为右子树
        root.right = left;
        root.left = null;

        // 3、将原来的右子树连到当前右子树的末端
        TreeNode p = root;
        while(p.right != null) {
            p = p.right;
        }
        p.right = right;
    }
}
