public class Solution {
    public int MinimizedMaximum(int n, int[] q) {
        int l=1,r=0;
        foreach(int i in q) r=Math.Max(r,i);
        while(l<=r) {
            int mid = l+(r-l)/2;
            if(pos(q,mid,n)) {
                r=mid-1;
            } else {
                l=mid+1;
            }
        }
        return l;
    }
    private bool pos(int[] q,int m,int n) {
        int sum = 0;
        foreach(int i in q) {
            sum+=(i+m-1)/m;
            if(sum > n) return false;
        }
        return true;
    }
}
