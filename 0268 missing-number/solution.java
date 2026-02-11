class Solution {
    public int missingNumber(int[] nums) {
        int l=nums.length;
        int cal=(l*(l+1))/2;
        int sum=0;
        for(int i:nums) sum+=i;
        return cal-sum;
    }
}
