class Solution {
    public int splitArray(int[] nums, int k) {
        int l=0,r=0;
        for(int i:nums) {
            l=Math.max(l,i);
            r+=i;
        }
        int res = r;
        while(l<r) {
            int mid = l+(r-l)/2;
            if(isPos(nums,mid,k)) {
                r=mid;
            } else {
                l=mid+1;
            }
        }
        return l;
    }
    private boolean isPos(int[] nums,int mid,int k) {
        int ct =1;
        int sum=0;
        for(int i:nums) {
            if(i+sum > mid) {
                ct++;
                sum=i;
                if(ct > k) return false;
            } else {
                sum+=i;
            }
        }
        return true;   
    }
}
