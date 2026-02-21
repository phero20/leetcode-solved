class Solution {
    public int minimumDifference(int[] nums, int k) {
       Arrays.sort(nums);
       int gap=Integer.MAX_VALUE;
       for(int i=0;i<=nums.length-k;i++)
            gap=Math.min(gap,nums[i+k-1]-nums[i]);
       return gap;
    }
}
