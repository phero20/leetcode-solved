public class Solution {
    public int ShipWithinDays(int[] weights, int days) {
        int l=0,r=0;
        foreach(var i in weights) {
            l=Math.Max(l,i);
            r+=i;
        }
        int res=r;
        while(l<=r) {
            int mid = l+(r-l)/2;
            if(isPos(weights,mid,days)) {
                res=mid;
                r=mid-1;
            } else {
                l=mid+1;
            }
        }
        return res;
    }
    private bool isPos(int[] nums,int mid,int days) {
        int d=1,cr=0;
        foreach(var i in nums) {
            if(cr+i > mid) {
                d++;
                cr=0;
            }
            cr+=i;
        }
        return d<=days;
    }
}
