public class Solution {
    public double FindMaxAverage(int[] nums, int k) {
        long sum=0;
        for(int i=0;i<k;i++) sum+=nums[i];
        long maxv=sum;
        for(int i=k;i<nums.Length;i++) {
           sum+=nums[i];
           sum-=nums[i-k];
           maxv=Math.Max(sum,maxv);
        }
        return (double)maxv/k;
    }
}
