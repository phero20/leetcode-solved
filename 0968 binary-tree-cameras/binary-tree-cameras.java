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
    int ans = 0;
    public int minCameraCover(TreeNode root) {
        return dfs(root) == 2 ? ans+1 : ans;
    }

    private int dfs(TreeNode root) {
        if(root == null) return 3;

        int l = dfs(root.left);
        int r = dfs(root.right);

        if(l == 2 || r == 2) {
            ans++;
            return 1;
        } else if(l == 1 || r == 1) {
            return 3;
        } 
        return 2;
    }
}