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
    List<List<String>> ans;
    public List<List<String>> printTree(TreeNode root) {
        ans = new ArrayList<>();
        int height = findHeight(root);
        int row = height;
        int col = (int)Math.pow(2,height)-1;
        for(int i=0;i<row;i++) {
            List<String> t = new ArrayList<>();
            for(int j=0;j<col;j++) {
                t.add("");
            }
            ans.add(t);
        }

        cq(root,0,col-1,0);
        return ans;
    }

    private void cq(TreeNode root,int l,int r,int lvl) {
        if(root == null) return;
        int mid = l+(r-l)/2;
        cq(root.left,l,mid-1,lvl+1);
        cq(root.right,mid+1,r,lvl+1);
        ans.get(lvl).set(mid,String.valueOf(root.val));
    }

    private int findHeight(TreeNode root) {
        if(root == null) return 0;
        int l = findHeight(root.left);
        int r = findHeight(root.right);
        return 1+Math.max(l,r);
    }
}