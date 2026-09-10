/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    TreeNode f = null, s = null;
    TreeNode prev = new TreeNode(Integer.MIN_VALUE);
    public void recoverTree(TreeNode root) {
        dfs(root);
        int v = f.val;
        f.val = s.val;
        s.val = v;
    }

    private void dfs(TreeNode root) {
        if(root == null) return;
        dfs(root.left);
        if(root.val < prev.val) {
            if(f == null) f = prev;
            s = root;
        }
        prev = root;
        dfs(root.right);
    }
}