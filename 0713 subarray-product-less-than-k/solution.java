class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int l=0,mul=1,sum=0;
        for(int r=0;r<nums.length;r++) {
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
