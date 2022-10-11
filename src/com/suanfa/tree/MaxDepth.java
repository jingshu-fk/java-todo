package com.suanfa.tree;


/**
 * @author SHUJINGPING
 * @description 求一个二叉树的最大深度
 */

public class MaxDepth {
    // 记录二叉树的最大深度
    int res = 0;
    // 记录遍历到的节点的深度
    int depth = 0;


    public int maxDepth(TreeNode root) {
        traverse(root);
        return res;
    }

    /**
     * // 1 通过遍历一遍二叉树
     * @param root
     */
    public void traverse(TreeNode root) {
        if(root == null) {
            // 到达了叶子节点，更新最大深度
            res = Math.max(res, depth);
        }

        // 前序位置
        depth++;
        traverse(root.left);
        traverse(root.right);
        // 后序位置
        depth--;
    }

    /**
     * // 2 通过分解问题
     * @param root
     * @return int
     */
    public int maxDepth2(TreeNode root) {
        // 算出左右子树的最大深度，然后得出二叉树的最大深度
        if(root == null) {
            return 0;
        }

        int leftMax = maxDepth2(root.left);
        int rightMax = maxDepth2(root.right);
        return Math.max(leftMax, rightMax) + 1;
    }
}
