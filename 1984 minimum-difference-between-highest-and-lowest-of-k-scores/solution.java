class Solution {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int mi = Integer.MAX_VALUE;
        int left=0,right=k-1;
        while(right<nums.length) {
            int diff = nums[right++]-nums[left++];
            if(mi>diff) mi=diff;
        }
        return mi;
    }
}
