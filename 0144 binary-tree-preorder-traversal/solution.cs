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
    public IList<int> PreorderTraversal(TreeNode root) {
        IList<int> ans = new List<int>();
        preorder(root,ans);
        return ans;
    }
    private void preorder(TreeNode root,IList<int> ans) {
        if(root==null) return;
        ans.Add(root.val);
        preorder(root.left,ans);
        preorder(root.right,ans);
    }
}
