class Solution {
    public int waysToSplitArray(int[] nums) {
       long sum=0;
       for(int n:nums) sum+=n;
       long pr=0;
       int c=0;
       for(int i=0;i<nums.length-1;i++) {
            pr+=nums[i];
            if(pr>=sum-pr) c++;
       }
       return c;
    }
}
