class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] c = new int[n+1];
        boolean[] v = new boolean[n+1];
        for(int i[] : trust) {
            c[i[1]]++;
            v[i[0]] = true;
        }
        for(int i=1;i<=n;i++) {
            if(c[i] == n-1) {
                if(!v[i]) return i;
            }
        }
        return -1;
    }
}