class Solution {
    public int compareBitonicSums(int[] nums) {
        int n = nums.length;
        int peak = 0;
        for(int i=1;i<n-1;i++) {
             if (nums[i] > nums[i-1] && nums[i] > nums[i+1]) {
                peak = i;
                break;
            }
        }
        if (peak == 0) {
            peak = (nums[0] > nums[1]) ? 0 : n - 1;
        }
        long lsum =0,rsum = 0;
        for(int i=0;i<=peak;i++) lsum+=nums[i];
        for(int i=peak;i<n;i++) rsum+=nums[i];
        if(lsum > rsum) return 0;
        if(lsum < rsum) return 1;
        return -1;
    }
}
