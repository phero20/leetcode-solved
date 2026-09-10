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
    List<Double> sum = new ArrayList<>();
    List<Integer> count = new ArrayList<>();
    public List<Double> averageOfLevels(TreeNode root) {
        dfs(root,1);
        List<Double> ans = new ArrayList<>();
        for(int i=0;i<sum.size();i++) {
            ans.add(sum.get(i)/count.get(i));
        }
        return ans;
    }

    private void dfs(TreeNode root,int lvl) {
        if(root == null) return;
        if(lvl > sum.size()) {
            sum.add((double)root.val);
            count.add(1);
        } else {
            sum.set(lvl-1,sum.get(lvl-1)+root.val);
            count.set(lvl-1,count.get(lvl-1)+1);
        }
        dfs(root.left,lvl+1);
        dfs(root.right,lvl+1);
    }
}