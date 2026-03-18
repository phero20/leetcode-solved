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
    public IList<IList<int>> LevelOrder(TreeNode root) {
        IList<IList<int>> ans = new List<IList<int>>();
        if (root == null) return ans;
        LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
        queue.AddLast(root);
        while(queue.Count > 0) {
            int qsize = queue.Count;
            IList<int> ians = new List<int>();
            for(int i=0;i<qsize;i++) {
                TreeNode curr = queue.First.Value;
                queue.RemoveFirst();
                if(curr.left!=null) queue.AddLast(curr.left);
                if(curr.right!=null)  queue.AddLast(curr.right);
                ians.Add(curr.val);
            }
            ans.Add(ians);
        }
        return ans;
    }
}
