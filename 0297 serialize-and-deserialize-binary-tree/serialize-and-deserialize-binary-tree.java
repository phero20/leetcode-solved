/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    
    public String serialize(TreeNode root) {
        List<String> ans = new ArrayList<>();  
        pr(root,ans);
        StringBuilder sb = new StringBuilder();
        for(String s:ans) {
            sb.append(s).append(",");
        }
        return sb.toString().substring(0,sb.length()-1);  
    }

    private void pr(TreeNode root,List<String> ans) {
        if(root==null) {
            ans.add("*");
            return;
        }
        ans.add(String.valueOf(root.val));
        pr(root.left,ans);
        pr(root.right,ans);
    }

    public TreeNode deserialize(String data) {
        String[] d = data.split(",");
        int idx[] = {0};
        return build(d,idx);
    }

    private TreeNode build(String[] d,int[] idx) {
        if(d[idx[0]].equals("*")) {
            idx[0]++;
            return null;
        }
        TreeNode node = new TreeNode(Integer.parseInt(d[idx[0]++]));
        node.left = build(d,idx);
        node.right = build(d,idx);
        return node;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));