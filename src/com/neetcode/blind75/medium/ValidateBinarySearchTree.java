package com.neetcode.blind75.medium;

public class ValidateBinarySearchTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(1);
        root.right = new TreeNode(4);
        root.right.left = new TreeNode(3);
        root.right.right = new TreeNode(6);

        System.out.println(isValidBST(root));
    }

    private static boolean isValidBST(TreeNode root) {
        return isValidBSTHelper(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    public static boolean isValidBSTHelper(TreeNode root, long left, long right) {
        if (root == null)
            return true;
        if (root.val > left && root.val < right) {
            return isValidBSTHelper(root.left, left, root.val) &&
                    isValidBSTHelper(root.right, root.val, right);
        } else
            return false;

    }
}
