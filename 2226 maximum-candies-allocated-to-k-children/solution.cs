public class Solution {
    public int MaximumCandies(int[] candies, long k) {
        int l = 1,r = 0, ans = 0;
        foreach(int i in candies) r=Math.Max(r,i);
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
    private bool pos(int[] nums,int n,long k) {
        long c = 0;
        foreach(int i in nums) {
            c+=i/n;
        }
        return c>=k;
    }
}
