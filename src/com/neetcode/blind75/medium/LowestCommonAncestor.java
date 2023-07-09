package com.neetcode.blind75.medium;

public class LowestCommonAncestor {
    public static void main(String[] args){
        TreeNode  root = new TreeNode(6);
        root.left = new TreeNode(2);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(0);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(7);
        root.right.right = new TreeNode(9);
        root.left.right.left = new TreeNode(3);
        root.left.right.right = new TreeNode(5);

        TreeNode p = new TreeNode(2);
        TreeNode q = new TreeNode(8);
        TreeNode lca = lowestCommonAncestor( root,  p,  q);
        System.out.println(lca.val);
    }

    private static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        while(root != null){
            if(root.val > p.val && root.val > q.val)
                root = root.left;
            else if(root.val < p.val && root.val < q.val)
            root = root.right;
            else
                return root;
        }
        return null;
    }
}
