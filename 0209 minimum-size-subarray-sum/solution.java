class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l=0,sum=0,le=Integer.MAX_VALUE;
        for(int r=0;r<nums.length;r++) {
            sum+=nums[r];
            while(sum>=target) {
                le=Math.min(r-l+1,le);
                sum-=nums[l++];
            }
        }
        return le==Integer.MAX_VALUE ? 0 : le;
    }
}
