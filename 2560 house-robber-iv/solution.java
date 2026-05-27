class Solution {
    public int minCapability(int[] nums, int k) {
        int l = Integer.MAX_VALUE,r=0,ans=0;
        for(int i:nums) {
            l=Math.min(l,i);
            r=Math.max(r,i);
        }
        while(l<=r) {
            int mid = l+(r-l)/2;
            if(pos(nums,mid,k)) {
                ans=mid;
                r=mid-1;
            } else {
                l=mid+1;
            }
        }
        return ans;
    }
    private boolean pos(int[] nums,int mid ,int k) {
        int c = 0;
        for(int i=0;i<nums.length;i++) {
            if(nums[i] <= mid) {
                c++;
                i++;
            }
        }
        return c>=k;
    }
}
