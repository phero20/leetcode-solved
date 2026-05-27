class Solution {
    public int maximumCandies(int[] candies, long k) {
        int l = 1,r = 0, ans = 0;
        for(int i:candies) r=Math.max(r,i);
        while(l<=r) {
            int mid = l+(r-l)/2;
            if(pos(candies,mid,k)) {
                l=mid+1;
                ans=mid;
            } else {
                r=mid-1;
            }            
        }
        return ans;
    }
    private boolean pos(int[] nums,int n,long k) {
        long c = 0;
        for(int i:nums) {
            c+=i/n;
        }
        return c>=k;
    }
}
