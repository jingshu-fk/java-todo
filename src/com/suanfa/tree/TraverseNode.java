package com.suanfa.tree;

import java.util.LinkedList;
import java.util.List;

/**
 * @author SHUJINGPING
 * @description 前序遍历二叉树的方法
 */
public class TraverseNode {
    List<Integer> res = new LinkedList<Integer>();

    public List<Integer> preorderTraverse(TreeNode root) {
        traverse(root);
        return res;
    }

    public void traverse(TreeNode root) {
        if(root == null) {
            return;
        }

        res.add(root.val);
        traverse(root.left);
        traverse(root.right);
    }

    public List<Integer> preorderTraverse2(TreeNode root) {
        if(root == null) {
            return res;
        }

        res.add(root.val);
        preorderTraverse2(root.left);
        preorderTraverse2(root.right);

        return res;
    }
}
