package com.neetcode.blind75.easy;

import com.neetcode.blind75.medium.TreeNode;

public class InvertBinaryTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(9);

        printTree(root);
        TreeNode root1 = invertTree(root);
        System.out.println("-----------------------------------");
        printTree(root1);
    }

    private static TreeNode invertTree(TreeNode root) {
        if (root == null)
            return root;

        root.left = invertTree(root.left);
        root.right = invertTree(root.right);

        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        return root;
    }

    private static void printTree(TreeNode root) {
        if (root == null)
            return;
        printTree(root.left);
        System.out.println(root.val);
        printTree(root.right);
    }
}
