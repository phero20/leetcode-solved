class Solution {
    public int[] findErrorNums(int[] nums) {
        boolean pr[]=new boolean[1000007];
        int n=nums.length;
        int fsum=0,osum=n*(n+1)/2;
        for(int i:nums) fsum+=i;
        for(int i=0;i<nums.length;i++) {
            if(pr[nums[i]]) {
                return new int[]{nums[i],osum-(fsum-nums[i])};
            }
            pr[nums[i]]=true;
        }
        return new int[]{};
    }
}
