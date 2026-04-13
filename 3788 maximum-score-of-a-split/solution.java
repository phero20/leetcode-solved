class Solution {
    public long maximumScore(int[] nums) {
        int n = nums.length;
        int[] suffixMin = new int[nums.length];
        suffixMin[n-1] = nums[n-1];
        for(int i=n-2;i>=0;i--) {
            suffixMin[i] = Math.min(suffixMin[i+1],nums[i]);
        }
        long ans = Long.MIN_VALUE,sum=0;
        for (int i = 0; i < n - 1; i++) {
            sum += nums[i];
            ans = Math.max(ans, sum - suffixMin[i+1]);
        }
        return ans;
    }
}
