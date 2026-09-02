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
    public int rob(TreeNode root) {
        int[] num = dfs(root);
        return Math.max(num[0],num[1]);
    }

    private int[] dfs(TreeNode root) {
        if(root==null) {
            return new int[]{0,0};
        }
        int[] left = dfs(root.left);
        int[] right = dfs(root.right);
        return new int[]{left[1]+right[1]+root.val,
        Math.max(left[0],left[1])+Math.max(right[0],right[1])};
    }
}