class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int  l=0,r=0;
        for(int i:weights) {
            l=Math.max(l,i);
            r+=i;
        }
        int res=r;
        while(l<=r) {
            int mid = l+(r-l)/3;
            if(isPos(weights,mid,days)) {
                res=mid;
                r=mid-1;
            } else {
                l=mid+1;
            }
        }
        return res;
    }

        private boolean isPos(int[] nums,int mid,int days) {
            int d=1,cr=0;
            for(int i:nums) {
                if(cr+i > mid) {
                    d++;
                    cr=0;
                }
                cr+=i;
            }
            return d<=days;
        }
}
