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

    Map<Integer,Integer> map;
    int idx;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        map = new HashMap<>();
        for(int i=0;i<inorder.length;i++) {
            map.put(inorder[i],i);
        }
        idx = 0;
        return build(preorder,0,inorder.length-1);        
    }

    private TreeNode build(int[] preorder,int left,int right) {
        if(left > right) return null;
        int val = preorder[idx++];
        TreeNode node = new TreeNode(val);
        node.left = build(preorder,left,map.get(val)-1);
        node.right = build(preorder,map.get(val)+1,right);
        return node;
    }
}