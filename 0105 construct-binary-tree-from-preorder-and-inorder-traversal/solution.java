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
    private int idx = 0;
    private Map<Integer,Integer> map;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        map = new HashMap<>();
        for(int i=0;i<inorder.length;i++) {
            map.put(inorder[i],i);
        }
        return construct(preorder,0,inorder.length-1);
    }

    private TreeNode construct(int[] preorder,int left,int right) {
        if(left > right) return null;
        int val = preorder[idx++];
        TreeNode node = new TreeNode(val);
        node.left = construct(preorder,left,map.get(val)-1);
        node.right = construct(preorder, map.get(val) + 1, right);
        return node;
    }
}
