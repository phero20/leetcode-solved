class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int r=0,l=0,m=Integer.MAX_VALUE,sum=0;
        while(r<nums.length) {
            sum+=nums[r];
            while(sum>=target) {
                m=Math.min(m,r-l+1);
                sum-=nums[l++];
            }
            r++;
        }
        return m==Integer.MAX_VALUE ? m=0 : m;
    }
}
