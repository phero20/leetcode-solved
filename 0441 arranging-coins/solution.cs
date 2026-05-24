public class Solution {
    public int ArrangeCoins(int n) {
        long l=0,r=n;
        while(l<=r) {
            long m = l+(r-l)/2;
            long v=(m*(m+1))/2;
            if(v==n) return (int)m;
            if(v<n) l=m+1;
            else r=m-1;
        }
        return (int)r;
    }
}
