class Solution {
    public boolean isCovered(int[][] ranges, int left, int right) {
        for(int s=left;s<=right;s++) {
            boolean cov=false;
            for(int[] r:ranges) {
                if(r[0]<=s && s<=r[1]) cov=true;
            }
            if(!cov) return false;
        }
        return true;
    }
}
