class Solution {
    static class Node {
        Node[] arr;
        String w;
        Node() {
            arr = new Node[26];
            w = null;
        }
    }

    private Node build(String[] words) {
        Node root = new Node();
        for(String s:words) {
            Node node = root;
            for(char c:s.toCharArray()) {
                if(node.arr[c-'a']==null) {
                    node.arr[c-'a'] = new Node();
                }
                node = node.arr[c-'a'];
            }
            node.w = s;
        }
        return root;
    }

    public List<String> findWords(char[][] board, String[] words) {
        List<String> ans = new ArrayList<>();
        Node root = build(words);
        for(int i=0;i<board.length;i++) {
            for(int j=0;j<board[0].length;j++) {
                dfs(board,i,j,root,ans);
            }
        }
        return ans;
    }

    private void dfs(char[][] b,int i, int j,Node node,List<String> ans) {
        if(i < 0 ||
           j < 0 ||
           i >= b.length ||
           j >= b[0].length) {
            return;
        }
        char c = b[i][j];
        if(c=='#' || node.arr[c-'a'] == null) return;
        node = node.arr[c-'a'];
        if(node.w!=null) {
            ans.add(node.w);
            node.w = null;
        }
        b[i][j] = '#';
        dfs(b,i+1,j,node,ans);
        dfs(b,i-1,j,node,ans);
        dfs(b,i,j+1,node,ans);
        dfs(b,i,j-1,node,ans);
        b[i][j] = c;
    }
}