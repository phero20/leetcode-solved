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
    public IList<int> InorderTraversal(TreeNode root) {
        IList<int> ans = new List<int>();
        inorder(root,ans);
        return ans;
    }
    private void inorder(TreeNode root,IList<int> ans) {
        if(root==null) return;
        inorder(root.left,ans);
        ans.Add(root.val);
        inorder(root.right,ans);
    }
}
