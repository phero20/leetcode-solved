public class Solution {
    public long RepairCars(int[] ranks, int cars) {
        long l=1,r=101;
        foreach(int i in ranks) r=Math.Min(r,i);
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
    private bool pos(int[] nums,long mid,int c) {
        long sum = 0;
        foreach(int i in nums) {
            sum += (long)Math.Sqrt((double)mid / i);
        }
        return sum>=c;
    }
}
