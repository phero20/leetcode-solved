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
    int ans;
    public int maxPathSum(TreeNode root) {
        ans = root.val;
        return Math.max(dfs(root),ans);
    }

    private int dfs(TreeNode root) {
        if(root==null) return 0;
        int left = dfs(root.left);
        int right = dfs(root.right);
        int curr = left+right+root.val;
        int temp = Math.max(Math.max(left,right)+root.val,root.val);
        ans = Math.max(ans,Math.max(curr,temp));
        return temp;
    }
}