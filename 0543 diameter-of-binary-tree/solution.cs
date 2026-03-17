/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     public int val;
 *     public TreeNode left;
 *     public TreeNode right;
 *     public TreeNode(int val=0, TreeNode left=null, TreeNode right=null) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
public class Solution {
    private int max = 0;
    public int DiameterOfBinaryTree(TreeNode root) {
        height(root);
        return max;
    }
    private int height(TreeNode root) {
        if(root==null) return 0;
        int left = height(root.left);
        int right = height(root.right);
        max = Math.Max(max,left+right);
        return 1+Math.Max(left,right);
    }
}
