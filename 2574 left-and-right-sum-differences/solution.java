class Solution {
    public int[] leftRightDifference(int[] nums) {
        int lsum=0,rsum=0;
        for(int i:nums) rsum+=i;
        for(int i=0;i<nums.length;i++) {
            int l=nums[i];
            rsum-=nums[i];
            nums[i]=Math.abs(lsum-rsum);
            lsum+=l;
        }
        return nums;
    }
}
