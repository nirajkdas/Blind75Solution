package com.neetcode.blind75.medium;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversal {
    public static void main(String[] args){
        TreeNode  root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        List<List<Integer>> res = levelOrder(root);
        System.out.println(res);
    }

    private static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root == null)
            return result;
        Queue<TreeNode> qu = new LinkedList<>();
        qu.add(root);
        while(!qu.isEmpty()){
            List<Integer> temp = new ArrayList<>();
            int size = qu.size();
            for(int i = 0; i < size; i++){
                TreeNode tmp = qu.poll();
                temp.add(tmp.val);
                if(tmp.left != null)
                    qu.add(tmp.left);
                if(tmp.right != null)
                    qu.add(tmp.right);
            }
            result.add(temp);
        }
        return result;
    }
}
