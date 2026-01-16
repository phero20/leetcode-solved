class Solution {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int res=Integer.MAX_VALUE;
        int left=0,right=left+k-1;
        while(right<nums.length){
            int diff=nums[right++]-nums[left++];
            if(res>diff) res=diff;
        }
        return res;


    }}
