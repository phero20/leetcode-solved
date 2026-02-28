class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int osum=n*(n+1)/2,fsum=0;
        for(int i:nums) fsum+=i;
        return osum-fsum;
    }
}
