public class Solution {
    public int PivotInteger(int n) {
        int sum=n*(n+1)/2;
        int lsum=0;
        for(int i=1;i<=n;i++) {
            if(lsum==sum-lsum-i) return i;
            lsum+=i;
        }
        return -1;
    }
}
