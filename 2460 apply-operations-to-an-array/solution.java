class Solution {
    public int[] applyOperations(int[] nums) {
        int[] ans = new int[nums.length];
        int idx = 0;
        for(int i=0;i<nums.length-1;i++) {
            if(nums[i]==0) continue;
            if(nums[i]==nums[i+1]) {
                ans[idx++]=nums[i]*2;
                i++;
            } else {
                ans[idx++] = nums[i];
            }
        }
        if(nums[nums.length-2] != nums[nums.length-1])   
            ans[idx] = nums[nums.length-1];
        return ans; 
    }
}
