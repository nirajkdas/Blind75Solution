package com.neetcode.blind75.easy;

public class MaxDepthOfBinaryTree {

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(9);

        printTree(root);
        // System.out.println(maxDepth(root));
        System.out.println("-----------------------------------");
        //printTree(root1);
        System.out.println(maxDepth(root));
    }

    private static int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int left = 0, right = 0;

        if (root.left != null) {
            left = 1 + maxDepth(root.left);
        } else {
            left = 1;
        }
        if (root.right != null) {
            right = 1 + maxDepth(root.right);
        } else {
            right = 1;
        }

        return Math.max(left, right);

    }

    private static void printTree(TreeNode root) {
        if (root == null)
            return;
        printTree(root.left);
        System.out.println(root.val);
        printTree(root.right);
    }
}
