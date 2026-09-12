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
class CBTInserter {
    ArrayDeque<TreeNode> qu;
    TreeNode root;
    public CBTInserter(TreeNode root) {
        qu = new ArrayDeque<>();
        this.root = root;
        ArrayDeque<TreeNode> q = new ArrayDeque<>();
        q.offer(root);
        while(!q.isEmpty()) {
            int l = q.size();
            for(int i=0;i<l;i++) {
                TreeNode node = q.poll();
                if(node.left == null || node.right == null) {
                    qu.offer(node);
                }
                if(node.left!=null) q.offer(node.left);
                if(node.right!=null) q.offer(node.right);
            }
        }
    }
    
    public int insert(int val) {
        TreeNode node = qu.peek();
        TreeNode c = new TreeNode(val);
        if(node.left == null) {
            node.left = c;
        } else {
            node.right = c;
            qu.poll();
        }
        qu.offer(c);
        return node.val;
    }
    
    public TreeNode get_root() {
        return root;
    }
}

/**
 * Your CBTInserter object will be instantiated and called as such:
 * CBTInserter obj = new CBTInserter(root);
 * int param_1 = obj.insert(val);
 * TreeNode param_2 = obj.get_root();
 */