class Solution {
    public long repairCars(int[] ranks, int cars) {
        long l=1,r=Integer.MAX_VALUE;
        for(int i:ranks) r=Math.min(r,i);
        r=(long)r*cars*cars;
        while(l<r) {
            long mid = l+(r-l)/2;
            if(pos(ranks,mid,cars)) {
                r=mid;
            } else {
                l=mid+1;
            }
        }
        return l;
    }
    private boolean pos(int[] nums,long mid,int c) {
        long sum = 0;
        for(int i:nums) {
            sum += (long)Math.sqrt((double)mid / i);
        }
        return sum>=c;
    }
}
