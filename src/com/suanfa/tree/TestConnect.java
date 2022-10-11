package com.suanfa.tree;

/**
 * @author SHUJINGPING
 * @description
 * 给定一个完美二叉树 ，其所有叶子节点都在同一层，每个父节点都有两个子节点。
 * 填充它的每个next 指针，让这个指针指向其下一个右侧节点。如果找不到下一个右侧节点，则将 next 指针设置为 NULL。
 * 初始状态下，所有next指针都被设置为 NULL。
 */
public class TestConnect {

    public Node connect(Node root) {
        if(root == null) {
            return null;
        }
        traverse(root.left, root.right);
        return root;
    }

    /**
     * 三叉树遍历框架
     * @param node1
     * @param node2
     */
    public void traverse(Node node1, Node node2) {
        if(node1 == null || node2 == null) {
            return;
        }

        // 前序位置
        // 将传入的两个节点穿起来
        node1.next = node2;

        // 连接相同父节点的两个子节点
        traverse(node1.left, node1.right);
        traverse(node2.left, node2.right);

        // 连接跨越父节点的子节点
        traverse(node1.right, node2.right);
    }
}
