package com.nix;

public class PathSum {
    public boolean hasPathSum(TreeNode root, int sum) {
        if(root==null) return false;
        if(root.right==null && root.left==null && sum == root.val) return true;
        return hasPathSum(root.left, sum-root.val)||hasPathSum(root.right, sum-root.val);
    }
}
