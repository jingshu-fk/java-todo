package com.suanfa.tree;

import sun.reflect.generics.tree.Tree;

/**
 * @author SHUJINGPING
 * @description 翻转二叉树
 */
public class TestInvertTree {

    public TreeNode invertTree(TreeNode root) {
        traverse(root);
        return root;
    }

    /**
     * 使用遍历的方法
     * @param root
     */
    public void traverse(TreeNode root) {
        if(root == null) {
            return;
        }
        // 前序位置
        // 每个节点要做的就是交换它的左右节点
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        traverse(root.left);
        traverse(root.right);
    }

    /**
     * 分解问题的方法
     * @param root
     * @return
     */
    public TreeNode invertTree2(TreeNode root) {
        if(root == null){
            return null;
        }
        // 利用函数定义，先翻转左、右子树
        TreeNode left = invertTree2(root.left);
        TreeNode right = invertTree2(root.right);

        // 然后交换它的左右节点
        root.left = right;
        root.right = left;

        return root;
    }

}
