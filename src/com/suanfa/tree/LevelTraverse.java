package com.suanfa.tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author SHUJINGPING
 * @description 层序遍历二叉树
 */
public class LevelTraverse {

    public void LevelTraverse(TreeNode root) {
        if(root == null) {
            return;
        }

        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.offer(root);
        // 从上到下遍历每一层
        while(!q.isEmpty()) {
            int sz = q.size();
            // 从左到右遍历每个子节点
            for(int i = 0; i < sz; i++) {
                TreeNode cur = q.poll();
                // 将下一层节点放入队列
                if(cur.left != null) {
                    q.offer(cur.left);
                }
                if(cur.right != null) {
                    q.offer(cur.right);
                }
            }
        }
    }
}
