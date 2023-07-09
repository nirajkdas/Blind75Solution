package com.neetcode.blind75.easy;

import com.neetcode.blind75.medium.TreeNode;
public class DuplicateTree {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);

        TreeNode root1 = new TreeNode(4);
        root1.left = new TreeNode(2);
        root1.right = new TreeNode(7);

        System.out.println(duplicateTree(root, root1));
    }

    private static boolean duplicateTree(TreeNode root, TreeNode root1) {
        if (root == null || root1 == null)
            return false;
        if (root == null && root1 == null)
            return true;

        return (root.val == root1.val) && duplicateTree(root.left, root1.left) && duplicateTree(root.right, root1.right);

    }

}
