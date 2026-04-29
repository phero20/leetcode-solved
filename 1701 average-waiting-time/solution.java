class Solution {
    public double averageWaitingTime(int[][] customers) {
        int sum = 0;
        double ans = 0;
        for(int[] c:customers) {
            if(c[0] > sum) {
                ans+=c[1];
                sum=c[1]+c[0];
            } else {
                sum+=c[1];
                ans+=sum-c[0];
            }
        }
        return ans/customers.length;
    }
}
