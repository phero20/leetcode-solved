class Solution {
    public int[] findDegrees(int[][] matrix) {
        int n = matrix.length;
        int[] ans = new int[n];
        for(int i=0;i<n;i++) {
            for(int j:matrix[i]) {
                if(j==1) ans[i]++;
            }
        }
        return ans;
    }
}
