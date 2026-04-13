class Solution {
    public long rob(int[] nums, int[] colors) {
        int n = nums.length;
        if (n == 0) return 0;
        if (n == 1) return nums[0];
        long[] dp = new long[n];
        dp[0] = nums[0];
        for(int i=1;i<n;i++) {
            long skip = dp[i-1];
            long take;
            if(colors[i]==colors[i-1]) {
                take = nums[i] + (i>1 ? dp[i-2] : 0);
            } else {
                take = nums[i] + dp[i-1];
            }
            dp[i] = Math.max(skip, take);
        }
        return dp[n-1];
    }
}
