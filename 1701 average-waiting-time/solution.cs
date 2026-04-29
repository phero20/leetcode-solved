public class Solution {
    public double AverageWaitingTime(int[][] customers) {
        int sum = 0;
        double ans = 0;
        foreach(int[] c in customers) {
            if(c[0] > sum) {
                ans+=c[1];
                sum=c[1]+c[0];
            } else {
                sum+=c[1];
                ans+=sum-c[0];
            }
        }
        return ans/customers.Length;
    }
}
