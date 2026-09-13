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
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if(depth == 1) {
            return new TreeNode(val,root,null);
        }
        dfs(root,1,depth-1,val);
        return root;
    }

    private void dfs(TreeNode root,int lvl,int depth,int val) {
        if(root == null) return;
        if(lvl == depth) {
            TreeNode l = new TreeNode(val);
            TreeNode r = new TreeNode(val);
            l.left = root.left;
            r.right = root.right;
            root.left = l;
            root.right = r;
        } else {
            dfs(root.left,lvl+1,depth,val);
            dfs(root.right,lvl+1,depth,val);
        }
    }
}