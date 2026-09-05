class Solution {
    List<List<String>> ans;
    public List<List<String>> solveNQueens(int n) {
        int[] b = new int[n];
        ans = new ArrayList<>();
        help(b,n,0);
        return ans;
    }

    private void help(int[] b,int n,int r) {
        if(r == n) {
            add(b,n);
            return;
        }
        for(int c = 0;c < n;c++) {
            if(isSafe(b,r,c)) {
                b[r] = c;
                help(b,n,r+1);
                b[r] = 0;
            }
        }
    }

    private boolean isSafe(int[] b,int r,int c) {
        for(int i=0;i<r;i++) {
            if(b[i]==c || Math.abs(c - b[i])==Math.abs(r-i)) {
                return false;
            } 
        }
        return true;
    }

    private void add(int[] b,int n) {
        List<String> li = new ArrayList<>();
        for(int i:b) {
            StringBuilder sb = new StringBuilder();
            for(int c = 0;c < n;c++) {
                if(c==i) {
                    sb.append('Q');
                } else {
                    sb.append('.');
                }
            }
            li.add(sb.toString());
        }
        ans.add(li);
    }
}