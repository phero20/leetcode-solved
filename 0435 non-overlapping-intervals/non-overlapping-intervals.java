class Solution {
    public int eraseOverlapIntervals(int[][] in) {
        Arrays.sort(in,(a,b) -> a[1] - b[1]);
        int[] curr = in[0];
        int ans = 0;
        for(int i = 1;i < in.length;i++) {
            if(in[i][0] < curr[1]) {
                ans++;
            } else {
                curr = in[i];
            }
        }
        return ans;
    }
}