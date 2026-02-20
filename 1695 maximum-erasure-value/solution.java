class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        boolean set[]=new boolean[100007];
        int l=0,sum=0,max=0;
        for(int r=0;r<nums.length;r++) {
            while(set[nums[r]] && l<=r) {
                sum-=nums[l];
                set[nums[l++]]=false;
            }
            set[nums[r]]=true;
            sum+=nums[r];
            max=Math.max(sum,max);
        }
        return max;
    }
}
