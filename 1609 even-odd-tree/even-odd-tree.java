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
    List<Integer> ans = new ArrayList<>();
    public boolean isEvenOddTree(TreeNode root) {
        return dfs(root,0);
    }

    private boolean dfs(TreeNode root,int lvl) {
        if(root == null) {
            return true;
        }
        if(isEven(lvl) == isEven(root.val)) {
            return false;
        }
        if(lvl == ans.size()) {
            int val = isEven(lvl) ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            ans.add(val);
        }
        boolean l = dfs(root.left,lvl+1);
        if(!l) return false;
        boolean r = dfs(root.right,lvl+1);
        if(!r) return false;
        if(isEven(lvl) && ans.get(lvl) >= root.val) {
            return false;
        } else if(!isEven(lvl) && ans.get(lvl) <= root.val) {
            return false;
        }
        ans.set(lvl,root.val);
        return l && r;
    }

    private boolean isEven(int val) {
        return val % 2 == 0;
    }
}