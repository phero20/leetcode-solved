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
    public IList<int> PostorderTraversal(TreeNode root) {
        IList<int> ans = new List<int>();
        postorder(root,ans);
        return ans;
    }
    private void postorder(TreeNode root,IList<int> ans) {
        if(root==null) return;
        postorder(root.left,ans);
        postorder(root.right,ans);
        ans.Add(root.val);
    }
}
