class Solution {
    public int maxSubArray(int[] nums) {
        int max = nums[0];
        int cmax = nums[0];
        for (int i=1;i<nums.length;i++){
            cmax = Math.max(nums[i],nums[i]+cmax);
            max = Math.max(cmax,max);
        }
        return max;
    }
}
