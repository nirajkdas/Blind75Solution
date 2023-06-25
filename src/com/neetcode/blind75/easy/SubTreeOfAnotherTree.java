package com.neetcode.blind75.easy;

public class SubTreeOfAnotherTree {
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

        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(4);
        root.right = new TreeNode(5);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(2);
        //root.left.right.left = new TreeNode(0);

        TreeNode root1 = new TreeNode(4);
        root1.left = new TreeNode(1);
        root1.right = new TreeNode(2);

        System.out.println(isSubTree(root, root1));

    }

    private static boolean isSubTree(TreeNode root, TreeNode root1) {
        if (root1 == null)
            return true;
        if (root == null)
            return false;

        if (isSubTreeHelper(root, root1))
            return true;

        return isSubTree(root.left, root1) || isSubTree(root.right, root1);
    }

    private static boolean isSubTreeHelper(TreeNode root, TreeNode root1) {
        if (root == null && root1 == null)
            return true;
        if (root == null || root1 == null) {
            return false;
        }

        return (root.val == root1.val) && isSubTreeHelper(root
                .left, root1.left) && isSubTreeHelper(root.right, root1.right);
    }
}
