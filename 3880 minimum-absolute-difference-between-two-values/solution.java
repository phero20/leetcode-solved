class Solution {
    public int minAbsoluteDifference(int[] nums) {
        int o = -1,t = -1,ans=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++) {
            if(nums[i]==1) o=i;
            if(nums[i]==2) t=i;
            if(o!=-1 && t!=-1) {
                ans = Math.min(ans,Math.abs(o-t));
                if (ans == 1) return 1;
            }
        }
        return (ans == Integer.MAX_VALUE) ? -1 : ans;
    }
}
