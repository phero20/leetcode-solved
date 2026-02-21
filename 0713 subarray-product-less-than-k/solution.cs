public class Solution {
    public int NumSubarrayProductLessThanK(int[] nums, int k) {
        int l=0,sum=0,mul=1;
        for(int r=0;r<nums.Length;r++) {
            mul*=nums[r];
            while(mul>=k && l<=r) {
                mul/=nums[l];
                l++;
            }
            sum+=r-l+1;
        }
        return sum;
    }
}
