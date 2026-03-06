public class Solution {
    public int MaxProfit(int[] p) {
        int sum=0;
        for(int i=0;i<p.Length-1;i++) {
            if(p[i]<p[i+1]) sum+=p[i+1]-p[i];
        }
        return sum;
    }
}
