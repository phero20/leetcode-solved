class Solution {
    public int totalNQueens(int n) {
        int[] b = new int[n];
        return help(b,0,n);
    }

    private int help(int[] b,int r,int n) {
        if(r==n) {
            return 1;
        }
        int count = 0;
        for(int c = 0;c < n;c++) {
            if(isSafe(b,r,c)) {
                b[r] = c;
                count+=help(b,r+1,n);
                b[r] = 0;
            }
        }
        return count;
    }

    private boolean isSafe(int[] b,int r,int c) {
        for(int i=0;i<r;i++) {
            if(b[i] == c || Math.abs(r-i)==Math.abs(c-b[i])) {
                return false;
            }
        }
        return true;
    }
}