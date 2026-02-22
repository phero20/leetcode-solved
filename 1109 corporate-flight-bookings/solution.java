class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int ans[]=new int[n];

        for(int row[]:bookings){
            ans[row[0]-1]+=row[2];
            if(row[1]<n)
               ans[row[1]]-=row[2];
        }
        for(int i=1;i<n;i++) {
            ans[i]+=ans[i-1];
        }
        return ans;
    }
}
