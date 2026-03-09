class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l=1,r=0,res=0;
        for(int i:piles) r=Math.max(r,i);
        res=r;
        while(l<=r) {
            int mid=l+(r-l)/2;
            if(isPos(piles,mid,h)) {
                res=mid;
                r=mid-1;
            } else {
                l=mid+1;
            }
        }
        return res;
    }
    private boolean isPos(int[] nums,int mid,int h) {
        long sum=0;
        for(int i:nums) {
            sum+=(i+mid-1)/mid;
        }
        return sum<=h;
    }
}
