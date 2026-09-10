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
    HashMap<Integer,Integer> map = new HashMap<>();
    int max = 0;
    List<Integer> ans = new ArrayList<>();
    public int[] findFrequentTreeSum(TreeNode root) {
        dfs(root);
        int[] arr = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            arr[i] = ans.get(i);
        }
        return arr;
    }

    private int dfs(TreeNode root) {
        if(root == null) return 0;
        int sum = dfs(root.left)+dfs(root.right)+root.val;
        int fr = map.getOrDefault(sum,0)+1;
        map.put(sum,fr);
        if(fr > max) {
            ans.clear();
            max = fr;
        } 
        if(fr == max) {
            ans.add(sum);
        }
        return sum;
    }
}